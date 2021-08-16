package com.customerapp.dao;

public interface UserDao {
	public void addUser(User user);
	public User getUser(String username, String password);
}
