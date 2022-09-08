package edu.institute.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeModel {
	
	@Autowired  // DI process
	private AddressModel add;
	
	public EmployeeModel() {
		System.out.println("EmployeeModel Object created...");
	}
}
