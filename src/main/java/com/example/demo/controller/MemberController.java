package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.Userservice;

@CrossOrigin("*")
@RestController
public class MemberController {
	@Autowired
	private Userservice userService;

	@GetMapping("/table")
	public ResponseEntity<List<User>> search() {
		List<User> users = userService.table();

		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	@PostMapping(path = "/delete")
	public ResponseEntity<Object> delete(@RequestBody List<String> arr) {

		
		userService.delete(arr);

		return new ResponseEntity<Object>(arr, HttpStatus.OK);
	}

	@PostMapping(path = "/regi")
	public ResponseEntity<Object> regist(@RequestBody User user) {
		System.out.println(user);

		userService.add(user);

		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	@PostMapping(path = "/edit")
	public ResponseEntity<Object> edit(@RequestBody User user) {
		System.out.println(user);
		
		userService.edit(user);
		
		return new ResponseEntity<Object>(HttpStatus.OK);
	}

}
