package com.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class HellController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//push approach : container will find the object of datasrouce and push it
	//DI concpet :Spring : java EE adadopt
	
	//JNDI way
	//@Resource(name = "jdbc/yms")
	private DataSource dataSouce;
	
	private Connection connection;

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		//rather then container push that datasoruce let me look for it
		// pull vs push : let me pull it using jndi api (j2ee...)
		Context initContext;
		try {
			initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
			dataSouce = (DataSource)envContext.lookup("jdbc/yms");
			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	
	}




	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if(dataSouce!=null) {
			try {
				connection=dataSouce.getConnection();
				System.out.println("conn is done");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else
			System.out.println("not working");
	}

}
