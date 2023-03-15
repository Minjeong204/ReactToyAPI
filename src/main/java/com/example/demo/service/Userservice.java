package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.Userrepository;

import jakarta.transaction.Transactional;

@Service
public class Userservice {
	@Autowired
	private Userrepository userRepository;

	public List<User> table() {
		List<User> users = userRepository.findAll();
		return users;
	}

	@Transactional
	public void delete(List<String> arr) {
		for (int i = 0; i < arr.size(); i++) {
			User user = userRepository.findById(arr.get(i))
					.orElseThrow(() -> new IllegalArgumentException("해당 댓글이 존재하지 않습니다. id="));
			userRepository.delete(user);
		}
	}

	public User add(User user) {
		user.setRegiUser("ADMIN");
		user.setUseYn("Y");
		LocalDateTime date = LocalDateTime.now();
		user.setRegiDt(date);
		return userRepository.save(user);
	}

	public User edit(User user) {
		System.out.println(user);
		User user2 = userRepository.findById(user.getUserId())
				.orElseThrow(() -> new IllegalArgumentException("해당 사용자가 존재하지 않습니다. id=" + user.getUserId()));
		user2.setPw(user.getPw());
		user2.setName(user.getName());
		LocalDateTime date = LocalDateTime.now();
		user2.setUpdaDt(date);
		user2.setUpdaUser("USER");
		return userRepository.save(user2);
	}
}
