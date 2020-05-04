package com.cg.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.Entity.Test;

@Transactional
@Repository
public class TestDaoImpl implements TestDaoI{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public Test addTest(Test t) {
		em.persist(t);
		return t;
	}

	@Override
	public Test findById(long testId) {
		return em.find(Test.class, testId);
	}

}
