package com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Login;

public interface LoginRepository extends  JpaRepository<Login, Integer>
{
	Optional<Login> findByEmail(String email);

}
