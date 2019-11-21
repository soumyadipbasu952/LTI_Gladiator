package com.lti.services;

import java.util.List;

import com.lti.model.UserDetail;

public interface UserService {
	
	public UserDetail addUser(UserDetail ud);
	public void updateUser(String userId);
	public void deleteUser(String userId);
	public UserDetail findUserById(String userId);
	//public UserDetail findUserByEmail(String email);
	public List<UserDetail> findAllUsers();


}
