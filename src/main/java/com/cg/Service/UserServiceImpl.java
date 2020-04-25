package com.cg.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Dao.UserDaoI;
import com.cg.Entity.User;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	UserDaoI userDao;
	
	@Override
	public User addUser(User u) {
		return userDao.addUser(u);
	}

	@Override
	public User findById(long userId) {
		return userDao.findById(userId);
	}

	@Override
	public List retrive() {
		return userDao.retrive();
	}

}
