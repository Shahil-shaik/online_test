package com.cg.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.Entity.Test;

@Repository
public interface TestDaoI {
	public Test addTest(Test t);
	public Test findById(long testId);
	public List retrive();
	public String assignTest(long userId,long testId);
}
