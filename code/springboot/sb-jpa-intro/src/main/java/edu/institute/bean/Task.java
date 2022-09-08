package edu.institute.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // to mark this class eligible for table 
public class Task {
	
	@Id // to make field as a Primary Key
	@GeneratedValue(strategy = GenerationType.AUTO) // to make PK auto increment
	@Column(name = "taskid")
	private int id;
	@Column(name = "tasktitle", length = 50, nullable = false)
	private String title;
	@Column(length = 2000)
	private String taskdesc;
	@Column(nullable = false)
	private LocalDate taskdate;
	@Column(nullable = false, length = 15)
	private String status;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTaskdesc() {
		return taskdesc;
	}
	public void setTaskdesc(String taskdesc) {
		this.taskdesc = taskdesc;
	}
	public LocalDate getTaskdate() {
		return taskdate;
	}
	public void setTaskdate(LocalDate taskdate) {
		this.taskdate = taskdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
