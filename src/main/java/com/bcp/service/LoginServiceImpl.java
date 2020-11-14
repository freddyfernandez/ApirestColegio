package com.bcp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcp.entity.usuario;
import com.bcp.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository repository;
	
	@Override
	public List<usuario> listaGrado() {
		return repository.findAll();
	}

	@Override
	public usuario insertaActualizaGrado(usuario obj) {
		return repository.save(obj);
	}

	@Override
	public void eliminaGradoPorId(int id) {
		repository.deleteById(id);
	}

	@Override
	public Optional<usuario> buscaGradoPorId(int id) {
		return repository.findById(id);
	}

}
