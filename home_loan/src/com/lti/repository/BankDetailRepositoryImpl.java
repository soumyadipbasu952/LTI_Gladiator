package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.BankDetail;


@Repository("bankDetailRepository")
public class BankDetailRepositoryImpl implements BankDetailRepository {

	
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public BankDetail addBankDetail(BankDetail bk) {
		 bk = em.merge(bk);
		 em.persist(bk);
		 return bk ;
	}

}
