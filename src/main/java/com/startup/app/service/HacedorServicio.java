package com.startup.app.service;

import java.util.List;

import com.startup.app.entidades.Hacedor;

public interface HacedorServicio {
	
	public Hacedor guardarHacedor(Hacedor hacedor);
	
	public List<Object[]> listarDetalleHacedor(int idHacedor);
}
