package com.cg.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.cg.Entity.User;

@Service
public interface UserServiceI {
	public User addUser(User u);
	public User findById(long userId);
	public List retrive();
//	public String loginService(long userId,String password);
	public int validateLogin(long userId,String password);
	
//	public User loginDetails(String name);
	
	
	public String registerService(long userId,String password,String userName);
	public String assignTest(long userId,long testId);
}
