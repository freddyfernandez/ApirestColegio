package com.bcp.service;

import java.util.List;


import com.bcp.entity.Curso;

public interface CursoService {
	
	List<Curso> listCursoxAlumno(String filtro);

}
