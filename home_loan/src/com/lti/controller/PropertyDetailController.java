package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.PropertyDetail;
import com.lti.model.UserDetail;
import com.lti.services.PropertyDetailService;
import com.lti.services.UserService;

@Controller
public class PropertyDetailController
{
	@Autowired
	PropertyDetailService pdService;
	@Autowired
	UserService userService;
	
	
	@RequestMapping(value="/addPropertyDetails", method=RequestMethod.POST)
	public ModelAndView addSalaried(@RequestParam String propertyType,@RequestParam String propertyName,@RequestParam double estimatedAmount,@RequestParam String userId)
	{
		PropertyDetail pd=new PropertyDetail();		 
		
		 
		 pd.setPropertyType(propertyType);
		 pd.setPropertyName(propertyName);
		 pd.setEstimatedAmount(estimatedAmount);
	 
		 UserDetail ud = new UserDetail();
		 ud=userService.findUserById(userId);
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

}
