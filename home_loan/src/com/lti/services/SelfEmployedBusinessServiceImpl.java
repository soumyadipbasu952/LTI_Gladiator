package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.SelfEmployedBusiness;
import com.lti.repository.SelfEmployedBusinessRepository;

@Service("selfEmployedService")
public class SelfEmployedBusinessServiceImpl implements SelfEmployedBusinessService
{
	@Autowired
	SelfEmployedBusinessRepository selfEmployedBusinessRepository;
	
	@Override
	public SelfEmployedBusiness addBusiness(SelfEmployedBusiness seb)
	{
		
		return selfEmployedBusinessRepository.addBusiness(seb);
	}

}
