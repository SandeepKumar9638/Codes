package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/OneToOne")
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
				
	}
	@GetMapping("fetchAll")
	public List<User> fetchAllUsers() {
		return userService.fetchAll();
				
	}
	@GetMapping("fetch/{id}")
	public User fetchById(@PathVariable Long id) {
		return userService.fetchById(id);
	
}
	@GetMapping("fetchAll1")
	public List<UserInfo> fetchAllUserInfo() {
		return userService.fetchAllUserInfo();
				
	}//fetchAllUserInfo
	          
}

