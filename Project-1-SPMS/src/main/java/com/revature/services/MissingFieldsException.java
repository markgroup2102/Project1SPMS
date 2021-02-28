package com.revature.services;

public class MissingFieldsException extends Exception {

	public MissingFieldsException() {
		super("Ivalid form data, Missing critical fields");
	}

	public MissingFieldsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
