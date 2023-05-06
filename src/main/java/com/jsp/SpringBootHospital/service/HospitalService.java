package com.jsp.SpringBootHospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.SpringBootHospital.dao.Hospitaldao;
import com.jsp.SpringBootHospital.dto.Hospital;
import com.jsp.SpringBootHospital.exception.HospitalNotFoundException;
import com.jsp.SpringBootHospital.util.ResponseStructure;


@Service
public class HospitalService {
	
	@Autowired
	private Hospitaldao dao;
	
	public ResponseStructure<Hospital> saveHospital(Hospital hospital)
	{
		Hospital hos = dao.saveHospital(hospital);
		if(hos!=null)
		{
			ResponseStructure<Hospital> s = new ResponseStructure<Hospital>();
			s.setMessage("data saved successfully");
			s.setStatus(HttpStatus.CREATED.value());
			s.setData(hos);
			return s;
		}
		
		throw  new HospitalNotFoundException("failed to save the data");
	}
	
	
	public ResponseEntity<ResponseStructure<Hospital>> findHospital(int id)
	{
		Hospital hos1 = dao.findHospital(id);
		if(hos1!=null)
		{
			ResponseStructure<Hospital> s = new ResponseStructure<Hospital>();
			s.setMessage("data fecth successfully");
			s.setStatus(HttpStatus.FOUND.value());
			s.setData(hos1);
			return new ResponseEntity<ResponseStructure<Hospital>>(s,HttpStatus.FOUND); 
		}
	    throw  new HospitalNotFoundException("failed to fetch the data");
	}
	
	

}
