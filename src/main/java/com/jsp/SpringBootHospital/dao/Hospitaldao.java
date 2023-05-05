package com.jsp.SpringBootHospital.dao;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.SpringBootHospital.dto.Hospital;
import com.jsp.SpringBootHospital.repo.Hospitalrepo;
import java.util.*;

@Repository
public class Hospitaldao {

	@Autowired
	private Hospitalrepo repo;
	
	
	public Hospital saveHospital(Hospital hospital)
	{
		return repo.save(hospital);
	}
	
	public Hospital findHospital(int id)
	{
		java.util.Optional<Hospital> optional= repo.findById(id);
		if(optional.isPresent())
		{
			return optional.get();
		}
		return null;
	}
}
