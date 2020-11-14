package com.bcp.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcp.entity.usuario;
import com.bcp.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	//por defecto la api url del api devuelve  el get
	@GetMapping
	public ResponseEntity<List<usuario>> lista(){
		return ResponseEntity.ok(service.listaGrado());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<usuario>> obtenerid(@PathVariable int id){
		return ResponseEntity.ok(service.buscaGradoPorId(id));
	}
	

	@PostMapping
	public ResponseEntity<usuario> inserta(@RequestBody usuario obj){
		return ResponseEntity.ok(service.insertaActualizaGrado(obj));
	}
	
	@PutMapping
	public ResponseEntity<usuario> actualiza(@RequestBody usuario obj){
		return ResponseEntity.ok(service.insertaActualizaGrado(obj));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> elimina(@PathVariable int id){
		Optional<usuario> obj = service.buscaGradoPorId(id);
		if(obj.isPresent()) {
			service.eliminaGradoPorId(id);
			return ResponseEntity.ok().build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	
}



