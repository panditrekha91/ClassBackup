package edu.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.entity.Contact;
import edu.institute.repo.ContactRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class ContactController {

	@Autowired
	private ContactRepo repo;
	
	@PostMapping("/contact/create")
	public String saveContact(@RequestBody Contact contact) {
		repo.save(contact);
		return "Contact Created Successfully...";
	}
	
}
