package edu.institute.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.institute.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	public List<Employee> findBySataus(String status);
	public List<Employee> findByGender(String gen);
	public List<Employee> findBySatausAndGender(String status, String gen);
	public List<Employee> findBySalaryLessThan(double salary);
}
