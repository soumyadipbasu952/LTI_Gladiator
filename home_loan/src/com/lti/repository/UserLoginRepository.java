package com.lti.repository;

import com.lti.model.UserDetail;

public interface UserLoginRepository {

	UserDetail UserLogin(String userId, String password);

}