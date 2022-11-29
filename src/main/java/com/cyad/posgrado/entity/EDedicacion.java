package com.cyad.posgrado.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * clase entidad representa el catalogo de Dedicación
 * @author Enrique Ramírez Martínez 
 *
 */
@Table(name="CAT_DEDICACION")
@Entity
public class EDedicacion {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="ID")
	private long id;
	@Column(name="DEDICACION")
	private String dedicacion;
	
	@OneToOne(mappedBy = "dedicacion")
	@JsonIgnore
	private EDatosAcademicos datosDedicacion;
	
	public EDedicacion()
	{}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDedicacion() {
		return dedicacion;
	}
	public void setDedicacion(String dedicacion) {
		this.dedicacion = dedicacion;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
