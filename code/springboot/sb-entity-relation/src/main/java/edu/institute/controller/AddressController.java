package edu.institute.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.entity.Address;
import edu.institute.repo.AddressRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class AddressController {

	@Autowired
	private AddressRepo repo;
	
	@PostMapping("/address/create")
	public String saveAddress(@RequestBody Address address) {
		repo.save(address);
		return "Address Created Successfully...";
	}
	
	@GetMapping("/address/get-by-id")
	public Address  getAddress(@RequestParam("id") int id) {
		return repo.findById(id).get();
	}
	
}
