package com.bookapp.model.dao.book;
import java.util.*;

import com.bookapp.model.dao.user.User;
import com.bookapp.model.service.BookService;
import com.bookapp.model.service.BookServiceImpl;
import com.bookapp.model.service.UserService;
import com.bookapp.model.service.UserServiceImpl;
public class Main {

	public static void main(String[] args) {
		
//		UserService service=new UserServiceImpl();
//		User user=new User("indu", "indu123", "mgr");
//		service.addUser(user);
//		System.out.println(user);
//	
//		
		BookService dao=new BookServiceImpl();
		System.out.println(dao.getBookByIsbn("808ABX"));
		//System.out.println(dao.getBookById(3));
		//List<Book>books=dao.getAllBooks();
		//books.forEach(b-> System.out.println(b));
//		//pl check all the method before next day session!
		
	}
}
