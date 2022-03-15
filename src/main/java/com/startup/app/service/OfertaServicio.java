package com.startup.app.service;

import com.startup.app.entidades.Oferta;

public interface OfertaServicio {
	
	/**
	 * 
	 * @param idOferta
	 * @return
	 */
	public Oferta encontrarOferta(int idOferta);
	

	/**
	 * Metodo que busca una oferta por id
	 */
	public Oferta guardarOferta(Oferta oferta);
}
