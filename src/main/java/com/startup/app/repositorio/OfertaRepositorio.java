package com.startup.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startup.app.entidades.Oferta;

@Repository
public interface OfertaRepositorio extends JpaRepository<Oferta, Integer> {

	
}
