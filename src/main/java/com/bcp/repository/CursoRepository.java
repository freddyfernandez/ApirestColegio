package com.bcp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bcp.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso,Integer>{
	
	@Query("select c from Curso c, CursoHasAlumno cha  where "
			+ "c.codigoCurso = cha.curso.codigoCurso and cha.alumno.correoAlumno like :filtro")
	List<Curso> listCursoxAlumno(@Param("filtro") String filtro);
	
	

}
