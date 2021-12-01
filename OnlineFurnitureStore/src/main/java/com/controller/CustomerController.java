package com.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Customer;
import com.service.CustomerService;

@CrossOrigin
@RestController
@RequestMapping("/api/customer")
public class CustomerController 
{
	@Autowired
	CustomerService service;
	
	@GetMapping(path="getAllCustomers")
	public ResponseEntity<List<Customer>> getAllCustomers()
	{
		List<Customer> result = service.getAllCustomers();
		ResponseEntity<List<Customer>> re = new ResponseEntity<List<Customer>>(result,HttpStatus.OK);
		return re;
	}
	
	@PostMapping(path="addCustomer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer)
	{
		Customer c = service.addCustomer(customer);
		return new ResponseEntity<Customer>(c,HttpStatus.OK);
	}
}
