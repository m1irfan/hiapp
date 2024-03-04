package com.java.hiapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.hiapp.entity.User;
import com.java.hiapp.service.UserService;

@RestController
@RequestMapping("app")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/user")
	public ResponseEntity<?> createUser(@RequestBody User user){
		if(user!=null) {
			userService.createUser(user); // use with new object
			return new ResponseEntity<String>("User Saved!",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Invalid Data!",HttpStatus.BAD_REQUEST);
	}

	@GetMapping("users")
	public ResponseEntity<?> fetchAllUsers(){	
		List<User> users = userService.findAll();
		if(users!=null) {
			return new ResponseEntity<List<User>>(users,HttpStatus.OK); 
		}
		return new ResponseEntity<String>("No Record Found", HttpStatus.NOT_FOUND);
	}
}