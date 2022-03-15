package com.startup.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.app.entidades.Oferta;
import com.startup.app.repositorio.OfertaRepositorio;

@Service
public class OfertaServicioImpl implements OfertaServicio {

	@Autowired
	private OfertaRepositorio ofertaRepositorio;

	/**
	 * Metodo que busca una oferta por id
	 */
	@Override
	public Oferta encontrarOferta(int idOferta) {
		return ofertaRepositorio.findById(idOferta).get();
	}
	
	/**
	 * Metodo que busca una oferta por id
	 */
	@Override
	public Oferta guardarOferta(Oferta oferta) {
		return ofertaRepositorio.save(oferta);
	}


	/***
	 * Metodo que permite cambiar el estado de la oferta solicitada
	 * @param idOferta id de la oferta
	 * @param esAceptada estado de la oferta
	 */
//	public void AceptarRechazarOferta(int idOferta, boolean esAceptada) {
//		
//		//Obteniendo oferta
//		Oferta miOferta = ofertaRepositorio.findById(idOferta);
//		
//		//Cambiar el estado de la oferta (Aceptado o Rechazado)
//		miOferta.setEsAceptada(esAceptada);
//		
//		//Actualizar los datos de la oferta
//		ofertaRepositorio.save(miOferta);
//	}
}
