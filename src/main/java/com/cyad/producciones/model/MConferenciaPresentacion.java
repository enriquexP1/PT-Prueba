package com.cyad.producciones.model;

import java.util.Date;

import com.cyad.producciones.entity.EConferenciaPresentacion;

public class MConferenciaPresentacion {
	private long id;
	private boolean conferencia_presentacion;
	private String titulo;
	private String evento;
	private Date fecha_presentacion;
	private String ciudad;
	private String pais;

	public MConferenciaPresentacion(EConferenciaPresentacion conferenciaPresentacion) {
		this.id = conferenciaPresentacion.getId();
		this.conferencia_presentacion = conferenciaPresentacion.isConferencia_presentacion();
		this.titulo = conferenciaPresentacion.getTitulo();
		this.evento = conferenciaPresentacion.getEvento();
		this.fecha_presentacion = conferenciaPresentacion.getFecha_presentacion();
		this.ciudad = conferenciaPresentacion.getCiudad();
		this.pais = conferenciaPresentacion.getPais();
	}

	public MConferenciaPresentacion() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isConferencia_presentacion() {
		return conferencia_presentacion;
	}

	public void setConferencia_presentacion(boolean conferencia_presentacion) {
		this.conferencia_presentacion = conferencia_presentacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public Date getFecha_presentacion() {
		return fecha_presentacion;
	}

	public void setFecha_presentacion(Date fecha_presentacion) {
		this.fecha_presentacion = fecha_presentacion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
