package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.controller.UserController;
import com.example.repository.UserRepository;

@Configuration
@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class ExampleApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}

}
