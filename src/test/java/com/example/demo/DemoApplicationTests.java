package com.example.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.User;
import com.example.demo.repository.Userrepository;
import com.example.demo.service.Userservice;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private Userrepository userRepository;

	@Autowired
	private Userservice userService;

	@Test
	void contextLoads() {
		List<User> users = userRepository.findAll();
		users.set(0, null);

		
	}

}
