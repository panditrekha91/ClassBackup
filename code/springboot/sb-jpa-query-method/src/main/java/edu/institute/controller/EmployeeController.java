package edu.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.entity.Employee;
import edu.institute.repository.EmployeeRepo;

@RestController
public class EmployeeController {

	
	@Autowired
	private EmployeeRepo repo;
	
	@PostMapping("/emp/save")
	public String saveEmp(@RequestBody Employee emp) {
		repo.save(emp);
		return "Employee Save Successfully";
	}
	
	
	@GetMapping("/emp/getbyid")
	public Employee getById(@RequestParam int id) {
		return repo.findById(id).get();
	}
	
	@GetMapping("/emp/getby-status")
	public List<Employee> getByStatus(@RequestParam String status) {
		return repo.findBySataus(status);
	}
	
	@GetMapping("/emp/getby-gender")
	public List<Employee> getByGender(@RequestParam String gender) {
		return repo.findByGender(gender);
	}
	
	@GetMapping("/emp/getby-status-gender")
	public List<Employee> getByStatusAndGender(@RequestParam String status,@RequestParam String gender) {
		return repo.findBySatausAndGender(status, gender);
	}
	
	@GetMapping("/emp/getby-salary")
	public List<Employee> getByStatusAndGender(@RequestParam double salary) {
		return repo.findBySalaryLessThan(salary);
	}
}






