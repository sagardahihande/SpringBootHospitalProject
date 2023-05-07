package com.jsp.SpringBootHospital.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Valid
public class Address {
	
	@Id
	@NotBlank(message = "cant be blank")
	@NotNull(message = "cant be null")
	private int id;
	@NotBlank(message = "cant be blank")
	@NotNull(message = "cant be null")
	private String address;

}
