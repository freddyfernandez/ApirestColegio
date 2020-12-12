package com.bcp.entity;

import javax.persistence.EmbeddedId;


import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cursohasalumno")
public class CursoHasAlumno {
	
	@EmbeddedId
	private CursoHasAlumnoPK cursoHasAlumnoPk;

	@ManyToOne
	@JoinColumn(name = "codigoCurso", nullable = false, insertable = false,updatable = false)
	private Curso curso;

	@ManyToOne
	@JoinColumn(name = "codigoAlumno", nullable = false, insertable = false,updatable = false)
	private Alumno alumno;

	
	
	
	

}
