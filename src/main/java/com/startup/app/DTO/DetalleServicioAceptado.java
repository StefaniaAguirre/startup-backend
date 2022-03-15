package com.startup.app.DTO;

public class DetalleServicioAceptado {

	private String nombreHacedor;
	private String nombreTarea;
	private String descripcionServicio;
	
	public DetalleServicioAceptado(String nombreHacedor, String nombreTarea, String descripcionServicio) {
		super();
		this.nombreHacedor = nombreHacedor;
		this.nombreTarea = nombreTarea;
		this.descripcionServicio = descripcionServicio;
	}

	public String getNombreHacedor() {
		return nombreHacedor;
	}

	public void setNombreHacedor(String nombreHacedor) {
		this.nombreHacedor = nombreHacedor;
	}

	public String getNombreTarea() {
		return nombreTarea;
	}

	public void setNombreTarea(String nombreTarea) {
		this.nombreTarea = nombreTarea;
	}

	public String getDescripcionServicio() {
		return descripcionServicio;
	}

	public void setDescripcionServicio(String descripcionServicio) {
		this.descripcionServicio = descripcionServicio;
	}
	
}
