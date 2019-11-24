package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.SelfEmployedBusiness;
import com.lti.model.UserDetail;
import com.lti.services.SelfEmployedBusinessService;
import com.lti.services.UserService;

@Controller
public class SelfEmployedBusinessController 
{
	@Autowired
	SelfEmployedBusinessService selfEmployedBusinessService;

	@Autowired
	UserService userService;
	
	public SelfEmployedBusinessController()
	{
		
	}
	
	@RequestMapping(value="/addBusiness", method=RequestMethod.POST)
	public ModelAndView addBusiness(@RequestParam double patAsPerLatestItr,@RequestParam double depreciationLast3Avg, @RequestParam double existingEmi, @RequestParam String typeOfEmployment, @RequestParam String userId)
	{
		UserDetail ud=new UserDetail();
		SelfEmployedBusiness seb =new SelfEmployedBusiness();
		seb.setPatAsPerLatestItr(patAsPerLatestItr);
		seb.setDepreciationLast3Avg(depreciationLast3Avg);
		seb.setExistingEmi(existingEmi);
		seb.setTypeOfEmployment(typeOfEmployment);
		
		ud=userService.findUserById(userId);
		seb.setUserDetail(ud);
		SelfEmployedBusiness seb1 = selfEmployedBusinessService.addBusiness(seb);
		
		ModelAndView model = null;
		if(seb1==null)
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
}


	
	
	