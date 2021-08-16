package com.demo;
//I want to create the object of dog and put into the servletContextScope as a object so taht 
//any servlet jsp can pick it... this object must be create before any servlet and jsp

//ServletContextListner

public class Dog {
	private String dogName;

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
}
