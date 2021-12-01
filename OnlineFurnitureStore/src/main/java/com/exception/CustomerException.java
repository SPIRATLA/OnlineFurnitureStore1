package com.exception;

public class CustomerException extends RuntimeException
{
	public CustomerException() {
		super();
		
	}

	public CustomerException(String message) {
		super(message);
		
	}

	public CustomerException(Throwable cause) {
		super(cause);
		
	}
	
}
