package com.cg.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.Entity.Test;

@Transactional
@Repository

public class TestDaoImpl implements TestDaoI{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public  Test addTest(Test t) {
		em.persist(t);
		return t;
	}

	@Override
	public Test findById(long testId) {
		return em.find(Test.class, testId);
	}

	@Override
	public List retrive() {
		Query q=em.createQuery("from Test test");
		return q.getResultList();
	}

	@Override
	public String assignTest(long userId, long testId) {
		return null;
	}

}
