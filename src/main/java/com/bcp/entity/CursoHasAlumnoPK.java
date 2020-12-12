package com.bcp.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Embeddable
public class CursoHasAlumnoPK implements Serializable{
	
private static final long serialVersionUID = 1L;
	
    //Aqui va cualquier variable no necesita mapear
	private int codigoCurso; 
	private int codigoAlumno;

}
