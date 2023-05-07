package com.jsp.SpringBootHospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.SpringBootHospital.dao.Addressdao;
import com.jsp.SpringBootHospital.dao.Branchdao;
import com.jsp.SpringBootHospital.dao.Hospitaldao;
import com.jsp.SpringBootHospital.dto.Address;
import com.jsp.SpringBootHospital.dto.Branch;
import com.jsp.SpringBootHospital.dto.Hospital;
import com.jsp.SpringBootHospital.exception.AddressNotFoundException;
import com.jsp.SpringBootHospital.exception.HospitalNotFoundException;
import com.jsp.SpringBootHospital.util.ResponseStructure;

@Service
public class BrancheService {
	
	@Autowired
	private Branchdao branchdao;
	
	@Autowired
	private Hospitaldao hospitaldao;
	
	@Autowired
	private Addressdao addressdao;
	
	public ResponseEntity<ResponseStructure<Branch>> saveBranch(int hospitalid, int addressid, Branch branch)
	{
		Hospital hospital = hospitaldao.findHospital(hospitalid);
		if(hospital!=null)
		{
			    Address address = addressdao.findAddress(addressid);
			    if(address!=null)
			    {
			    	branch.setAddress(address);
			    	branch.setHospital(hospital);
			    	Branch branch1 = branchdao.savebranch(branch);

			    	ResponseStructure<Branch> str = new ResponseStructure<Branch>();
			    	str.setMessage("branch save successfully");
			    	str.setStatus(HttpStatus.CREATED.value());
			    	str.setData(branch1);
			    	return new ResponseEntity<ResponseStructure<Branch>>(str,HttpStatus.CREATED);
			    	
			      }
			    else
			    {
			    	throw new AddressNotFoundException("address not found here");
			    }
		}
		else
		{
			throw new HospitalNotFoundException("sorry cant add the branch ");
		}
	}

}
