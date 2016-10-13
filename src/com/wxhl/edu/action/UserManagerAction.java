package com.wxhl.edu.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.wxhl.edu.entity.User;
import com.wxhl.edu.service.UserService;
public class UserManagerAction extends ActionSupport implements ModelDriven<User> {
	private static final long serialVersionUID = 5768251204712113657L;
	private User user; 
	private UserService  userService;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser() {
		return user;
	}
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	public String add(){
		return "Add";
	}
	public String update(){
		System.out.println(user);
		System.out.println(userService.getUserById(user.getUserId()));
		ServletActionContext.getRequest().setAttribute("user", userService.getUserById(user.getUserId()));
		return "Update";
	}
	public String delete(){
		userService.deleteUser(user.getUserId());
		ServletActionContext.getRequest().setAttribute("userList", userService.getAllUser());
		return "Delete";
	}
	public String list(){
		ServletActionContext.getRequest().setAttribute("userList", userService.getAllUser());
		return "list";
	}
	/*
	 * 保存用户信息的方法
	 * **/
	public String save(){
		userService.saveUser(user);
		ServletActionContext.getRequest().setAttribute("userList",userService.getAllUser());
		return "save";
	}
	@Override
	public User getModel() {
		user=new User();
		return user;
	}
	/*
	 * 更新用户的方法  updateUser
	 * **/
	public String updateUser(){
		userService.updateUser(user);
		ServletActionContext.getRequest().setAttribute("userList",userService.getAllUser());
		return "updateUser";
	}
}
