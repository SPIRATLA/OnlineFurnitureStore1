package com.Service;

import java.util.List; 
import com.Entity.*;
import com.Exception.UserNotFoundException;

public interface OrderService {
	
	List<FurnitureOrder> getAllOrders() ;
	//FurnitureOrder getOrderByStatus(String status);
	FurnitureOrder updateOrder(FurnitureOrder order) throws UserNotFoundException;
	//FurnitureOrder updateOrderById(String orderId,FurnitureOrder order) throws UserNotFoundException;
}
