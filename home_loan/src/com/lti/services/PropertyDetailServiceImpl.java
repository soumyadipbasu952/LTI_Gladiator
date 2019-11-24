package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.PropertyDetail;
import com.lti.repository.PropertyDetailRepository;

@Service("propertyDetailService")
public class PropertyDetailServiceImpl implements PropertyDetailService 
{	
		@Autowired
		PropertyDetailRepository propertyRepository;
		
		@Override
		public PropertyDetail addProperty(PropertyDetail pd)
		{
			return propertyRepository.addProperty(pd);
		}
		

}
