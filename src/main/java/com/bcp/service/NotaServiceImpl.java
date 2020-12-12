package com.bcp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcp.entity.Nota;
import com.bcp.repository.NotaRepository;

@Service
public class NotaServiceImpl implements NotaService{
	
    @Autowired
    NotaRepository repositorio;
    
	@Override
	public List<Nota> listarTodos() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public List<Nota> listarNotaPorAlumno(String filtro) {
		// TODO Auto-generated method stub
		return repositorio.listAlumnosPorNota(filtro);
	}

}
