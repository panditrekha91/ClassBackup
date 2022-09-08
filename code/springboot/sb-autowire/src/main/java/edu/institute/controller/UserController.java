package edu.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.institute.repository.UserRepository;

@Component
public class UserController {

	@Autowired
	private UserRepository repo;
	
	public void saveUser() {
		repo.saveData();
		
		System.out.println("saveUser from the Controller....");
	}
	
}
