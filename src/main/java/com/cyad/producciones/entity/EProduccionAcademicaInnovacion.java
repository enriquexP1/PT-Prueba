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
@Table(name = "PRODUCCION_ACADEMICA_INNOVACION")
@Entity
public class EProduccionAcademicaInnovacion implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@ManyToOne
	@JoinColumn(name = "INNOVACION")
	private EInnovacion innovacion;
	@ManyToOne
	@JoinColumn(name = "AUTOR")
	private EAutor autor;
	@ManyToOne
	@JoinColumn(name = "ORDEN")
	private EOrden orden;

	public EProduccionAcademicaInnovacion() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EInnovacion getInnovacion() {
		return innovacion;
	}

	public void setInnovacion(EInnovacion innovacion) {
		this.innovacion = innovacion;
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
