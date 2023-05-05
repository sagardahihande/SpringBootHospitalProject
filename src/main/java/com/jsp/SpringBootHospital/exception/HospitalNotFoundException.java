package com.jsp.SpringBootHospital.exception;

import lombok.Getter;

@Getter
public class HospitalNotFoundException extends RuntimeException {

	private String message;
	
	public HospitalNotFoundException(String message) {
		super();
		this.message = message;
	}

	
}
