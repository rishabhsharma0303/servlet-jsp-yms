package com.demo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MYSCListner implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce)  { 
         System.out.println("context is contextInitialized....");
    }
    
    public void contextDestroyed(ServletContextEvent sce)  { 
    	  System.out.println("context is contextDestroyed....");
    }

	
}
