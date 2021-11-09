package com.Service;

import java.util.List;
import com.Exception.CustomerShoppingException;
import com.Entity.*;

public interface CustomerShoppingService {
	
	List<Furniture> getAllFurnitures() throws CustomerShoppingException;
	
	Furniture getFurnitureByName(String furnitureName) throws CustomerShoppingException;

	Cart addtoCart(Cart cart) throws CustomerShoppingException;
	
	FurnitureOrder placeOrder(FurnitureOrder order) throws CustomerShoppingException;
	
	Customer addCustomerDetails(Customer cd);

}
