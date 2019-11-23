package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Address;

@Repository("addressRepository")
public class AddressRepositoryImpl implements AddressRepository {

	@PersistenceContext
	EntityManager em;
	
	
	@Override
	@Transactional
	public Address addAddress(Address ad) 
	{
		
		ad=em.merge(ad);
		em.persist(ad);
		return ad;
		
	
	
	}

}
