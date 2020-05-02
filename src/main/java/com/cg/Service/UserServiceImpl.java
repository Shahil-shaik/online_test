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
		User obj =userDao.findById(userId);
		if(obj==null)
			throw new RuntimeException("userId not found");
		return obj;
	}

	@Override
	public List retrive() {
		return userDao.retrive();
	}

//	@Override
//	public String loginService(long userId, String password) {
//		User obj=userDao.findById(userId);
//		if(obj==null)
//			throw new RuntimeException("userId not found");
//		if(password.matches(obj.getUserPassword()))
//			return "welcome "+obj.getUserName();
//		else 
//			throw new RuntimeException("password incorrect");
//	}
	public int validateLogin(long userId,String password)
	{
		return userDao.validateLogin(userId, password);
	}



	@Override
	public String registerService(long userId, String password, String userName) {
		User obj = new User(userId,userName,password,false,null);
		userDao.addUser(obj);
		return "sucess";
	}

}
