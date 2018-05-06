package me.test.scripbox.exception.command;

public class CommandException extends RuntimeException {

	private static final long serialVersionUID = 6557847050055119L;

	public CommandException(String message, Throwable cause) {
		super(message, cause);
	}

	public CommandException(String message) {
		super(message);
	}
}
