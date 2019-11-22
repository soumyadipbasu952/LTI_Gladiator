package com.lti.repository;

import org.springframework.stereotype.Repository;

import com.lti.model.Salaried;
import com.lti.model.UserDetail;

@Repository("salariedRepository")
public interface SalariedRepository {
	
	public Salaried addSalaried(Salaried s);
	/*public void updateUser(String userId);
	public void deleteUser(String userId);
	public UserDetail findUserById(String userId);
	//public UserDetail findUserByEmail(String email);
	public List<UserDetail> findAllUsers();
*/
}
