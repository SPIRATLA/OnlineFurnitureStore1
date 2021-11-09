package com.Repository;
import com.Entity.*;   
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<FurnitureOrder, String> 
{
	//@Query(value="SELECT Furniture.price FROM Furniture WHERE orderId = ?",nativeQuery=true)
	//public double findPrice(String orderId);
	

}
