package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Address;
import com.lti.model.UserDetail;
import com.lti.services.AddressService;
import com.lti.services.UserService;

@Controller
public class AddressController 
{
	
	@Autowired
	AddressService addressService;
	@Autowired
	UserService userService;
	
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
		ud=userService.findUserById(userId);
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
	
	
}




