package com.revature.basics;

public class CustomException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public CustomException() {
		super("I am a custom exception");
	}
}


//Notes:
//	Custom Exceptions
//	A programmer can create custom exceptions 
//	in Java by extending any exception class. 
//	If you extend RuntimeException, however, 
//	you will be creating an unchecked exception. 
//	This is a good idea if you do not want other 
//	code to have to handle your exception being thrown. 
//	If you do always want to require your exception to be handled, 
//	then create a checked exception by extending any existing one, 
//	or the Exception class itself.