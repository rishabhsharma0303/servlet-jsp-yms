package com.demo;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String pass;
	private boolean valid;

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public boolean isValid() {
		//dao..
		if (name.equals("raj") && pass.equals("java")) {
			return true;
		} else
			return false;
	}

	public User() {
	}

	public User(String name, String pass) {
		this.name = name;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName is called");
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		System.out.println("setPass is called");
		this.pass = pass;
	}

}
