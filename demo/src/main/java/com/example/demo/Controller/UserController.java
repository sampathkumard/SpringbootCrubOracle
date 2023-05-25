package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.UserModel;
import com.example.demo.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	@PostMapping("/show")
	public UserModel createUser(@RequestBody UserModel user){
		return userService.createUser(user);
		
	}
	@GetMapping("/show")
	public List<UserModel> getUserList(){
		return userService.getUserList();
	}

	@GetMapping("/show/{id}")
	public UserModel getUserById(@PathVariable("id") Integer userId){
		return userService.getUserById(userId);
	}

	@DeleteMapping("/show/{id}")

	public String deleteByUserId(@PathVariable("id") Integer userId){
		 userService.deleteByUserId(userId);
		 return "User Deleted";
	}
}
