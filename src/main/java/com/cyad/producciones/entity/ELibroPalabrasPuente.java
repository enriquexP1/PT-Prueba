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
 * clase entidad representa la entidad Libro palabras puente
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "LIBRO_PALABRAS_PUENTE")
@Entity
public class ELibroPalabrasPuente implements Serializable {

	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@ManyToOne
	@JoinColumn(name = "LIBRO")
	private ELibro libro;
	@ManyToOne
	@JoinColumn(name = "PALABRA_CLAVE")
	private EPalabrasClave palabraLibro;

	public ELibroPalabrasPuente() {
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

	public EPalabrasClave getPalabraClave() {
		return palabraLibro;
	}

	public void setPalabraClave(EPalabrasClave palabraClave) {
		this.palabraLibro = palabraClave;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
