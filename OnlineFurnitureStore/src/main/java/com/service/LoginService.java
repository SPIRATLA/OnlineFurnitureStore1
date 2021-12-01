package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.LoginDto;
import com.entity.Login;
import com.exception.InvalidCredentialsException;
import com.repository.LoginRepository;

@Service
public class LoginService implements LoginInterface{
	
	@Autowired
	LoginRepository repo;

	@Override
	public LoginDto login(Login login) throws InvalidCredentialsException {
		Optional<Login> opt = repo.findByEmail(login.getEmail());
		if(!opt.isPresent()) {
			throw new InvalidCredentialsException("Invalid Credentials");
		}
		Login dbLogin = opt.get();
		if(login.getEmail().equalsIgnoreCase(dbLogin.getEmail()) && 
				login.getPassword().equalsIgnoreCase(dbLogin.getPassword())  && 
				login.getRole().equalsIgnoreCase(dbLogin.getRole())) {
			// set isLoggedIn flag to true
			dbLogin.setLoggedIn(true);
			
			// update isLoggedIn flag to true 
			repo.save(dbLogin);
			LoginDto dto = new LoginDto();
			dto.setEmail(login.getEmail());
			dto.setRole(login.getRole());
			dto.setLoggedIn(true);
			
			return dto;
		} else {
			throw new InvalidCredentialsException("Invalid credentials");
		}
	}

	@Override
	public LoginDto logout(String email) throws InvalidCredentialsException {
		Optional<Login> opt = repo.findByEmail(email);
		if(!opt.isPresent()) {
			throw new InvalidCredentialsException("Invalid Credentials");
		}
		Login login= opt.get();
		
		login.setLoggedIn(false);
		repo.save(login);
		LoginDto loginDto = new LoginDto();
		loginDto.setLoggedIn(false);
		return loginDto;
	}

}
