package com.startup.app.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.startup.app.entidades.Servicio;

@Repository
public interface ServicioRepositorio extends JpaRepository<Servicio, Long>{

	//Consultar solicitudes de servicios para las que un hacedor cumple las condiciones
	@Query(value = "SELECT h.nombre, t.nombre as nombreTarea, s.descripcion FROM hacedor AS h "
			+ "INNER JOIN habilidadtareahacedor AS ht ON h.idHacedor = ht.idHacedor "
			+ "INNER JOIN tarea AS t ON ht.idTarea = t.idTarea "
			+ "INNER JOIN servicio AS s ON s.idTarea = t.idTarea WHERE h.idHacedor = :idHacedor", nativeQuery = true)
	List<Object[]> listarDetalleServicio(int idHacedor);
	
	//Consultar detalle de un servicio aceptado
	@Query(value = "SELECT t.nombre as nombreTarea, s.descripcion, o.precioBase, o.notificacion FROM servicio AS s "
			+ "INNER JOIN oferta AS o ON o.idOferta = s.idOferta " 
			+ "INNER JOIN tarea AS t ON s.idTarea = t.idTarea WHERE s.idServicio=:idServicio and o.esAceptada=1", nativeQuery = true)
	List<String> detalleServicioAceptado(int idServicio);
}
