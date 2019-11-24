package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.BankDetail;
import com.lti.model.UserDetail;
import com.lti.services.BankDetailService;
import com.lti.services.UserService;

@Controller
public class BankDetailController 
{
	
	@Autowired
	BankDetailService bdService;
	@Autowired
	UserService uService;
	
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
		 ud=uService.findUserById(userId);
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
	

}
