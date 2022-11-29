package com.cyad.producciones.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * clase entidad representa la entidad Institucion
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "CAT_INSTITUCION")
@Entity
public class EInstitucion implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "PUBLICA_PRIVADA")
	private boolean publica_privada;
	@Column(name = "TIPO_INSTITUCION")
	private String tipo_institucion;

	public EInstitucion() {
		super();
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

	public boolean isPublica_privada() {
		return publica_privada;
	}

	public void setPublica_privada(boolean publica_privada) {
		this.publica_privada = publica_privada;
	}

	public String getTipo_institucion() {
		return tipo_institucion;
	}

	public void setTipo_institucion(String tipo_institucion) {
		this.tipo_institucion = tipo_institucion;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
