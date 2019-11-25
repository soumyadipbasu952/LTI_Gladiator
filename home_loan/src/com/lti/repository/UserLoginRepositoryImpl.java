package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.UserDetail;

@Repository
public class UserLoginRepositoryImpl implements UserLoginRepository {
	@PersistenceContext
	private EntityManager em;

@Override
@Transactional
public UserDetail UserLogin(String userId, String password) {
		
		UserDetail user;
		String jpql = "Select u from UserDetail u where u.userId=:userId and u.password=:password";
		TypedQuery<UserDetail> tquery = em.createQuery(jpql, UserDetail.class);
		tquery.setParameter("userId", userId);
		tquery.setParameter("password", password);
		if (tquery.getResultList().size() != 0) {
			user = tquery.getSingleResult();
			return user;
		} else 
			return null;

	}
	
	
}
