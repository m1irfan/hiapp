package com.java.hiapp.service;

import java.util.List;

import com.java.hiapp.entity.User;

public interface UserService {
	
	public void createUser(User user);
	
	public List<User> findAll();

}