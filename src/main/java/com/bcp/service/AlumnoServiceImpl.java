package com.bcp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcp.entity.Alumno;
import com.bcp.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	private AlumnoRepository repositorio;

	@Override
	public List<Alumno> listarTodos() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public List<Alumno> listAlumnosPorNombre(String filtro) {
		// TODO Auto-generated method stub
		return repositorio.listAlumnosPorNombre(filtro);
	}

}
