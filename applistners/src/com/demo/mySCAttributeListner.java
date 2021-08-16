package com.demo;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
//used for monitoring purpose
public class mySCAttributeListner implements ServletContextAttributeListener {

   
    public void attributeAdded(ServletContextAttributeEvent scae)  { 
       System.out.println("dog object is added: ");
    }

    public void attributeRemoved(ServletContextAttributeEvent scae)  { 
    	  System.out.println("dog object is removed: ");
    }

    public void attributeReplaced(ServletContextAttributeEvent scae)  { 
    	  System.out.println("dog object is replace with new value: ");
    }
	
}
