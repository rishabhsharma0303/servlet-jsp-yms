package com.customerapp.exceptions;

public class UserNotFoundException  extends RuntimeException{
	private static final long serialVersionUID = 240544519606393810L;

	public UserNotFoundException(String message) {
		super(message);
	}
}
