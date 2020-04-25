package com.cg.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.Entity.User;

@Service
public interface UserServiceI {
	public User addUser(User u);
	public User findById(long userId);
	public List retrive();
}
