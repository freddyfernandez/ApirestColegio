package com.bcp.service;

import java.util.List;
import java.util.Optional;

import com.bcp.entity.usuario;

public interface LoginService {

	public abstract List<usuario> listaGrado();
	public abstract usuario insertaActualizaGrado(usuario obj);
	public abstract void eliminaGradoPorId(int id);
	public abstract Optional<usuario> buscaGradoPorId(int id);
	
}
