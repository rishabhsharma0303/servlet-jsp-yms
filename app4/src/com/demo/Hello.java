package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns = { "/hello","/hello2" }, 
//		initParams = { 
//				@WebInitParam(name = "adminEmail", value = "rgupta@gmail.com")
//		})
@WebServlet("/hello.do")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		out.print("hello to servlet api v4.x");
	}

	

}
