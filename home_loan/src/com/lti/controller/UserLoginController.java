package com.lti.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.lti.model.UserDetail;
import com.lti.services.UserLoginService;

@Controller
public class UserLoginController {
	
	@Autowired
	UserLoginService service;
	
	//@Autowired
	//private UserDetail user;
	HttpSession session;
	
	
	
	@RequestMapping(path = "/UserLogin", method = RequestMethod.POST)
	public String login(HttpServletRequest request, HttpServletResponse response,
			@RequestParam("userId") String userId, @RequestParam("password") String password, Model model) {

		UserDetail user=new UserDetail();
		 
		
//		password=user.getPassword();

	 user = service.UserLogin(userId, password);
	
		 
				//password=user.getPassword();
		
		if(user !=null){
					session = request.getSession(true);
					userId= user.getUserId();
					session.setAttribute("userId", userId);
					return "welcomeUser";

				} 
		
			else{
				return "LoginFailed";
			} 


			
		}
	
	
	@RequestMapping(path="logout" , method= RequestMethod.GET)
	public String userLogout(HttpServletResponse response, HttpServletRequest request){
	  session = request.getSession(false);
		if(session != null)
		{
			session.invalidate();
		}
		return "userLoggedOut";
	}
 
	}
	
	


