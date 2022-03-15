package com.startup.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startup.app.entidades.Cliente;
import com.startup.app.service.ClienteServicio;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin({"*"})
public class ClienteControlador {

	@Autowired
	public ClienteServicio clienteServicio;
	
	//Crear cliente 
	@PostMapping
	public ResponseEntity<?> guardarCliente(@RequestBody Cliente cliente){
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteServicio.guardarCliente(cliente));
		
	}
}
