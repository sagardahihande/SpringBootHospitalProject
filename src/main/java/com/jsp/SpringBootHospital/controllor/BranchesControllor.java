package com.jsp.SpringBootHospital.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.SpringBootHospital.dto.Branch;
import com.jsp.SpringBootHospital.service.BrancheService;
import com.jsp.SpringBootHospital.util.ResponseStructure;

@RestController
@RequestMapping("branches")
public class BranchesControllor {
	
	@Autowired
	private BrancheService branchservice;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<Branch>> savebranch(@RequestParam int hospitalid, @RequestParam int addressid,  @RequestBody Branch branch)
	{
	  return branchservice.saveBranch(hospitalid, addressid, branch);
	
	}
    
}
