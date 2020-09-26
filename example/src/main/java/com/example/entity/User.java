package com.example.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";

	@Id
	private long id;
	
	private String name;
	
	private String phoneNumber;
	
	private String email;
	
	private String gender;
	
	private String address;
	
	private String password;
	
	private int role;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public User(long id, String name, String phoneNumber, String email, String gender, String address, String password,
			int role) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.password = password;
		this.role = role;
	}

	public User(String name, String phoneNumber, String email, String gender, String address, String password,
			int role) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.gender = gender;
		this.address = address;
		this.password = password;
		this.role = role;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", gender="
				+ gender + ", address=" + address + ", password=" + password + ", role=" + role + "]";
	}

}
