package com.startup.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.app.entidades.Cliente;
import com.startup.app.repositorio.ClienteRepositorio;

@Service
public class ClienteServicioImpl implements ClienteServicio{

	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	/**
	 * Método para registrar Cliente
	 */
	@Override
	public Cliente guardarCliente(Cliente cliente) {
		
		return clienteRepositorio.save(cliente);
	}

}
