package com.bookapp.model.dao.book;

import java.util.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.bookapp.model.dao.factories.HibernateSessionFactory;
import com.bookapp.model.exceptions.BookNotFoundException;
import com.bookapp.model.exceptions.DataAccessException;


//file handing --> db --> jdbc --> hib --> 
//	spring hib --> spring data (dao X)--> not only support rdbms => NoSQL


public class BookDaoImplHib implements BookDao {

	private SessionFactory factory;

	public BookDaoImplHib() {
		factory = HibernateSessionFactory.getSessionFactory();
	}

	private Session getSession() {
		return factory.openSession();
	}

	@Override
	public List<Book> getAllBooks() {
		return getSession().createQuery("select b from Book b").getResultList();
	}

	@Override
	public Book addBook(Book book) {
		Session session = getSession();
		Transaction tx = session.getTransaction();

		try {
			tx.begin();
			session.save(book);
			tx.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
			throw new DataAccessException("some hib hell");
		}

		return book;
	}

	@Override
	public Book delBook(int id) {
		Session session = getSession();
		Transaction tx = session.getTransaction();
		Book book = null;
		try {
			tx.begin();
			book = getBookById(id);
			session.delete(book);
			tx.commit();

		} catch (HibernateException e) {
			e.printStackTrace();
			throw new DataAccessException("some hib hell");
		}

		return book;
	}

	@Override
	public Book updateBook(int id, double price) {
		Session session = getSession();
		Transaction tx = session.getTransaction();
		Book book = null;
		try {
			tx.begin();
			book = getBookById(id);
			book.setPrice(price);
			session.update(book);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			throw new DataAccessException("some hib hell");
		}
		return book;
	}

	@Override
	public Book getBookById(int id) {
		Book book = getSession().get(Book.class, id);
		if (book == null) {
			throw new BookNotFoundException("book with id " + id + " is not found");
		} else
			return book;
	}

	@Override
	public Book getBookByIsbn(String isbn) {
		Book book=(Book) getSession().
				createQuery("select b from Book b where b.isbn=:isbn")
				.setParameter("isbn", isbn).uniqueResult();
		return book;
	}
}
