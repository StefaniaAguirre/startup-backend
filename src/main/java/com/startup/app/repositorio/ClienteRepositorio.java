package com.startup.app.repositorio;

import org.springframework.stereotype.Repository;

import com.startup.app.entidades.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

}
