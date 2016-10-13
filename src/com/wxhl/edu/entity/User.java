package com.wxhl.edu.entity;

public class User {
	private String userName;
	private Integer age;
	private String no;
	private String class_grade;
	private Integer userId;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getClass_grade() {
		return class_grade;
	}
	public void setClass_grade(String class_grade) {
		this.class_grade = class_grade;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", age=" + age + ", no=" + no + ", class_grade=" + class_grade
				+ ", userId=" + userId + "]";
	}
	
	public User(String userName, Integer age, String no, String class_grade, Integer userId) {
		super();
		this.userName = userName;
		this.age = age;
		this.no = no;
		this.class_grade = class_grade;
		this.userId = userId;
	}
	public User() {
		super();
	}
}
