package edu.institute.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.institute.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	@Query(value = "SELECT s FROM Student s WHERE s.name= :nm") // HQL
	public List<Student> studentListByName_HQL(@Param("nm") String name);
	
	@Query(value = "SELECT * FROM studdetails s WHERE s.stud_name= :nm", nativeQuery = true) // SQL
	public List<Student> studentListByName_SQL(@Param("nm") String name);
	
	@Transactional // to automate the commit and rollback process. Use this annotation in case of DML
	@Query(value = "UPDATE Student set email= :em WHERE id= :id")
	@Modifying // use to denote Spring boot that we are updating the records from the table. Use this annotation in case of DML
	public void updateEmail(@Param("id") int id,@Param("em") String email);
	
}




