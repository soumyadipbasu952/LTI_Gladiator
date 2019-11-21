package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Enquiry;

@Repository("enquiryRepository")
public class EnquiryRepositoryImpl implements EnquiryRepository
{
	@PersistenceContext
	EntityManager em;
	
	
	@Override
	public Enquiry addEnquiry(Enquiry e) 
	{
		em.persist(e);
		return e;
	
	}

}
