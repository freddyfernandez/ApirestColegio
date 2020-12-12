package com.bcp.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bcp.entity.Alumno;
import com.bcp.entity.Curso;
import com.bcp.entity.Nota;
import com.bcp.service.AlumnoService;
import com.bcp.service.CursoService;
import com.bcp.service.NotaService;

@RestController
@RequestMapping("/colegio")
public class ServicioController {
	
	//Listar?NombreAlumno=UN
	@Autowired
	private AlumnoService serviceAlumno;
	
	@Autowired
	private CursoService serviceCurso;
	
	@Autowired
	private NotaService serviceNota;
	
	@GetMapping(path = "/listarAlumnos")
	@ResponseBody
	public List<Alumno> listarTodos() {
		System.out.println("");
		return serviceAlumno.listarTodos();
		
		
	}
	@GetMapping(path = "/listarAlumnos/{filtro}")
	@ResponseBody
	public List<Alumno> listarTodosxNombre(@PathVariable("filtro") String filtro) {
	
		return serviceAlumno.listAlumnosPorNombre(filtro+"%");
		
		
	}
	
	@GetMapping(path = "/listarCursos/{filtro}")
	@ResponseBody
	public List<Curso> listarTodosxCurso(@PathVariable("filtro") String filtro) {
	
		return serviceCurso.listCursoxAlumno(filtro+"%");
		
		
	}
	
	
	@GetMapping(path = "/listarNotas/")
	@ResponseBody
	public List<Nota> listarnotas() {
		return serviceNota.listarTodos();
		
		
	}
	
	@GetMapping(path = "/listarNotas/{filtro}")
	@ResponseBody
	public List<Nota> listarNotaxAlumno(@PathVariable("filtro") String filtro) {
	
		return serviceNota.listarNotaPorAlumno(filtro+"%");
		
		
	}


}
