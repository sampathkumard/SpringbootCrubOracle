package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.UserModel;

public interface UserService {

	public UserModel createUser(UserModel user);

  public List<UserModel> getUserList();

	public UserModel getUserById(Integer userId);

	public void deleteByUserId(Integer userId);

}
