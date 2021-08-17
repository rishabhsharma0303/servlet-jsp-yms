package com.customerapp.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.customerapp.dao.User;
import com.customerapp.dao.UserDao;
import com.customerapp.dao.UserDaoImpl;
import com.customerapp.exceptions.UserNotFoundException;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDao userDao=new UserDaoImpl();
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		try{
			User user=userDao.getUser(username, password);
			HttpSession httpSession=request.getSession();
			httpSession.setAttribute("user", user);
			response.sendRedirect("customerController.do");
			
		}catch(UserNotFoundException ex) {
			response.sendRedirect("login.jsp?error=login failed");
		}
		
	}

}
