package com.cg.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.Entity.Test;
import com.cg.Entity.User;

@Repository
public interface UserDaoI {
	public User addUser(User u);
	public List retrive();
	public User findUserById(long userId);
	public Test findTestById(long testId);
	public String assignTest(long userId,long testId);
	
	
	
	
}
