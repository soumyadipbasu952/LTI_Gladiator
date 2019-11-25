package com.lti.services;

import com.lti.model.UserDetail;

public interface UserLoginService {

	UserDetail UserLogin(String userId, String password);

}