package edu.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.entity.User;
import edu.institute.repo.UserRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired
	private UserRepo repo;
	
	@PostMapping("/user/create")
	public String saveUser(@RequestBody User user) {
		repo.save(user);
		return "Use Created SUccessfully";
	}
	
}
