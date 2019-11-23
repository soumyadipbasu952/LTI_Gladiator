package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.PropertyAddress;
import com.lti.repository.PropertyAddressRepository;

@Service("propertyAddressService")
public class PropertyAddressServiceImpl implements PropertyAddressService 
{
		@Autowired
		PropertyAddressRepository propertyAddressRepository;
		
	
		@Override
		public PropertyAddress addPropertyAddress(PropertyAddress pa) 
		{
			
			
			return propertyAddressRepository.addPropertyAddress(pa);
		}

	}



