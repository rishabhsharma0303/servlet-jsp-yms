package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dog dog=new Dog();
		dog.setDogName("stonish");
		Person person=new Person();
		person.setPersonName("ravi");
		person.setDog(dog);
		
		request.setAttribute("person", person);
		RequestDispatcher rd=request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
		
		//		response.setContentType("text/html");
//		PrintWriter out=response.getWriter();
//		out.print("inside servlet S1"+"<br/>");
	}
}
