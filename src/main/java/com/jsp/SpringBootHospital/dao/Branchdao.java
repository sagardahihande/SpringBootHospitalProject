package com.jsp.SpringBootHospital.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.SpringBootHospital.dto.Branch;
import com.jsp.SpringBootHospital.repo.BranchRepo;

@Repository
public class Branchdao {

	@Autowired
	private BranchRepo repo;
	
	public Branch savebranch(Branch branch)
	{
		return repo.save(branch);
	}
}
