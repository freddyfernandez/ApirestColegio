package com.bcp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="profesor")
public class Profesor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoProfesor;
	private String nombreProfesor;
	private String correoProfesor;
	

	

}
