package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.entity.User;
import com.institute.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository repository;
	
	//save User Details
	@PostMapping("/user/save")
	public User saveUser(@RequestBody User user) {
		return repository.save(user);
		
	}
	
	//Update User Details
	@PutMapping("/user/update")
	public User updateUser(@RequestBody User user) {
		return repository.save(user);
	}
	
	//Get User Details
	@GetMapping("/user/get-all")
	public List<User> getUserDetails(){
		return repository.findAll();
	}
	
	
}
