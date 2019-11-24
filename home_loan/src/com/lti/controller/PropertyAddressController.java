//package com.lti.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.lti.model.PropertyAddress;
//import com.lti.model.Salaried;
//import com.lti.model.UserDetail;
//import com.lti.services.PropertyAddressService;
//import com.lti.services.UserService;
//
//@Controller
//public class PropertyAddressController 
//{
//	@Autowired
//	PropertyAddressService propertyAddressService;
//	@Autowired
//	UserService userService;
//	
//	@RequestMapping(value="/addPropertyAddress", method=RequestMethod.POST)
//	public ModelAndView addPropertyAddress(@RequestParam String address1,@RequestParam String address2,@RequestParam String landMark,@RequestParam String city,@RequestParam String state, @RequestParam int pin,@RequestParam String userId)
//	{
//		 PropertyAddress pa=new PropertyAddress();
//		 
//		pa.setAddress1(address1);
//		pa.setAddress2(address2);
//		pa.setLandMark(landMark);
//		pa.setCity(city);
//		pa.setState(state);
//		pa.setPin(pin);
//	 
//		 UserDetail ud = new UserDetail();
//		 ud=userService.findUserById(userId);
//		pa.setUserDetail(ud);
//		
//		 
//		 PropertyAddress pa1=propertyAddressService.addPropertyAddress(pa);
//		
//		ModelAndView model = null;
//		if(pa1==null)
//		{
//			model= new ModelAndView("propertyAddressNotAdded");
//		}
//		else
//		{
//			model= new ModelAndView("propertyAddressAdded");
//			model.addObject("user",pa1);
//		}
//		return model;
//		
//	}
//
//}
