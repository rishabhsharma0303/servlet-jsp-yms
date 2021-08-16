package com.demo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class MyDogListner implements ServletContextListener {

	 public void contextInitialized(ServletContextEvent event)  { 
		 String dogName = event.getServletContext().getInitParameter("dogName");
		 Dog dog=new Dog();
		 dog.setDogName(dogName);
		 //i have kept a dog object into servletcontext , any jsp and servlet can pick it
		 //global object in our project
		 event.getServletContext().setAttribute("dog", dog);
		 // 3 scopes: app(servletContext scope) vs session vs request
	 }
	 
    public void contextDestroyed(ServletContextEvent event)  { 
    	//remove it
    	 event.getServletContext().removeAttribute("dog");
    }

   
	
}
