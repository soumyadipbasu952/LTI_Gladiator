//package com.lti.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.lti.model.Enquiry;
//import com.lti.repository.EnquiryRepository;
//
//@Service("enquiryService")
//public class EnquiryServiceImpl implements EnquiryService
//{
//	@Autowired
//	EnquiryRepository enquiryRepository;
//
//	@Override
//	@Transactional
//	public Enquiry addEnquiry(Enquiry e) 
//	{
//		Enquiry e1=new Enquiry();
//		double estimatedAmt=12*e.getTenures()*(e.getSalary()-(e.getSalary()*0.1)-e.getCostOfLiving()-e.getCurrentEmi());
//		if(estimatedAmt>=e.getRequiredAmt())
//		{
//			 if(e.getTenures()<=e.getRetirementAge())
//			 {
//				 System.out.println("Loan Granted");
//				 e1=e;
//				 return enquiryRepository.addEnquiry(e1);
//			 }
//		}
//		else
//		{
//			 System.out.println("Loan Rejected");
//			 return null;
//		}
//		e1.setEstimatedAmt(estimatedAmt);
//		return e1;
//		
//	}
//	
//	
//}

