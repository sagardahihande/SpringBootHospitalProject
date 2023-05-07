package com.jsp.SpringBootHospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.SpringBootHospital.dto.Branch;

public interface BranchRepo extends JpaRepository<Branch, Integer> {

}
