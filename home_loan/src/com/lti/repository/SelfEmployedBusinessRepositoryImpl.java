package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.SelfEmployedBusiness;

@Repository("selfEmployedRepository")
public class SelfEmployedBusinessRepositoryImpl implements SelfEmployedBusinessRepository
{
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	@Override
	public SelfEmployedBusiness addBusiness(SelfEmployedBusiness seb) 
	{
		seb=em.merge(seb);
		em.persist(seb);
		return seb;
	}

}
