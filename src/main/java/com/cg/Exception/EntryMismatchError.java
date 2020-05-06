package com.cg.Exception;

public class EntryMismatchError  extends RuntimeException {
	private static final long serialVersionUID = 1L;
	public EntryMismatchError(String message) {
		super(message);
	}
	public EntryMismatchError(String message,Throwable t) {
		super(message,t);
	}
}
