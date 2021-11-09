package com.Service;

import com.Entity.FurnitureUser;
import com.Exception.UserNotFoundException;

public interface UserManagementService {
	String loginUser(FurnitureUser user) throws UserNotFoundException;
	FurnitureUser registerNewUser(FurnitureUser user) throws UserNotFoundException;
	FurnitureUser updateUser(FurnitureUser user) throws UserNotFoundException;
	String deleteUser(FurnitureUser user) throws UserNotFoundException;
	FurnitureUser deleteUserById(int uid) throws UserNotFoundException;
}
