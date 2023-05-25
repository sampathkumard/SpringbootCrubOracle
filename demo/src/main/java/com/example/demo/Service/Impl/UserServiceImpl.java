package com.example.demo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.UserModel;
import com.example.demo.Repository.UserRepo;
import com.example.demo.Service.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	@Override
	public UserModel createUser(UserModel user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}
	@Override
	public List<UserModel> getUserList() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	@Override
	public UserModel getUserById(Integer userId) {
		return userRepo.findById(userId).get();
	}
	@Override
	public void deleteByUserId(Integer userId) {
		 userRepo.deleteById(userId);
	}

}
