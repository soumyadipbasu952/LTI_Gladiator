package com.lti.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Address;
import com.lti.model.BankDetail;
import com.lti.model.PropertyAddress;
import com.lti.model.PropertyDetail;
import com.lti.model.Salaried;
import com.lti.model.SelfEmployedBusiness;
import com.lti.model.UserDetail;
import com.lti.services.AddressService;
import com.lti.services.BankDetailService;
import com.lti.services.PropertyAddressService;
import com.lti.services.PropertyDetailService;
import com.lti.services.SalariedService;
import com.lti.services.SelfEmployedBusinessService;
import com.lti.services.UserService;

@Controller
public class InsertController 
{	@Autowired
	UserService service;
	@Autowired
	SalariedService salariedService;
	@Autowired
	SelfEmployedBusinessService selfEmployedBusinessService;
	@Autowired
	BankDetailService bdService;
	@Autowired
	AddressService addressService;
	@Autowired
	PropertyDetailService pdService;
	@Autowired
	PropertyAddressService propertyAddressService;
	
	HttpSession session;
	
	public InsertController()
	{
		
	}
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST)
	public String addUser(HttpServletRequest request, HttpServletResponse response,
			@RequestParam String userId, @RequestParam String firstName, @RequestParam String middleName, @RequestParam String lastName, 
			@RequestParam String emailId, @RequestParam String password, @RequestParam String phoneno, @RequestParam String dob, @RequestParam String gender, @RequestParam String residentType,
			@RequestParam long aadharNumber, @RequestParam String panNumber, Model model) 
	
	{
		

		UserDetail u1= new UserDetail();

		u1.setUserId(userId);
		u1.setFirstName(firstName);
		u1.setMiddleName(middleName);
		u1.setLastName(lastName);
		u1.setEmailId(emailId);
		u1.setPassword(password);
		u1.setPhoneno(phoneno);
		u1.setDob(dob);
		u1.setGender(gender);
		u1.setResidentType(residentType);
		u1.setAadharNumber(aadharNumber);
		u1.setPanNumber(panNumber);
		
		
		UserDetail u2 = service.addUser(u1);
		if(u2 !=null){
			session = request.getSession(true);
			userId= u2.getUserId();
			session.setAttribute("userId", userId);
			return "UserAdded";

		} 

	else{
		return "UserNotAdded";
	} 

//		ModelAndView model = null;
//		if(u2==null)
//		{
//			model= new ModelAndView("UserNotAdded");
//		}
//		else
//		{
//			model= new ModelAndView("UserAdded");
//			model.addObject("user",u2);
//
//		}
//		return model;
//		
	}
	
	@RequestMapping(value="/addSalaried", method=RequestMethod.POST)
	public ModelAndView addSalaried(@RequestParam double netAmtSalary,
			@RequestParam double existingEmi,
			@RequestParam int retirementAge,
			@RequestParam String organizationType,
			@RequestParam String employerName,
			@RequestParam double requiredAmt,
			@RequestParam String typeOfEmployment, 
			@RequestParam int age,
			@RequestParam double costOfLiving,
			@RequestParam int tenure,
			@RequestParam String userId, HttpSession session)
		{
		 Salaried s=new Salaried();
		 UserDetail ud = new UserDetail();
		 ud=service.findUserById(userId);
		 
		
		 s.setNetAmtSalary(netAmtSalary);
		 s.setExistingEmi(existingEmi);
		 s.setRetirementAge(retirementAge);
		 s.setOrganizationType(organizationType);
		 s.setEmployerName(employerName);
		 s.setTypeOfEmployment(typeOfEmployment);
		 s.setAge(age);
		 s.setRequiredAmt(requiredAmt);
		 s.setCostOfLiving(costOfLiving);
		 s.setTenure(tenure);
		
		
		
		System.out.println(userId);
		s.setUserDetail(ud);	
		 
		 Salaried s1=salariedService.addSalaried(s);
//		session.setAttribute("requiredAmt", requiredAmt);
//		double estimatedAmt=s1.getEstimatedAmt();
//		session.setAttribute("estimatedAmt", estimatedAmt);
//		boolean status=s1.isStatus();
//		session.setAttribute("stauts", status);


		ModelAndView model = null;
		if(s1.isStatus()==false)
		{
			model= new ModelAndView("loanNotGranted");
			session.setAttribute("requiredAmt", requiredAmt);
			double estimatedAmt=s1.getEstimatedAmt();
			session.setAttribute("estimatedAmt", estimatedAmt);
			boolean status=s1.isStatus();
			session.setAttribute("stauts", status);
			model.addObject("user1",s);
		}
		else
		{
			model= new ModelAndView("loanGranted");
			model.addObject("user",s1);
		}
		return model;
		
	}
	
	@RequestMapping(value="/addBusiness", method=RequestMethod.POST)
	public ModelAndView addBusiness(@RequestParam double patAsPerLatestItr,
			@RequestParam double depreciationLast3Avg,
			@RequestParam double existingEmi,
			@RequestParam String typeOfEmployment,
			@RequestParam double requiredAmt,
			@RequestParam int tenure,
			@RequestParam double costOfLiving,
			@RequestParam String userId)
	{
		UserDetail ud=new UserDetail();
		SelfEmployedBusiness seb =new SelfEmployedBusiness();
		seb.setPatAsPerLatestItr(patAsPerLatestItr);
		seb.setDepreciationLast3Avg(depreciationLast3Avg);
		seb.setExistingEmi(existingEmi);
		seb.setTypeOfEmployment(typeOfEmployment);
		seb.setCostOfLiving(costOfLiving);
		seb.setRequiredAmt(requiredAmt);
		seb.setTenure(tenure);
		
		ud=service.findUserById(userId);
		seb.setUserDetail(ud);
		SelfEmployedBusiness seb1 = selfEmployedBusinessService.addBusiness(seb);
		
		ModelAndView model = null;
		if(seb1.isStatus()==false)
		{
			model= new ModelAndView("IncomeNotAdded");
		}
		else
		{
			model= new ModelAndView("IncomeAdded");
			model.addObject("user",seb1);
		}
		return model;
	}
	
	@RequestMapping(value="/addBankDetail", method=RequestMethod.POST)
	public ModelAndView addBankDetail(@RequestParam String bankName,@RequestParam String ifsc,@RequestParam String accountHolderName,@RequestParam String accountType,@RequestParam int accountNumber,@RequestParam String userId)
	{
		 BankDetail bk=new BankDetail();
		 
		
		 bk.setBankName(bankName);
		 bk.setIfsc(ifsc);
		 bk.setAccountHolderName(accountHolderName);
		 bk.setAccountType(accountType);
		 bk.setAccountNumber(accountNumber);
	
	 
		 UserDetail ud = new UserDetail();
		 ud=service.findUserById(userId);
		 bk.setUserDetail(ud);
		
		 
		 BankDetail bk1=bdService.addBankDetail(bk);
		
		ModelAndView model = null;
		if(bk1==null)
		{
			model= new ModelAndView("BankDetailNotAdded");
		}
		else
		{
			model= new ModelAndView("BankDetailAdded");
			model.addObject("user",bk1);
		}
		return model;
		
	}
	
	@RequestMapping(value="/insertAddress" ,method =RequestMethod.POST)
	public ModelAndView addAddress(@RequestParam String userId, @RequestParam String address1,@RequestParam String address2,@RequestParam String landMark,@RequestParam String state, @RequestParam  String city,@RequestParam int pin)
	{
		Address ad = new Address();
		ad.setAddress1(address1);
		ad.setAddress2(address2);
		ad.setLandMark(landMark);
		ad.setCity(city);
		ad.setPin(pin);
		ad.setState(state);
		
		UserDetail ud = new UserDetail();
		ud=service.findUserById(userId);
		ad.setUserDetail(ud);
		
		Address ad1 = addressService.addAddress(ad);
		
		ModelAndView model = null;
		if(ad1==null)
		{
			model= new ModelAndView("addressAddedFailed");
		}
		else
		{
			model= new ModelAndView("addressAdded");
			model.addObject("user",ad1);
		}
		return model;	
	}
	
	@RequestMapping(value="/addPropertyDetails", method=RequestMethod.POST)
	public ModelAndView addSalaried(@RequestParam String propertyType,@RequestParam String propertyName,@RequestParam double estimatedAmount,@RequestParam String userId)
	{
		PropertyDetail pd=new PropertyDetail();		 
		
		 
		 pd.setPropertyType(propertyType);
		 pd.setPropertyName(propertyName);
		 pd.setEstimatedAmount(estimatedAmount);
	 
		 UserDetail ud = new UserDetail();
		 ud=service.findUserById(userId);
		 pd.setUserDetail(ud);
		
		 
		 PropertyDetail pd1=pdService.addProperty(pd);
		
		ModelAndView model = null;
		if(pd1==null)
		{
			model= new ModelAndView("propertyDetailNotAdded");
		}
		else
		{
			model= new ModelAndView("propertyDetailAdded");
			model.addObject("user",pd1);
		}
		return model;
		
	}

	
	@RequestMapping(value="/addPropertyAddress", method=RequestMethod.POST)
	public ModelAndView addPropertyAddress(@RequestParam String address1,@RequestParam String address2,@RequestParam String landMark,@RequestParam String city,@RequestParam String state, @RequestParam int pin,@RequestParam String userId)
	{
		 PropertyAddress pa=new PropertyAddress();
		 
		pa.setAddress1(address1);
		pa.setAddress2(address2);
		pa.setLandMark(landMark);
		pa.setCity(city);
		pa.setState(state);
		pa.setPin(pin);
	 
		 UserDetail ud = new UserDetail();
		 ud=service.findUserById(userId);
		pa.setUserDetail(ud);
		
		 
		 PropertyAddress pa1=propertyAddressService.addPropertyAddress(pa);
		
		ModelAndView model = null;
		if(pa1==null)
		{
			model= new ModelAndView("propertyAddressNotAdded");
		}
		else
		{
			model= new ModelAndView("propertyAddressAdded");
			model.addObject("user",pa1);
		}
		return model;
		
	}

	
	

}
