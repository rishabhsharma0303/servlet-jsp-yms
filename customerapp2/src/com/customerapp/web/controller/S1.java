package com.customerapp.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class S1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession httpSession = request.getSession();
		PrintWriter out = response.getWriter();
		httpSession.setAttribute("name", "raj");
		// url re-writing: url +jsession append
		String newURL = response.encodeURL("S2");
		// response.sendRedirect("S2");
		out.println("Click <a href=\"" + newURL + "\">here</a> for another servlet");
	}

}
