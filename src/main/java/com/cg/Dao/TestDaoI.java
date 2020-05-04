package com.cg.Dao;

import org.springframework.stereotype.Repository;

import com.cg.Entity.Test;

@Repository
public interface TestDaoI {
	public Test addTest(Test t);
	public Test findById(long testId);
}
