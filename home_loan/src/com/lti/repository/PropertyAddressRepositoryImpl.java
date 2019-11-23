package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.PropertyAddress;

@Repository("propertyAddressRepository")
public class PropertyAddressRepositoryImpl implements PropertyAddressRepository 
{
		@PersistenceContext
		EntityManager em;
		
		@Override
		@Transactional
		public PropertyAddress addPropertyAddress(PropertyAddress pa) 
		{
			pa=em.merge(pa);
			em.persist(pa);
			return pa;
			
		}

}
