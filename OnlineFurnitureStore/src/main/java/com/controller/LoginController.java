package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.LoginDto;
import com.entity.Login;
import com.exception.InvalidCredentialsException;
import com.service.LoginService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LoginController {
	
	@Autowired 
	LoginService loginService;
	
	@PostMapping("/login")
	public ResponseEntity<LoginDto> login(@RequestBody Login login) throws InvalidCredentialsException {
		LoginDto dto = loginService.login(login);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	@PatchMapping("/logout/{email}")
	public ResponseEntity<LoginDto> logout(@PathVariable("email") String email) throws InvalidCredentialsException  {
		
		LoginDto dto = loginService.logout(email);
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}

}
