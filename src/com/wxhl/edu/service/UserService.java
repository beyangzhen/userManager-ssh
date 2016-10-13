package com.wxhl.edu.service;

import java.util.List;
import java.util.Map;

import com.wxhl.edu.entity.User;

public interface UserService {
	public void saveUser(User user);
	public void deleteUser(Integer id);
	public void updateUser(User user);
	public User getUserById(Integer id);
	public List<User> getAllUser();
}
