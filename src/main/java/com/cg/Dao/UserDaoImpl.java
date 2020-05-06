package com.cg.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.Entity.Test;
import com.cg.Entity.User;

@Transactional
@Repository

public class UserDaoImpl implements UserDaoI{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public User addUser(User u) {
		em.persist(u);
		return u;
	}

	@Override
	public List retrive() {
		Query q=em.createQuery("from User user");
		return q.getResultList();
	}

	
	@Override
	public Test findTestById(long testId) {
		return em.find(Test.class, testId);
	}
	
//	public int validateLogin(long userId,String password)
//	{
//	     User passList = em.find(User.class, userId);
//		
//		if(passList.getUserPassword().equals(password) && passList.isAdmin()==false )
//		{	
//			return 1;
//		}
//		else if(passList.getUserPassword().equals(password) && passList.isAdmin()==true )
//		{	
//			return 2;
//		}
//		else
//		{
//			return 0;
//		}
//		
//	
//	
//	
////	
////	public User loginDetails(String name)
////	{
////	User login = em.find(User.class,name);
////	return login;
////		
////	}
//	
//	
//	
//
//}

	@Override
	public String assignTest(long userId, long testId) {
		User obj=em.find(User.class, userId);
		Test obj1=em.find(Test.class,testId);
		if(obj!=null && obj1!=null)
		{
			obj.setUserTest(obj1);
			return "sucess";
		}
		return "fail";
	}

	@Override
	public User findUserById(long userId) {
		return em.find(User.class, userId);
	}
}
