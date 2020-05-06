package com.cg.Exception;

public class EntryNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public EntryNotFoundException(String message) {
		super(message);
	}
	public EntryNotFoundException(String message,Throwable t) {
		super(message,t);
	}
}
