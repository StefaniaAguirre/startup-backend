package com.startup.app.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.app.DTO.DetalleServicioAceptado;
import com.startup.app.entidades.Servicio;
import com.startup.app.repositorio.ServicioRepositorio;

@Service
public class ServicioServicioImpl implements ServicioServicio {

	@Autowired
	private ServicioRepositorio servicioRepositorio;

	/**
	 * implementación del Metodo para crear servicio
	 */
	@Override
	public Servicio crearServicio(Servicio servicio) {
		return servicioRepositorio.save(servicio);
	}

	/**
	 * implementación del metodo que lista las solicitudes de servicios para las que un hacedor cumple las condiciones
	 */
	@Override
	public List<DetalleServicioAceptado> listarDetalleServicio(int idHacedor) {
		
		List<Object[]> servicioAceptado = servicioRepositorio.listarDetalleServicio(idHacedor);
		
		List<DetalleServicioAceptado> detalleServicioAceptado = new ArrayList<DetalleServicioAceptado>();
		
		for (Object[] iterator : servicioAceptado) {
			String nombreHacedor = (String) iterator[0] ;
			String nombreTarea =  (String) iterator[1] ;
			String descripcionServicio = (String) iterator[2]; 
			
			DetalleServicioAceptado nuevoServicioAceptado = new DetalleServicioAceptado(nombreHacedor, nombreTarea, descripcionServicio);
			
			detalleServicioAceptado.add(nuevoServicioAceptado);
		}
		return detalleServicioAceptado;
		
	} 

	/**
	 * Implementación del metodo que lista el detalle del servicio Aceptado
	 */
	@Override
	public List<String> detalleServicioAceptado(int idServicio) {
		// TODO Auto-generated method stub
		
		return servicioRepositorio.detalleServicioAceptado(idServicio);
	}

}
