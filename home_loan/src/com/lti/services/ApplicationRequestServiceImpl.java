package com.lti.services;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.ApplicationRequest;
import com.lti.model.Salaried;
import com.lti.repository.ApplicationRequestRepository;

@Service
public class ApplicationRequestServiceImpl implements ApplicationRequestService  
{


	@Autowired
	ApplicationRequestRepository applicationRepository;
	Salaried s=new Salaried();
	/*@Autowired
	SalariedService salariedService;*/
	@PersistenceContext
	EntityManager em;
	@Autowired
	UserService service;
	
	@Override
	public ApplicationRequest addRequest(ApplicationRequest ar) 
	{
		 /*String applicationId="HLS00000";
		 applicationId=applicationId.replace("HLS","");
		 int x=Integer.parseInt(applicationId);
		 x=x+1;
		 ar.setApplicationId("");
		 if(x>=1&&x<=9)
		 {

			 ar.setApplicationId("HWS0000"+x);
		 }
		 else if(x>=10&&x<=99)	
		 {
			 ar.setApplicationId("HWS000"+x);
		 }
		 else if(x>=100&&x<=999)
		 {
			 ar.setApplicationId("HLS00"+x);
		 }
		 else if(x>=1000&&x<=9999)
		 {
			 ar.setApplicationId("HLS0"+x);
		 }
		 else if(x>=10000&&x<=99999)
		 {
			 ar.setApplicationId("HLS"+x);
		 }
				 
		 String jpql = "Select MAX(a.applicationId) from ApplicationRequest a";
			TypedQuery<ApplicationRequest> tquery = em.createQuery(jpql, ApplicationRequest.class);
			tquery.setParameter("applicationId", applicationId);
			if (tquery.getResultList().size() != 0) 
			{
				tquery.getSingleResult();
				x=Integer.parseInt(applicationId);
				x++;
				ar.setApplicationId("HWS0000"+x);
				System.out.println("correct");
			} 
			else 
			{
				System.out.println("Error");	
			}*/
			
		 return applicationRepository.addRequest(ar);
		

	}
	
	/*@Override
	public Salaried apply(String userId)
	{
		
		return applicationRepository.apply(userId);
	}*/


}
