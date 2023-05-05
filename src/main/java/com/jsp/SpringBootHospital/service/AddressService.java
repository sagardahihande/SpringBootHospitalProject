package com.jsp.SpringBootHospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.jsp.SpringBootHospital.dao.Addressdao;
import com.jsp.SpringBootHospital.dto.Address;
import com.jsp.SpringBootHospital.util.ResponseStructure;

@Service
public class AddressService {
	
	@Autowired
	private Addressdao dao;
	
	public ResponseStructure<Address> saveaddress(Address address)
	{
     Address add = dao.saveAddress(address);
     if(add!=null)
     {
    	 ResponseStructure<Address> s = new ResponseStructure<Address>();
    	 s.setMessage("address saved successfully");
    	 s.setStatus(HttpStatus.CREATED.value());
    	 s.setData(add);
    	 return s;
     }
     return null;
	}
	
	public ResponseStructure<Address> Updateaddress(int id, Address address)
	{
	Address add	= dao.updateAddress(id, address);
	if(add!=null)
	{
		ResponseStructure<Address> s = new ResponseStructure<Address>();
		s.setMessage("data updated successfully");
		s.setStatus(HttpStatus.OK.value());
		s.setData(add);
		return s;
	}
	return null;
	}
	
	
	public ResponseStructure<Address> findAddress(int id)
	{
	Address add	= dao.findAddress(id);
	if(add!=null)
	{
		ResponseStructure<Address> s = new ResponseStructure<Address>();
		s.setMessage("data updated successfully");
		s.setStatus(HttpStatus.OK.value());
		s.setData(add);
		return s;
	}
	return null;
	}
	
	public ResponseStructure<Address> deleteAddress(int id)
	{
	Address add	= dao.deleteAddress(id);
	if(add!=null)
	{
		ResponseStructure<Address> s = new ResponseStructure<Address>();
		s.setMessage("data deleted successfully");
		s.setStatus(HttpStatus.OK.value());
		s.setData(add);
		return s;
	}
	return null;
	}
	
   
}
