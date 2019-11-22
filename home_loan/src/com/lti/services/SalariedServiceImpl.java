package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Salaried;
import com.lti.model.UserDetail;
import com.lti.repository.SalariedRepository;

@Service("salariedService")
public class SalariedServiceImpl implements SalariedService
{

	@Autowired
	SalariedRepository salariedRepository;
	
	@Override
	public Salaried addSalaried(Salaried s) 
	{
		
		
		return salariedRepository.addSalaried(s);
	}

}
