package com.startup.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startup.app.entidades.Hacedor;
import com.startup.app.service.HacedorServicio;

@RestController
@RequestMapping("/api/hacedor")
@CrossOrigin({"*"})
public class HacedorControlador {

	@Autowired
	public HacedorServicio hacedorServicio;
	
	//Crear hacedor 
	@PostMapping
	public ResponseEntity<?> guardarHacedor(@RequestBody Hacedor hacedor){
		return ResponseEntity.status(HttpStatus.CREATED).body(hacedorServicio.guardarHacedor(hacedor));
	}
	
	//Listar detalles del perfil hacedor 
	@GetMapping("/listarDetalle/{idHacedor}")
	public ResponseEntity<?> listarDetalleHacedor(@PathVariable int idHacedor){
		return ResponseEntity.ok(hacedorServicio.listarDetalleHacedor(idHacedor));
	}
	/**
	@GetMapping("/{id}")
	public ResponseEntity<?> obtenerHacedor(@PathVariable(value = "id") Integer idHacedor){
		Optional<Hacedor> oHacedor = hacedorServicio.findById(idHacedor);
		
		if(!oHacedor.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(oHacedor); 
	}
	**/
}
