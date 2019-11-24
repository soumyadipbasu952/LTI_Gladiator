package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.BankDetail;
import com.lti.repository.BankDetailRepository;

@Service("bankDetailService")
public class BankDetailServiceImpl implements BankDetailService {
	
	@Autowired
	BankDetailRepository repository;
	
	@Override
	public BankDetail addBankDetail(BankDetail bk)
	{
		return repository.addBankDetail(bk);
	}

}
