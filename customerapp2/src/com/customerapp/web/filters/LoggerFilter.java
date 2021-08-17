package com.customerapp.web.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoggerFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		long start=System.currentTimeMillis();
		chain.doFilter(request, response);
		long end= System.currentTimeMillis();
		System.out.println("time taken: "+(end-start));
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

}
