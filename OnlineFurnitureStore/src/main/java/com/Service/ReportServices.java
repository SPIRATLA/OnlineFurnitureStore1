package com.Service;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.Bill;
import com.Entity.Cart;
import com.Entity.Customer;
import com.Entity.FurnitureOrder;
import com.Exception.ReportException;
import com.Repository.*;

@Service

public class ReportServices implements ReportService
{
	@Autowired
	BillRepository br;
	
	@Autowired
	CustomerRepository csr;
	
	@Autowired
	CartRepository cr;
	
	@Autowired
	OrderRepository or;

	@Override
	public List<Bill> getAllBills() throws ReportException 
	{		
		List<Bill> bills = br.findAll();
		return bills;
	}

	@Override
	public List<Customer> getAllCustomers() throws ReportException 
	{
		List<Customer> customers = csr.findAll();
		return customers;
	}

	@Override
	public List<Cart> getAllCarts() throws ReportException 
	{
		List<Cart> carts = cr.findAll();
		return carts;
	}

	@Override
	public List<FurnitureOrder> getAllOrders() throws ReportException 
	{
		List<FurnitureOrder> orders = or.findAll();
		return orders;
	}

}