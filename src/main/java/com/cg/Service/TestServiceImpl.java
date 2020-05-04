package com.cg.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Dao.TestDaoI;
import com.cg.Dao.UserDaoI;
import com.cg.Entity.Test;

@Service
public class TestServiceImpl implements TestServiceI{

	@Autowired
	TestDaoI testDao;
	
	@Override
	public Test addTest(Test t) {
		return testDao.addTest(t);
	}

	@Override
	public Test findById(long testId) {
		return testDao.findById(testId);
	}

}
