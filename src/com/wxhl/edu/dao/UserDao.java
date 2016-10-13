package com.wxhl.edu.dao;

import java.util.List;

import com.wxhl.edu.entity.User;

public interface UserDao {
	public void save(User user);
	public void delete(Integer id);
	public void update(User user);
	public User getById(Integer id);
	public List<User> getAll();
}
