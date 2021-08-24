package com.bookapp.model.dao.user;

import java.util.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bookapp.model.dao.book.Book;
import com.bookapp.model.dao.factories.HibernateSessionFactory;
import com.bookapp.model.exceptions.DataAccessException;
import com.bookapp.model.exceptions.UserNotFoundException;

public class UserDaoImplHib implements UserDao {
	private SessionFactory factory;

	public UserDaoImplHib() {
		factory = HibernateSessionFactory.getSessionFactory();
	}

	private Session getSession() {
		return factory.openSession();
	}

	@Override
	public void addUser(User user) {
		Session session = getSession();
		Transaction tx = session.getTransaction();

		try {
			tx.begin();
			session.save(user);
			tx.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
			throw new DataAccessException("some hib hell");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public User getUser(String username, String password) {
		List<User> users = getSession()
				.createQuery("select u from User u where u.username=:username and u.password=:password")
				.setParameter("username", username).setParameter("password", password).getResultList();
		if (users.size() > 0)
			return users.get(0);
		else
			throw new UserNotFoundException("user with username " + username + " is not found");
	}

}
