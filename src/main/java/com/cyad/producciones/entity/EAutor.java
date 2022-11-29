package com.cyad.producciones.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * clase entidad representa la entidad Autor
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "AUTOR")
@Entity
public class EAutor implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "ID")
	private long id;
	@Column(name = "NOMBRE")
	private String nombre;
	@Column(name = "PRIMER_APELLIDO")
	private String primerApellido;
	@Column(name = "SEGUNDO_APELLIDO")
	private String segundoApellido;

	public EAutor() {
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

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
