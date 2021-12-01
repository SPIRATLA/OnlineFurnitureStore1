package com.service;

import com.dto.LoginDto;
import com.entity.Login;
import com.exception.InvalidCredentialsException;

public interface LoginInterface {
	LoginDto login(Login login) throws InvalidCredentialsException;
	LoginDto logout(String email) throws InvalidCredentialsException;

}
