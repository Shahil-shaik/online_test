package com.cg;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.Dao.TestDaoImpl;
import com.cg.Dao.UserDaoI;
import com.cg.Entity.Test;
import com.cg.Entity.User;
import com.cg.Service.TestServiceI;
import com.cg.Service.UserServiceI;

@SpringBootApplication
public class OnlineTestApplication implements CommandLineRunner{

	@Autowired
	UserServiceI obj;
	
	public static void main(String[] args) {
		SpringApplication.run(OnlineTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User obkj = new User(11615915,"shahil","12345",true,1101);
//		userDao.addUser(obj);
//		System.out.println("done");
//		List<User>userList=userDao.retrive();
//		for(User u:userList) {
//			System.out.println(u.getUserId()+" "+u.getUserName()+" ");
//		}  
		System.out.println(obj.assignTest(11615915, 1103));
	}

}
