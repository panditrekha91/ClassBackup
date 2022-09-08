package edu.institute.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.institute.controller.UserController;
import edu.institute.repository.UserRepository;

@Component
public class UserModel {

	@Autowired
	UserRepository repo;
	
	@Autowired
	UserController ctrl;
	
}
