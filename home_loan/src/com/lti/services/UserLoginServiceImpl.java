package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.UserDetail;
import com.lti.repository.UserLoginRepository;

@Service
public class UserLoginServiceImpl implements UserLoginService {
	
	@Autowired
	private UserLoginRepository repository;
	
	@Override
	@Transactional
	public UserDetail UserLogin(String userId, String password) {
		return repository.UserLogin(userId, password);
		
	}

}
