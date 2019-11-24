package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.UserDetail;

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository 
{
@PersistenceContext
	EntityManager em;
	

	
	@Override
	@Transactional
	public UserDetail addUser(UserDetail ud)
	{
		ud=em.merge(ud);
		em.persist(ud);
		return ud;
	}


	@Transactional
	@Override
	public void updateUser(String userId) 
	{
		/*UserDetail ud=em.find(UserDetail.class, userId);
		ud.setEmailId(ud.getEmailId());*/
		
		
		
		/*String q="update u from UserDetails set ?,?,?,?,?,?,?,?,?,?,?,? where u.userId=?";
		TypedQuery<UserDetail> query = em.createQuery(q, UserDetail.class);
		query.setParameter(13, userId);
		UserDetail u=query.getSingleResult();
		em.merge(u);
		String query="UPDATE UserDetail u SET u.userId =?,u.firstName=?, u.middleName=?,u.lastName=?,u.emailId=?,u.password=?,u.phoneno=?,u.dob=?,u.gender=?,u.residentType=?,u.aadharNumber=?,u.panNumber=? where userId=?";
		em.createQuery(query);
		query.setParameter(13, userId); 
		em.executeUpdate();*/
		
	}



	@Override
	@Transactional
	public void deleteUser(String userId)
	{
		UserDetail u=em.find(UserDetail.class, userId);
		em.merge(u);
		em.remove(u);
	}



	@Override
	@Transactional
	public UserDetail findUserById(String userId)
	{	
		UserDetail u=em.find(UserDetail.class, new String (userId));
		
		return u;
	}



	@Override
	public List<UserDetail> findAllUsers() 
	{
		return null;
	}

	
}


