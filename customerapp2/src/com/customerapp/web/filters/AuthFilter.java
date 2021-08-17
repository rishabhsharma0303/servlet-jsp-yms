package com.customerapp.web.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.customerapp.dao.User;

public class AuthFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;

		boolean isLoggedIn = false;

		HttpSession httpSession = req.getSession(false);

		if (httpSession != null) {
			User user = (User) httpSession.getAttribute("user");
			if (user != null) {
				// ideally u must check from db
				isLoggedIn = true;
			}
		}
		if (isLoggedIn) {
			chain.doFilter(request, response);
		} else {
			res.sendRedirect("login.jsp?error=please login");
		}
	}

	public void destroy() {

	}

}
