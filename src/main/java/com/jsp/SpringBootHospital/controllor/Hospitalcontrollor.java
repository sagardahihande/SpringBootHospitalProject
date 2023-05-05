package com.jsp.SpringBootHospital.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.SpringBootHospital.dto.Hospital;
import com.jsp.SpringBootHospital.service.HospitalService;
import com.jsp.SpringBootHospital.util.ResponseStructure;

@RestController
@RequestMapping("/hospital")
public class Hospitalcontrollor {
	
	@Autowired
	private HospitalService service;
	
	@PostMapping
	public ResponseStructure<Hospital> saveHospital(@RequestBody Hospital hospital)
	{
		return  service.saveHospital(hospital);
		
	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<Hospital>>  findHospital(@RequestParam int id)
	{
	  return	 service.findHospital(id);
		
	}
	
	

}
