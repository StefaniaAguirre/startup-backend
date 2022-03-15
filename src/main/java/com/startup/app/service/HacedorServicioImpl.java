package com.startup.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.app.entidades.Hacedor;
import com.startup.app.repositorio.HacedorRepositorio;

@Service
public class HacedorServicioImpl implements HacedorServicio {

	@Autowired
	private HacedorRepositorio hacedorRepositorio;
	
	/**
	 * Metodo para registrar Hacedor
	 */
	@Override
	public Hacedor guardarHacedor(Hacedor hacedor) {
		// TODO Auto-generated method stub
		return hacedorRepositorio.save(hacedor);
	}

	/**
	 * Metodo para listar los detaller del hacedor 
	 */
	@Override
	public List<Object[]> listarDetalleHacedor(int idHacedor) {
		// TODO Auto-generated method stub
		return hacedorRepositorio.listarDetalleHacedor(idHacedor);
	}

}
