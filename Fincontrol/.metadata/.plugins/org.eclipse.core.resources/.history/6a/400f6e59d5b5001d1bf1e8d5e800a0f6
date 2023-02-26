package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.app.pojos.User;
import com.app.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userservices;
	
	@GetMapping
	public List<User>getAllUser(){
		return userservices.getAllUsers();
	}
	
	@PostMapping
	User addUser(@RequestBody User user) {
		return userservices.addUser(user);
	}
	
	@DeleteMapping("/{id}")
	String deleteUser(@PathVariable Long id) {
		return userservices.deleteUser(id);
	}
	
	@PutMapping
	User updateUser(@RequestBody User updateuser) {
	return userservices.updateUser(updateuser);
	}

}
