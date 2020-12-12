package com.bcp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bcp.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno,Integer>{
	
	@Query("select m from Alumno m where nombreAlumno like :filtro")
	List<Alumno> listAlumnosPorNombre(@Param("filtro") String filtro);
	
	
	

}
