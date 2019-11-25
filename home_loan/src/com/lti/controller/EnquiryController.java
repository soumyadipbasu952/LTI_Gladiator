//package com.lti.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.lti.model.Enquiry;
//import com.lti.services.EnquiryService;
//
//@Controller
//public class EnquiryController 
//{
//	@Autowired
//	EnquiryService enquiryService;
//	
//	@RequestMapping(value="/addEnquiry", method=RequestMethod.POST)
//	public ModelAndView addUser(@RequestParam double requiredAmt,@RequestParam double salary,@RequestParam int age,@RequestParam int retirementAge,@RequestParam double costOfLiving,@RequestParam double tenures,@RequestParam double currentEmi)
//	{
//		 Enquiry e=new Enquiry();
//		 
//		 e.setRequiredAmt(requiredAmt);
//		 e.setSalary(salary);
//		 e.setAge(age);
//		 e.setRetirementAge(retirementAge);
//		 e.setCostOfLiving(costOfLiving);
//		 e.setTenures(tenures);
//		 e.setCurrentEmi(currentEmi);
//		 
//		 
//		 //e.setEstimatedAmt(estimatedAmt);
//		 
//		
//		 
//		 Enquiry e1=enquiryService.addEnquiry(e);
//		
//		ModelAndView model = null;
//		if(e1==null)
//		{	//e1.setEstimatedAmt(estimatedAmt);
//			model= new ModelAndView("Loan_not_granted");
//		}
//		else
//		{
//			model= new ModelAndView("Loan_granted");
//			model.addObject("user",e1);
//		}
//		return model;
//		
//	}
//
//}
