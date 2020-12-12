package com.bcp.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.bcp.entity.Alumno;

public interface AlumnoService {
	
	public abstract List<Alumno> listarTodos ();
	
	public abstract List<Alumno> listAlumnosPorNombre(String filtro);

}
