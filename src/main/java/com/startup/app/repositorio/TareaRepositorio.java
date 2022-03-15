package com.startup.app.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.startup.app.entidades.Tarea;

@Repository
public interface TareaRepositorio extends JpaRepository<Tarea, Integer> {

}
