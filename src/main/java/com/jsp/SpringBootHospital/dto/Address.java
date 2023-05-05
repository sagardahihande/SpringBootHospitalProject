package com.jsp.SpringBootHospital.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {
	
	@Id
	private int id;
	private String address;

}
