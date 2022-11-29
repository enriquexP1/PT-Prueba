package com.cyad.producciones.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * clase entidad representa la entidad Documento palabras puente
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "PRODUCCION_ACADEMICA_LIBRO")
@Entity
public class EProduccionAcademicaLibro implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@ManyToOne
	@JoinColumn(name = "LIBRO")
	private ELibro libro;
	@ManyToOne
	@JoinColumn(name = "AUTOR")
	private EAutor autor;
	@ManyToOne
	@JoinColumn(name = "ORDEN")
	private EOrden orden;

	public EProduccionAcademicaLibro() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ELibro getLibro() {
		return libro;
	}

	public void setLibro(ELibro libro) {
		this.libro = libro;
	}

	public EAutor getAutor() {
		return autor;
	}

	public void setAutor(EAutor autor) {
		this.autor = autor;
	}

	public EOrden getOrden() {
		return orden;
	}

	public void setOrden(EOrden orden) {
		this.orden = orden;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
