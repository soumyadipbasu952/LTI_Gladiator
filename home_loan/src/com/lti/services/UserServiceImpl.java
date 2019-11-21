package com.lti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.UserDetail;
import com.lti.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	public UserServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	UserRepository repository;

	@Override
	public UserDetail addUser(UserDetail ud) 
	{
		return repository.addUser(ud);
		
	}

	@Override
	public void updateUser(String userId) 
	{
		repository.updateUser(userId);	
	}

	@Override
	public void deleteUser(String userId) 
	{
		repository.deleteUser(userId);		
	}

	@Override
	public UserDetail findUserById(String userId)
	{
		repository.findUserById(userId);
		return null;
	}

	@Override
	public List<UserDetail> findAllUsers() 
	{
		return null;
	}

}
