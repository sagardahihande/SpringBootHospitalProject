package com.jsp.SpringBootHospital.dto;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Branch {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchid;
	private String branchName;
	
	@ManyToOne
	private Hospital hospital;
	
	@OneToOne
	private Address address;
}
