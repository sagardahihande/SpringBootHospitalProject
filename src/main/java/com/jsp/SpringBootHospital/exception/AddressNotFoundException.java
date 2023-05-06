package com.jsp.SpringBootHospital.exception;

import lombok.Getter;


public class AddressNotFoundException extends RuntimeException {

	private String message;

	public AddressNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	
	
	
	
	
	
	
	

}
