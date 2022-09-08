package edu.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import edu.institute.bean.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
}
