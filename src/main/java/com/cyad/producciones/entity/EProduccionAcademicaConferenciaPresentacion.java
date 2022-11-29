package com.cyad.producciones.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
/**
 * clase entidad representa la entidad Producción Académica Conferencia Presentacion
 * 
 * @author Enrique Ramírez Martínez
 *
 */
import javax.persistence.Table;

@Table(name = "PRODUCCION_ACADEMICA_CONFERENCIA_PRESENTACION")
@Entity
public class EProduccionAcademicaConferenciaPresentacion {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@ManyToOne
	@JoinColumn(name = "CONFERENCIA_PRESENTACION")
	private EConferenciaPresentacion conferenciaPresentacion;
	@ManyToOne
	@JoinColumn(name = "AUTOR")
	private EAutor autor;

	public EProduccionAcademicaConferenciaPresentacion() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EConferenciaPresentacion getConferenciaPresentacion() {
		return conferenciaPresentacion;
	}

	public void setConferenciaPresentacion(EConferenciaPresentacion conferenciaPresentacion) {
		this.conferenciaPresentacion = conferenciaPresentacion;
	}

	public EAutor getAutor() {
		return autor;
	}

	public void setAutor(EAutor autor) {
		this.autor = autor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
