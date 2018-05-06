package me.test.scripbox.exception.command;

public class InvalidInputException extends RuntimeException {
	private static final long serialVersionUID = 6557847050055119L;

	public InvalidInputException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidInputException(String message) {
		super(message);
	}
}
