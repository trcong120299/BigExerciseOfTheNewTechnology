package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	public User create(String name, String phoneNumber, String email, String gender, String address, String password, int role) {
		return userRepository.save(new User(name, phoneNumber, email, gender, address, password, role));
	}
	
	@SuppressWarnings("static-access")
	public User create(User user) {
		user.setId(sequenceGeneratorService.generateSequence(user.SEQUENCE_NAME));
		return userRepository.save(user);
	}
	
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
	
	public User getUserByName(String name) {
		return userRepository.findUserByName(name);
	}
	
	public User update(String name, String phoneNumber, String email, String gender, String address, String password) {
		User u = userRepository.findUserByName(name);
		u.setAddress(address);
		u.setEmail(email);
		u.setGender(gender);
		u.setPassword(password);
		u.setPhoneNumber(phoneNumber);
		return userRepository.save(u);
	}
	
	public void delete(String name) {
		userRepository.delete(userRepository.findUserByName(name));
	}
}
