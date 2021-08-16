package com.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private AtomicInteger atomicInteger;
	String fileLoc=null;
    public Hello() {
    	System.out.println("ctr of servlet Hello is called");
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		 fileLoc=this.getServletConfig().getInitParameter("fileLocation");
		
		System.out.println("init of Hello is called");
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fileLoc+"counter.ser"));
			atomicInteger=(AtomicInteger) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("doget of servlet"+atomicInteger.addAndGet(1)+"<br/>");
		
	}
	
	@Override
	public void destroy() {
		try {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileLoc+"counter.ser"));
			oos.writeObject(atomicInteger);
		} catch (IOException e ) {
			e.printStackTrace();
		}
	}

}
