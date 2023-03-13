package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.Userrepository;

@Service
public class Userservice {
	@Autowired
	private Userrepository userRepository;
	public List<User> table() {
		List<User>users = userRepository.findAll();
		return users;
	}
}
