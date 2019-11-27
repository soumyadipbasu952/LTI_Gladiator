package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.ApplicationRequest;
import com.lti.model.Salaried;
import com.lti.model.UserDetail;

@Repository
public class ApplicationRequestRepositoryImpl implements ApplicationRequestRepository 
{	
	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public ApplicationRequest addRequest(ApplicationRequest ar)
	{
		ar=em.merge(ar);
		em.persist(ar);
		return ar;
	}
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
		
//	SELECT * FROM COUNTRIES c WHERE 
//	EXISTS (
//	        SELECT 'found' FROM PORTS p 
//	        WHERE p.COUNTRY_ID = c.COUNTRY_ID AND STATE = 'A'
//	) 

}
