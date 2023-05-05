package com.jsp.SpringBootHospital.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.jsp.SpringBootHospital.util.ResponseStructure;

@RestControllerAdvice
public class ExceptionHandler  extends ResponseEntityExceptionHandler {
	
	@org.springframework.web.bind.annotation.ExceptionHandler
	public  ResponseEntity<ResponseStructure<String>> getException(HospitalNotFoundException ex)
	{
		ResponseStructure<String> stru = new ResponseStructure<String>();
		stru.setMessage("Hospital id is not present");
		stru.setStatus(HttpStatus.NOT_FOUND.value());
		stru.setData(ex.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(stru,HttpStatus.NOT_FOUND);
	}
	
	

}
