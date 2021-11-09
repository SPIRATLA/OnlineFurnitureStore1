package com.Service;

import java.util.List ;
import com.Entity.Bill;
import com.Entity.Cart;
import com.Entity.Customer;
import com.Entity.FurnitureOrder;
import com.Exception.ReportException;

public interface ReportService {

	List<Bill> getAllBills() throws ReportException;
	List<Customer> getAllCustomers() throws ReportException;
	List<Cart> getAllCarts() throws ReportException;
	List<FurnitureOrder> getAllOrders() throws ReportException;
}
