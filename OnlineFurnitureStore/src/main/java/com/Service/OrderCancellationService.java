package com.Service;

import com.Entity.*;
import com.Exception.OrderServiceException; 


public interface OrderCancellationService {
	String deleteOrder(FurnitureOrder order) throws OrderServiceException ;
	String deleteOrderById(String orderId) throws OrderServiceException ;

}
