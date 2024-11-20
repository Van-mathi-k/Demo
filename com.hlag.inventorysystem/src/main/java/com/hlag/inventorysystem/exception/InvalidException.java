package com.hlag.inventorysystem.exception;

public class InvalidException extends Exception {

	public InvalidException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		return this.getMessage();
	}

}
