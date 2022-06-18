package com.institute.controller;

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

import com.institute.entity.Task;
import com.institute.entity.User;
import com.institute.repository.TaskRepository;

@RestController
public class TaskController {

	@Autowired
	TaskRepository repository;
	
	//Add User Task
	@PostMapping("/task/save")
	public Task saveTask(@RequestBody Task task) {
		return repository.save(task);
	}
	
	//Update Task Details
	@PutMapping("/task/update")
	public Task udateTask(@RequestBody Task task) {
		return repository.save(task);
	}
	
	//Update Task status by ID Use HQL
	@PutMapping("/task/update/{id}/{status}")
	public String updateTaskStatus(@PathVariable("id") int id,@PathVariable("status") String status) {
		repository.updateTaskStatus(id,status);
		return "Task Status Updated";
	}
	
	//Get Task by task ID 
	@GetMapping("/task/task-by-id")
	public Task getTaskByTaskId(@RequestParam("id") int id) {
		return repository.getTaskByTaskId(id);
	}
	
	//Get List of tasks by User Id
	@GetMapping("/task/task-by-user")
	public List<Task> getTaskByUserId(@RequestParam("uid") User uid) {
		return repository.getTaskByUserId(uid);
	}
	
	//Get list of tasks by status and user Id (All task for user by status)
	@GetMapping("/task/task-by-status")
	public List<Task> getTaskByStatusAndUserId(@RequestParam User uid, @RequestParam String status){
		return repository.getTaskByStatusAndUserId(uid,status);
	}
	
	
	//Delete Task by ID
	@DeleteMapping("/task/delete-by-id/{id}")
	public String deleteTaskById(@PathVariable("id") int id) {
		 repository.deleteById(id);
		return "Task Deleted Successfully";
	}

}
