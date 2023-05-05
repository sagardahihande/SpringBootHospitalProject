package com.jsp.SpringBootHospital.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.SpringBootHospital.dto.Address;
import com.jsp.SpringBootHospital.service.AddressService;
import com.jsp.SpringBootHospital.util.ResponseStructure;

@RestController
@RequestMapping("/address")
public class AddressControllor {
	
	@Autowired
	private AddressService service;
	
	@PostMapping
	public ResponseStructure<Address> saveAddress( @RequestBody Address address)
	{
	  return service.saveaddress(address);
		
	}
	
	@PutMapping
	public ResponseStructure<Address> updateAddress(@RequestParam int id,  @RequestBody Address address)
	{
	  return service.Updateaddress(id, address);
		
	}
	
	@GetMapping
	public ResponseStructure<Address> findAddress(@RequestParam int id)
	{
	  return service.findAddress(id);
		
	}
	
	
	@DeleteMapping
	public ResponseStructure<Address> deleteAddress(@RequestParam int id)
	{
	  return service.deleteAddress(id);
		
	}
	
	

	

}
