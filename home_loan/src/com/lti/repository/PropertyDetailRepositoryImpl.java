package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.PropertyDetail;

@Repository("propertyDetailRepository")
public class PropertyDetailRepositoryImpl implements PropertyDetailRepository
{

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public PropertyDetail addProperty(PropertyDetail pd)
	{
		pd=em.merge(pd);
		em.persist(pd);
		return pd;
	}
}
