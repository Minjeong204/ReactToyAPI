package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.Userservice;

@RestController
public class MemberController {
	@Autowired
	private Userservice userService;

	@GetMapping("/table")
	public ResponseEntity<List<User>> search() {
		List<User> users = userService.table();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

}