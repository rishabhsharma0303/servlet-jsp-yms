package com.customerapp.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customerapp.dao.Customer;
import com.customerapp.dao.CustomerDao;
import com.customerapp.dao.CustomerDaoImpl;
import com.customerapp.exceptions.DataAccessException;
import com.customerapp.service.CustomerService;
import com.customerapp.service.CustomerServiceImpl;
import com.mysql.cj.xdevapi.PreparableStatement;

public class CustomerContoller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService customerService = new CustomerServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// log4j

		response.setContentType("text/html");

		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");

		PrintWriter out = response.getWriter();

		Customer customer = new Customer(name, address, mobile, email);

		try {
			customerService.addCustomer(customer);
		} catch (DataAccessException ex) {
			System.out.println(ex.getMessage());
		}
		// Double form submission problem
//		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/success.jsp");
//		
//		rd.forward(request, response);

		response.sendRedirect("success");

	}

}
