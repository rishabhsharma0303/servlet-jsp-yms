package com.customerapp.exceptions;

public class CustomerNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 240544519606393810L;

	public CustomerNotFoundException(String message) {
		super(message);
	}
}
