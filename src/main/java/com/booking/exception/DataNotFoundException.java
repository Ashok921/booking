package com.booking.exception;

public class DataNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public DataNotFoundException(String errorMessage) {
		super(errorMessage);
	}
}
