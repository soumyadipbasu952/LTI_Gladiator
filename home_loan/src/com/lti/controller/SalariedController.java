//package com.lti.controller;
//
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.lti.model.Salaried;
//import com.lti.model.UserDetail;
//import com.lti.services.SalariedService;
//import com.lti.services.UserService;
//
//@Controller
//@WebServlet
//public class SalariedController 
//{
//	@Autowired
//	SalariedService salariedService;
//	@Autowired
//	UserService userService;
////	HttpServletRequest request;
////	HttpServletResponse response;
//	
//	
//	@RequestMapping(value="/addSalaried", method=RequestMethod.POST)
//	public ModelAndView addSalaried(@RequestParam double netAmtSalary,@RequestParam double existingEmi,@RequestParam int retirementAge,@RequestParam String organizationType,@RequestParam String employerName,@RequestParam String typeOfEmployment, @RequestParam String userId)
//	{
//		 Salaried s=new Salaried();
//		 UserDetail ud = new UserDetail();
////		 HttpSession session=request.getSession();
////		request.getAttribute("user", ud.getUserId());	
//		 ud=userService.findUserById(userId);
//		 
//		// String userId;
//		 s.setNetAmtSalary(netAmtSalary);
//		 s.setExistingEmi(existingEmi);
//		 s.setRetirementAge(retirementAge);
//		 s.setOrganizationType(organizationType);
//		 s.setEmployerName(employerName);
//		 s.setTypeOfEmployment(typeOfEmployment);
//		
//		
//		System.out.println(userId);
//		s.setUserDetail(ud);	
//		 
//		 Salaried s1=salariedService.addSalaried(s);
//		
//		ModelAndView model = null;
//		if(s1==null)
//		{
//			model= new ModelAndView("IncomeNotAdded");
//		}
//		else
//		{
//			model= new ModelAndView("IncomeAdded");
//			model.addObject("user",s1);
//		}
//		return model;
//		
//	}
//	
//	/*@PostMapping("/dologin")
//	   public String doLogin(@ModelAttribute("user") UserDetail user, Model model)
//	{
//		 Salaried s=new Salaried();
//		 s.setNetAmtSalary(netAmtSalary);
//		 s.setExistingEmi(existingEmi);
//		 s.setRetirementAge(retirementAge);
//		 s.setOrganizationType(organizationType);
//		 s.setEmployerName(employerName);
//		 s.setTypeOfEmployment(typeOfEmployment);
//		
//	      // Implement your business logic
//	     /* if (user.getEmail().equals("nzartab@gmail.com") && user.getPassword().equals("abc@123")) {
//	         // Set user dummy data
//	         user.setUserId(userId);
//	         
//	      } else {
//	         model.addAttribute("message", "Login failed. Try again.");
//	         return "index";
//	      }
//	      return "success";
//	   }
//*/
//}
