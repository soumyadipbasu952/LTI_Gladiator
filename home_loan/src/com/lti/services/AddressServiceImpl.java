package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Address;
import com.lti.repository.AddressRepository;


@Service("addressService")
public class AddressServiceImpl implements AddressService{
	
	
	@Autowired
	AddressRepository repository;

	@Override
	public Address addAddress(Address ad) {
		
		return repository.addAddress(ad);
	}

}
