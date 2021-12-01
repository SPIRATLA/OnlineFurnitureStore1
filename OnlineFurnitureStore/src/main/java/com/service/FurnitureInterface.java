package com.service;

import java.util.List;

import com.entity.Furniture;
import com.exception.FurnitureServiceException;

public interface FurnitureInterface {
	List<Furniture> getAllFurnitures() throws FurnitureServiceException;
	Furniture getFurnitureById(int furnitureId) throws FurnitureServiceException;
	Furniture registerFurniture(Furniture furniture) throws FurnitureServiceException;
	Furniture updateFurniture(int furnitureId,Furniture furniture) throws FurnitureServiceException;
	//Furniture updateFurnitureById(long furnitureId) throws FurnitureServiceException;
	String deleteFurniture(Furniture furniture) throws FurnitureServiceException;
	Furniture deleteFurnitureById(int furnitureId) throws FurnitureServiceException;

}
