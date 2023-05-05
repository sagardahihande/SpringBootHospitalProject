package com.jsp.SpringBootHospital.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.SpringBootHospital.dto.Address;
import com.jsp.SpringBootHospital.repo.Addressrepo;

@Repository
public class Addressdao {
	
	@Autowired
	private Addressrepo repo;
	
	public Address saveAddress(Address address)
	{
		return repo.save(address);
	}
	
	public Address updateAddress(int id, Address address)
	{
		   Address add   = repo.findById(id).get();
		   if(add!=null)
		   {
			   address.setId(id);
			  return  repo.save(address);
		   }
		   return null;
		
	}
	
	public Address findAddress(int id)
	{
	  return repo.findById(id).get();
	}
	
	public Address deleteAddress(int id)
	{
	      Address add  = repo.findById(id).get();
	             repo.delete(add);
	             return add;
	}
	
	

}
