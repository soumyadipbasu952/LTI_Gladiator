package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Salaried;
import com.lti.model.UserDetail;
import com.lti.services.SalariedService;
import com.lti.services.UserService;

@Controller
public class SalariedController
{

	@Autowired
	SalariedService salariedService;
	@Autowired
	UserService userService;
	
	
	@RequestMapping(value="/addSalaried", method=RequestMethod.POST)
	public ModelAndView addSalaried(@RequestParam double netAmtSalary,@RequestParam double existingEmi,@RequestParam int retirementAge,@RequestParam String organizationType,@RequestParam String employerName,@RequestParam String typeOfEmployment, @RequestParam String userId)
	{
		 Salaried s=new Salaried();
		 
		 UserDetail ud = new UserDetail();
		 
		
		 
		 s.setNetAmtSalary(netAmtSalary);
		 s.setExistingEmi(existingEmi);
		 s.setRetirementAge(retirementAge);
		 s.setOrganizationType(organizationType);
		 s.setEmployerName(employerName);
		 s.setTypeOfEmployment(typeOfEmployment);
	 
		ud=userService.findUserById(userId);
	
		
		 s.setUserDetail(ud);
		
		 
		 Salaried s1=salariedService.addSalaried(s);
		
		ModelAndView model = null;
		if(s1==null)
		{
			model= new ModelAndView("Loan_not_granted");
		}
		else
		{
			model= new ModelAndView("Loan_granted");
			model.addObject("user",s1);
		}
		return model;
		
	}

}
