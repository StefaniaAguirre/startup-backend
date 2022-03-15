package com.startup.app.service;

import java.util.List;

import com.startup.app.DTO.DetalleServicioAceptado;
import com.startup.app.entidades.Servicio;

public interface ServicioServicio {
	
	public Servicio crearServicio(Servicio servicio);
	
	public List<DetalleServicioAceptado> listarDetalleServicio(int idHacedor);
	
	public List<String> detalleServicioAceptado(int idServicio);

}
