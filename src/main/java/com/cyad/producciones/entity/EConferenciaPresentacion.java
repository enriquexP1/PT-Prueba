package com.cyad.producciones.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * clase entidad representa la entidad Conferencia Presentacion
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "CONFERENCIA_PRESENTACION")
@Entity
public class EConferenciaPresentacion implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@Column(name = "CONFERENCIA_PRESENTACION")
	private boolean conferencia_presentacion;
	@Column(name = "TITULO")
	private String titulo;
	@Column(name = "EVENTO")
	private String evento;
	@Column(name = "FECHA_PRESENTACION")
	private Date fecha_presentacion;
	@Column(name = "CIUDAD")
	private String ciudad;
	@Column(name = "PAIS")
	private String pais;

	public EConferenciaPresentacion() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean isConferencia_presentacion() {
		return conferencia_presentacion;
	}

	public void setConferencia_presentacion(boolean conferencia_presentacion) {
		this.conferencia_presentacion = conferencia_presentacion;
	}

}
