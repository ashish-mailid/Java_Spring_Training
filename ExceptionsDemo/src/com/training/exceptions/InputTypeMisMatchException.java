package com.training.exceptions;

public class InputTypeMisMatchException extends Exception {

	private String message;
	public String getMessage() {
		return message;
	}
	public InputTypeMisMatchException(String message) {
		this.message = message;
	}

	
}
