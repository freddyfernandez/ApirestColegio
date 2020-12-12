package com.bcp.service;

import java.util.List;

import com.bcp.entity.Nota;

public interface NotaService {
	
	public abstract List<Nota> listarTodos ();
	
	public abstract List<Nota> listarNotaPorAlumno(String filtro);

}
