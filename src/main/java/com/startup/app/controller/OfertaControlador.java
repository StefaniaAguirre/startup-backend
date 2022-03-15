package com.startup.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startup.app.entidades.Hacedor;
import com.startup.app.entidades.Oferta;
import com.startup.app.service.OfertaServicio;

@RestController
@RequestMapping("/api/oferta")
@CrossOrigin({"*"})
public class OfertaControlador {

	@Autowired
	public OfertaServicio ofertaServicio; 
	
	@PutMapping("/actualizar/{idOferta}&&{estado}")
	public ResponseEntity<?> AceptarRechazarOferta(@RequestBody Oferta oferta, @PathVariable int idOferta, @PathVariable boolean estado){
		
	
		Oferta ofertaEncontrada = ofertaServicio.encontrarOferta(idOferta);
		
		if(ofertaEncontrada == null) {
			
			return ResponseEntity.notFound().build();
		}
		ofertaEncontrada.setEsAceptada(estado);
		
		ofertaEncontrada = ofertaServicio.guardarOferta(ofertaEncontrada);
		
		return ResponseEntity.ok(ofertaEncontrada);
	}
}
