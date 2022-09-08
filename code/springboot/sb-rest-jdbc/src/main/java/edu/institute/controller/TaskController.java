package edu.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.institute.bean.Task;
import edu.institute.service.TaskService;

@RestController
public class TaskController {
	
	@Autowired
	private TaskService service;

	@PostMapping("/create-task") // HTTP POST method
	public String save(@RequestBody Task task) {
		service.save(task);
		return "Task Created Successfully";
	}
	
	
	@GetMapping("/get-all-task") // HTTP GET method
	public List<Task> getAll() {
		return service.getAllTask();
	}
	
	// /get-by-status?status=Open
	@GetMapping("/get-by-status") // Request variable
	public List<Task> getTaskByStatus(@RequestParam("status") String status) {
		System.out.println("Status : " + status);
		return service.getTaskByStatus(status);
	}
	
	// /get-by-id/4/2022-08-09/Open
	/*@GetMapping("/get-by-id/{id}/{date}/{status}") // Path variable
	public List<Task> getTaskById(@PathVariable int id,@PathVariable String date,@PathVariable String st) {
		return service.getTaskById(id);
	}*/
	
	// /get-by-id/4
	@GetMapping("/get-by-id/{id}") // Path variable
	public List<Task> getTaskById(@PathVariable int id) {
		return service.getTaskById(id);
	}
	
	
	// /get-by-title?title=Open
	@GetMapping("/get-by-title") // Request variable
	public List<Task> getTaskByTitle(@RequestParam("title") String title) {
		return service.getTaskByTitle(title);
	}
		
		
	@DeleteMapping("/delete-task/{id}")
	public String deleteTask(@PathVariable int id) {
		service.deleteTask(id);
		return "Task Deleted Successfully..";
	}
		
		
		
	@PutMapping("/update-task")
	public String updateTask(@RequestBody Task task) {
		service.updateTask(task);
		return "Data Updated successfully...";
	}
		
		
		
		
		
}



















