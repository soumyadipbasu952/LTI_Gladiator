package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class ApplicationRequestRepositoryImpl 
{	@PersistenceContext
	EntityManager em;
	

}
