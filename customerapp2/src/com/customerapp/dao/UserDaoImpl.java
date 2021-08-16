package com.customerapp.dao;

import com.customerapp.exceptions.UserNotFoundException;

public class UserDaoImpl implements UserDao {

	@Override
	public void addUser(User user) {
	}

	@Override
	public User getUser(String username, String password) {
		if (username.equals("raj") && password.equals("raj"))
			return new User(username, password, "admin");
		else
			throw new UserNotFoundException("user not found");
	}

}
