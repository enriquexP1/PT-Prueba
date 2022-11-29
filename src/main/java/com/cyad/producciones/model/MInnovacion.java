package com.cyad.producciones.model;

import java.util.Date;

import com.cyad.producciones.entity.EInnovacion;

public class MInnovacion {
	private long id;
	private String nombre;
	private Date fecha_fin;
	private String descripcion;

	public MInnovacion(EInnovacion innovacion) {
		this.id = innovacion.getId();
		this.nombre = innovacion.getNombre();
		this.fecha_fin = innovacion.getFecha_fin();
		this.descripcion = innovacion.getDescripcion();
	}

	public MInnovacion() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
