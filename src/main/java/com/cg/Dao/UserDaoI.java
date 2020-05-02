package com.cg.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.Entity.User;

@Repository
public interface UserDaoI {
	public User addUser(User u);
	public List retrive();
	public User findById(long userId);
	
	
	public int validateLogin(long userId,String password);
	
	//public User loginDetails(String name);
	
	
	
	
}
