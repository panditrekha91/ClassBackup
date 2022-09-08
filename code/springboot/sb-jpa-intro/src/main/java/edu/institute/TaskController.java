package edu.institute;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import edu.institute.bean.Task;
import edu.institute.repository.TaskRepository;

@RestController
public class TaskController {

	@Autowired
	private TaskRepository repository;
	
	@PostMapping("/create-task") // HTTP POST method
	public String save(@RequestBody Task task) {
		repository.save(task); // to insert or update the single record
		return "Task Created Successfully";
	}
	
	
	@DeleteMapping("/delete-task/{id}")
	public String deleteTask(@PathVariable int id) {
		repository.deleteById(id); // to delete the single record by Id
		return "Task Deleted Successfully..";
	}
	
		
	@PutMapping("/update-task")
	public String updateTask(@RequestBody Task task) {
		repository.save(task); // to insert or update the single record
		return "Data Updated successfully...";
	}
	
	
	@GetMapping("/get-by-id/{id}") // Path variable
	public Task getTaskById(@PathVariable int id) {
		return repository.findById(id).get(); // to get the single record by ID. 
	}
	
}
