package com.jsp.SpringBootHospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.SpringBootHospital.dto.Address;

public interface Addressrepo extends JpaRepository<Address, Integer> {

}
