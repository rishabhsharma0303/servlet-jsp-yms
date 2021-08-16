package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	private Dog dog=null;
	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		dog=(Dog) this.getServletContext().getAttribute("dog");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("inside servlet S1"+"<br/>");
		out.print("dog name"+dog.getDogName() + "<br/>");
		dog.setDogName("foo");
		this.getServletContext().setAttribute("dog", dog);
	
	}

}
