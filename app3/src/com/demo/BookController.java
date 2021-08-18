package com.demo;
import java.util.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Book>books=Arrays.asList(new Book(12, "java", 799, new Date()),
				new Book(1, "spring", 709.3467, new Date()),
				new Book(192, "python", 499.956, new Date()),
				new Book(190, "phyics", 769.567, new Date()));
		request.setAttribute("books", books);
		RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
	}

	
}
