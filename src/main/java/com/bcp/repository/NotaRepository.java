package com.bcp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.bcp.entity.Nota;


public interface NotaRepository extends JpaRepository<Nota, Integer> {
	
	@Query("select n from Nota n, Alumno a where "
			+ "n.alumno.codigoAlumno = a.codigoAlumno and "
			+ "a.correoAlumno like :filtro")
	List<Nota> listAlumnosPorNota(@Param("filtro") String filtro);

}
