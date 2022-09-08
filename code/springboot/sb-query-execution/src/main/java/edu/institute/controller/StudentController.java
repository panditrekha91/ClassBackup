package edu.institute.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import edu.institute.entity.Student;
import edu.institute.repo.StudentRepo;

@RestController
public class StudentController {

	@Autowired
	private StudentRepo repo;
	
	@PostMapping("/stduent/save")
	public String saveStudent( @RequestBody Student st) {
		repo.save(st);
		return "Studen save successfully..";
	}
	
	
	@GetMapping("/student/getbyname")
	public List<Student> getStudentsByName(@RequestParam String name) {
		//return repo.studentListByName_HQL(name);
		return repo.studentListByName_SQL(name);
	}

	
	@PutMapping("/student/update")
	public String updateStudent( @RequestBody Student st) {
		repo.updateEmail(st.getId(), st.getEmail());
		return "Data Updated successfully..";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
