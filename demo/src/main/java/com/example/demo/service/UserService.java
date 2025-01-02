package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.entity.UserInfo;
import com.example.demo.repo.UserInfoRepositry;
import com.example.demo.repo.UserRepositry;

@Service
public class UserService {
	@Autowired
	private UserRepositry userRepositry;
	@Autowired
	private UserInfoRepositry userInfoRepositry;
	
	public User saveUser(User user) {
		return userRepositry.save(user);
	}
	
	public List<User> fetchAll(){
		return userRepositry.findAll();
	}
	public List<UserInfo> fetchAllUserInfo(){
		return userInfoRepositry.findAll();
	}
	public User fetchById(long id){
		return userRepositry.findById(id).orElse(null);
	}
	}
	


