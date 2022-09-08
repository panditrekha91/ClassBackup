package edu.institute;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.institute.controller.EmployeeController;
import edu.institute.entity.Employee;

@SpringBootTest
public class EmployeeControllerTest {
	@Autowired
	private EmployeeController controller;
	
	@Test
	void testForSaveEmployee() {
		Employee emp = new Employee();
		emp.setName("test1");
		emp.setEmail("test1@gmail.com");
		emp.setSalary(111.11);
		emp.setGender("male");
		String result = controller.saveEmp(emp);
		assertEquals("Employee Save Failed", result);
	}
}
