package com.service;

import java.util.List;

import com.entity.Customer;
import com.exception.CustomerException;

public interface CustomerInterface 
{
	List<Customer> getAllCustomers() throws CustomerException;
	Customer addCustomer(Customer customer) throws CustomerException;

}
