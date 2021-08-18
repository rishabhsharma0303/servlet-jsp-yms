package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Counter extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int counter=0;
	public void foo() {
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		PrintWriter  out=response.getWriter();
		out.print(counter++);
	}
}
