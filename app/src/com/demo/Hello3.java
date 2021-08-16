package com.demo;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Hello3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Hello3() {
    	System.out.println("ctr of hello3 is called");
    }
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("init of hello3 is called...");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget is called...");
	}


	@Override
	public void destroy() {
		System.out.println("destory is called...");
	}
}
