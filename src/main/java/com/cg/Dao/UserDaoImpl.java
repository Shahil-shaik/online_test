package com.cg.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

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
	public User findById(long userId) {
		return em.find(User.class, userId);
	}
	
	
	public int validateLogin(long userId,String password)
	{
	     User passList = em.find(User.class, userId);
		
		if(passList.getUserPassword().equals(password) && passList.isAdmin()==false )
		{	
			return 1;
		}
		else if(passList.getUserPassword().equals(password) && passList.isAdmin()==true )
		{	
			return 2;
		}
		else
		{
			return 0;
		}
		
	
	
	
//	
//	public User loginDetails(String name)
//	{
//	User login = em.find(User.class,name);
//	return login;
//		
//	}
	
	
	

}
}
