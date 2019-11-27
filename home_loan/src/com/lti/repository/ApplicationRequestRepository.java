package com.lti.repository;

import javax.transaction.Transactional;

import com.lti.model.ApplicationRequest;

public interface ApplicationRequestRepository {

	ApplicationRequest addRequest(ApplicationRequest ar);
	/*@Override
	@Transactional
	public Salaried apply(String userId)
	{	
		 Salaried s;
			String jpql = "Select s from Salaried s where s.userDetail= UserDetail u.UserId";
			TypedQuery<Salaried> tquery = em.createQuery(jpql, Salaried.class);
			tquery.setParameter("userId", userId);
			if (tquery.getResultList().size() != 0) {
				s = tquery.getSingleResult();
				System.out.println("correct");
				return s;
			} else 
				{
				System.out.println("Error");
				return null;
				}
				
	
			
		}*/

}