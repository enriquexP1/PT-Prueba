package com.cyad.posgrado.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * clase entidad representa el catalogo de Telefonos relacionados con los datos academicos 
 * @author Enrique Ramírez Martínez 
 *
 */
@Table(name="CAT_TELEFONO")
@Entity
public class ETelefono implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="ID")
	private long id;
	@Column(name="TIPO")
	private String tipo;
	@Column(name="NUMERO")
	private int numero;
	@Column(name="LADA")
	private String lada;
	
	@OneToOne(mappedBy = "telefono")
	@JsonIgnore
	private EAlumno telefono;
	
	
	public ETelefono()
	{
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLada() {
		return lada;
	}

	public void setLada(String lada) {
		this.lada = lada;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
