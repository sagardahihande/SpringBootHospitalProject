package com.jsp.SpringBootHospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.SpringBootHospital.dto.Hospital;

public interface Hospitalrepo extends JpaRepository<Hospital, Integer> {

}
