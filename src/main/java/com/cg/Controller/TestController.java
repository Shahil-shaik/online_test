package com.cg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Entity.Test;
import com.cg.Service.TestServiceI;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TestController {
	@Autowired
	TestServiceI testService;
	
	@PostMapping(value="/test/new",consumes= {"application/json"})
	public String addTest(@RequestBody Test test) {
		testService.addTest(test);
		return "sucess";
	}
}
