package com.bcp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bcp.entity.usuario;

public interface LoginRepository extends JpaRepository<usuario, Integer> {

	
}
