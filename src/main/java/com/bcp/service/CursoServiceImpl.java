package com.bcp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcp.entity.Curso;
import com.bcp.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {
	
	@Autowired
	CursoRepository repositorio;

	@Override
	public List<Curso> listCursoxAlumno(String filtro) {
		// TODO Auto-generated method stub
		return repositorio.listCursoxAlumno(filtro);
	}

}
