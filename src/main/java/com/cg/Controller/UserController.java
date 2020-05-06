package com.cg.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Dao.UserDaoI;
import com.cg.Entity.User;
import com.cg.Service.UserServiceI;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {
	
	@Autowired
	UserServiceI userService;
	
	@GetMapping(value="/user")
	public List<User> fetchUser() {
		return userService.retrive();
	}
	
	@GetMapping(value="/user/{userId}")
	public User fetchUserById( @PathVariable long userId) {
		return userService.findById(userId);
	}
	
	@PostMapping(value="/SignUp",consumes= {"application/json"})
	public String addUser(@RequestBody User user) {
		userService.addUser(user);
		return "sucess";
	}
	
	@GetMapping("/User/validate/{userId}/{password}")
	public int validateLogin(@PathVariable long userId,@PathVariable String password)
	{
		return userService.validateLogin(userId, password);
	}
	@GetMapping("/test/assignTest/{userId}/{testId}")
	public String assignTest(@PathVariable long userId,@PathVariable long testId) {
		return userService.assignTest(userId,testId);
	}
}
