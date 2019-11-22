package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Salaried;
import com.lti.model.UserDetail;

@Repository("salariedRepository")
public class SalariedRepositporyImpl implements SalariedRepository
{
	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public Salaried addSalaried(Salaried s) 
	{
		s=em.merge(s);
		em.persist(s);
		return s;
		
	}

}
