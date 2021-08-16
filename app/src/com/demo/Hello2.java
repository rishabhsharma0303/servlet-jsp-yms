package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello2
 */
public class Hello2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String emailId=null;
   
    public Hello2() {}
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
//		emailId=this.getServletConfig().getServletContext().getInitParameter("adminEmail");
		emailId=getServletContext().getInitParameter("adminEmail");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print(emailId+"<br/>");
	}


	@Override
	public void destroy() {
		
	}


}
