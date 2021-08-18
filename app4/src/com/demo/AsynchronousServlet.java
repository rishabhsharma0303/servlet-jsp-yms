package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.awt.RepaintArea;

@WebServlet(name = "AsynchronousServlet", 
urlPatterns = { "/aynch2" }, asyncSupported = true)

public class AsynchronousServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, 
	IOException {

		PrintWriter out =res.getWriter();
		out.print(Thread.currentThread().getName());
		final AsyncContext ac = req.startAsync();

		ac.start(new Runnable() {
			@Override
			public void run() {
				System.out.println("inside thread");

				try {
					// simulate a long running process.
					out.print(Thread.currentThread().getName());
					Thread.sleep(10000);
				} catch (InterruptedException ex) {
					System.out.println("erroer!");
				}

				try {
					ac.getResponse().getWriter().println("You should see this after a brief wait");

					ac.complete();
				} catch (IOException ex) {

				}
			}
		});
	}

}