package com.lti.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.ApplicationRequest;
import com.lti.model.Salaried;
import com.lti.model.UserDetail;
import com.lti.services.ApplicationRequestService;
import com.lti.services.SalariedService;
import com.lti.services.SelfEmployedBusinessService;
import com.lti.services.UserService;

@Controller
public class ApplicationRequestController
{
	@Autowired
	ApplicationRequestService applicationRequestService;
	@Autowired
	SalariedService salariedService;
	@Autowired
	SelfEmployedBusinessService selfEmployedBusinessService;
	@Autowired
	UserService service;
	
	@RequestMapping(value="/addRequest", method=RequestMethod.POST)
	public ModelAndView addRequest(@RequestParam String userId, HttpSession session)
	{
		Double requiredAmt=(Double)session.getAttribute("requiredAmt");
		//System.out.println(requiredAmt.intValue());
		int tenure=(Integer)session.getAttribute("tenure");
		//System.out.println(tenure);
		Double estimatedAmt=(Double)session.getAttribute("estimatedAmt");
		//System.out.println(estimatedAmt);
		boolean status=(Boolean)session.getAttribute("status");
		//System.out.println(status);
		//System.out.println(userId);
		
		//System.out.println(requiredAmt.intValue());
		ApplicationRequest ar=new ApplicationRequest();
		//ApplicationRequest ar1=new ApplicationRequest();
		

		//Salaried s=new Salaried();
		UserDetail ud = new UserDetail();
		 ud=service.findUserById(userId);
		 ar.setAmtRequired(requiredAmt.intValue());
		 ar.setTenureYear(tenure);
		 ar.setAmtGrantable(estimatedAmt.intValue());
		 if(status==true)
		 {
			 ar.setComputerApproval("Approved");
		 }
		 else
		 {
			 ar.setComputerApproval("Not Approved");
		 }
		 
		
		 String adminApproval;
		 ar.setAdminApproval("Pending");
		 ar.setStatus("Pending");
		
		 ar.setUserDetail(ud);	
		ApplicationRequest ar1=applicationRequestService.addRequest(ar);
		  int applicationId=ar1.getApplicationId();
		 System.out.println(applicationId);
		ar1.setApplicationId(applicationId);
		 System.out.println(userId);

		ModelAndView model = null;
		if(ar1==null)
		{
			model= new ModelAndView("ApplicationRequestNotGenereted");
		}
		else
		{
			model= new ModelAndView("ApplicationRequestGenereted");
			model.addObject("user",ar1);
		}
		return model;
//		return null;
	}
	
			
}
