package com.Service;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.FurnitureOrder;
import com.Exception.UserNotFoundException;
import com.Repository.OrderRepository;

@Service
public class OrderServices implements OrderService
{
	@Autowired
	OrderRepository or;


	@Override
	public List<FurnitureOrder> getAllOrders() {
		List<FurnitureOrder> getOrders = or.findAll();
		return getOrders;
	}

	
	@Override
	public FurnitureOrder updateOrder(FurnitureOrder order) throws UserNotFoundException {
		if ((order != null)) 
		{			
			FurnitureOrder updateUserOrder = or.save(order);
			return updateUserOrder;
		} 
		else 
		{
			throw new UserNotFoundException("Order does not exist");
		}
	}


	

	
	

}
