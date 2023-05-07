package com.jsp.SpringBootHospital.exception;

import java.util.HashMap;

import org.hibernate.mapping.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
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
	
	@org.springframework.web.bind.annotation.ExceptionHandler
	public  ResponseEntity<ResponseStructure<String>> getException(AddressNotFoundException ex)
	{
		ResponseStructure<String> stru = new ResponseStructure<String>();
		stru.setMessage("address id is not present");
		stru.setStatus(HttpStatus.NOT_FOUND.value());
		stru.setData(ex.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(stru,HttpStatus.NOT_FOUND);
	}
	
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, org.springframework.http.HttpHeaders headers, HttpStatus status, WebRequest request) 
	{
	
		java.util.List<ObjectError> list = ex.getAllErrors();
		HashMap<String,String> hashmap = new HashMap<>();
		for(ObjectError error:list) { String message = error.getDefaultMessage(); String fieldName = ((FieldError) error).getField(); hashmap.put(fieldName, message); } 
	return new ResponseEntity<Object>(hashmap,HttpStatus.BAD_REQUEST); } 
	

}  
	

