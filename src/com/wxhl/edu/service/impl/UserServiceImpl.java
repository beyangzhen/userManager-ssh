package com.wxhl.edu.service.impl;

import java.util.List;
import java.util.Map;

import com.wxhl.edu.dao.UserDao;
import com.wxhl.edu.entity.User;
import com.wxhl.edu.service.UserService;
public class UserServiceImpl implements UserService {
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		userDao.delete(id);

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.update(user);

	}

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		return userDao.getById(id);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAll();
	}

}
