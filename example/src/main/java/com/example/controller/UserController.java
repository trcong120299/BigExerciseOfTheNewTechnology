package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.SequenceGeneratorService;
import com.example.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	@RequestMapping("/getAllUser")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@RequestMapping("/get")
	public User getUser(@RequestParam String name) {
		return userService.getUserByName(name);
	}
	
	@RequestMapping("/create")
	public String create(@RequestParam String name, 
			@RequestParam String phoneNumber, 
			@RequestParam String email,
			@RequestParam String gender, 
			@RequestParam String address, 
			@RequestParam String password, 
			@RequestParam int role) {
		User u = userService.create(name, phoneNumber, email, gender, address, password, role);
		return u.toString();
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam String name, 
			@RequestParam String phoneNumber, 
			@RequestParam String email,
			@RequestParam String gender, 
			@RequestParam String address, 
			@RequestParam String password) {
		User u = userService.update(name, phoneNumber, email, gender, address, password);
		return u.toString();
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String name) {
		userService.delete(name);
		return "Delete success";
	}
	
}
