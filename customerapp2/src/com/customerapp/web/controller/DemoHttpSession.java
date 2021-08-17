package com.customerapp.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DemoHttpSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//we are checking from the req, hey req do u have session (ie are u getting jsessionid)
		//then use that corrosing session or else create new session
		
		//for logout functionality
		
		//HttpSession httpSession=request.getSession(false);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		HttpSession httpSession=request.getSession();
		out.print("is session new: "+httpSession.isNew()+"<br/>");
		out.print("getMaxInactiveInterval : "+httpSession.getMaxInactiveInterval()+"<br/>");
		out.print(" session Id: "+httpSession.getId()+"<br/>");
		out.print("getLastAccessedTime: "+httpSession.getLastAccessedTime()+"<br/>");
		out.print("client ip loc: "+request.getRemoteAddr()+"<br/>");
		
		
		Integer counter=(Integer) httpSession.getAttribute("counter");
		if(counter==null) {
			counter=1;
			httpSession.setAttribute("counter", counter);
			out.print("welcome first time user");
			
		}else {
			counter++;
			httpSession.setAttribute("counter", counter);
			out.print("welcome again, you have visited "+counter);
		}
		
	}



}
