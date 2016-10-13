package com.wxhl.edu.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wxhl.edu.dao.UserDao;
import com.wxhl.edu.entity.User;

public class UserDaoImpl implements UserDao {
	private SessionFactory  sessionFactory;
	private Session session;
	private Transaction transaction;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void init(){
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
	}
	public void destory(){
		transaction.commit();
		session.close();
	}
	@Override
	public void save(User user) {
		this.init();
		session.save(user);
		this.destory();
	}

	@Override
	public void delete(Integer id) {
		this.init();
		User user=session.get(User.class, id);
		session.delete(user);
		this.destory();
	}

	@Override
	public void update(User user) {
		this.init();
		session.update(user);
		this.destory();
	}

	@Override
	public User getById(Integer id) {
		this.init();
		User u=session.get(User.class, id);
		this.destory();
		return u;
	}

	@Override
	public List<User> getAll() {
		this.init();
		List<User> userList=session.createQuery("FROM User ").list();
		this.destory();
		return userList;
	}

}
