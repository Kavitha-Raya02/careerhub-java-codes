package com.exception;

public class ApplicationDeadlineExceededException extends Exception {
	
	public ApplicationDeadlineExceededException(String message) {
        super(message);
    }
}
