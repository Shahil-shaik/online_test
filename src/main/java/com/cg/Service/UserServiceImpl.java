package com.cg.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Dao.UserDaoI;
import com.cg.Entity.Test;
import com.cg.Entity.User;
import com.cg.Exception.EntryMismatchError;
import com.cg.Exception.EntryNotFoundException;

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
		User obj =userDao.findUserById(userId);
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
		User obj=userDao.findUserById(userId);
		if(obj ==null) {
			throw new EntryNotFoundException("Wrong UserId /User doesn't exist");
		}
		if(obj.getUserPassword().equals(password) && obj.isAdmin()==false) {
			return 1;
		}
		else if(obj.getUserPassword().equals(password) && obj.isAdmin()==true) {
			return 2;
		}
		else {
			throw new EntryMismatchError("Incorrect Password");
		}
	}



	@Override
	public String registerService(long userId, String password, String userName) {
		User obj = new User(userId,userName,password,false,null);
		userDao.addUser(obj);
		return "sucess";
	}

	@Override
	public String assignTest(long userId, long testId) {
		User obj1=userDao.findUserById(userId);
		if(obj1==null) {
			throw new EntryNotFoundException("User Not Found");
		}
		Test obj2=userDao.findTestById(testId);
		if(obj2==null) {
			throw new EntryNotFoundException("Test not found exception");
		}
		obj1.setUserTest(obj2);
		return "sucess";
		//return userDao.assignTest(userId, testId);
	}

}
