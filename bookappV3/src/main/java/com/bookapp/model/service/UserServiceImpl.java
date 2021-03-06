package com.bookapp.model.service;

import com.bookapp.model.dao.user.User;
import com.bookapp.model.dao.user.UserDao;
import com.bookapp.model.dao.user.UserDaoImpl;
import com.bookapp.model.dao.user.UserDaoImplHib;

public class UserServiceImpl implements UserService{
	private UserDao userDao;
	
	public UserServiceImpl() {
		userDao=new UserDaoImplHib();
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public User getUser(String username, String password) {
		return userDao.getUser(username, password);
	}

}
