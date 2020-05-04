package com.cg.Service;

import org.springframework.stereotype.Service;

import com.cg.Entity.Test;

@Service
public interface TestServiceI {
	public Test addTest(Test t);
	public Test findById(long testId);
}
