package com.Service;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Repository.*;
import com.Entity.Cart;
import com.Entity.Customer;
import com.Entity.Furniture;
import com.Entity.FurnitureOrder;
import com.Exception.CustomerShoppingException;

@Service
public class CustomerShoppingServices implements CustomerShoppingService
{
	
	@Autowired
	FurnitureRepository fr;
	
	@Autowired
	OrderRepository or;
	
	@Autowired
	CartRepository cr;
	
	@Autowired
	CustomerRepository r;

	
	
	@Override
	public List<Furniture> getAllFurnitures() throws CustomerShoppingException 
	{
		try 
		{
			List<Furniture> allFurniture = fr.findAll();
			if(allFurniture != null)
			{
				return allFurniture;
			}
			else
			{
				throw new CustomerShoppingException("The Furniture table is empty");
			}
		}
		catch(Exception e)
		{
			throw new CustomerShoppingException("The Furniture table is empty");
		}
		
		
	}

	
	
	@Override
	public Furniture getFurnitureByName(String furnitureName) throws CustomerShoppingException
	{
		try 
		{
			Furniture result = fr.findbyName(furnitureName);
			return result; 
		}
		catch (Exception e) 
		{
			throw new CustomerShoppingException("Furniture does not exist");
		}
	}

	
	
	@Override
	public Cart addtoCart(Cart cart) throws CustomerShoppingException
	{
		return cr.save(cart);
	}

	
	
	@Override
	public FurnitureOrder placeOrder(FurnitureOrder order) throws CustomerShoppingException
	{
		return or.save(order);
	}
	
	
	
	@Override
	public Customer addCustomerDetails(Customer cd) 
	{
		return r.save(cd);
	}

}
