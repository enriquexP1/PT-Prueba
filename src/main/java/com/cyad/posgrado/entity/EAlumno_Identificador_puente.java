package com.cyad.posgrado.entity;

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
 * clase entidad representa el conjunto de datos que relacionan a un alumno con un identificador de investigación
 * @author Enrique Ramírez Martínez 
 *
 */
@Table(name="ALUMNO_IDENTIFICADOR_PUENTE")
@Entity
public class EAlumno_Identificador_puente implements Serializable  {
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="ID")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="ID_IDENTIFICADOR_ALUMNO")
	private EIdentificadores_Investigacion identificadorNombreAlumno;
	
	@ManyToOne
	@JoinColumn(name="ID_ALUMNO_IDENTIFICADOR")
	private EAlumno alumno;
	
	@Column(name="IDENTIFICADOR")
	private String identificador;
	
	public EAlumno_Identificador_puente ()
	{
		super();
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EIdentificadores_Investigacion getIdentificadorNombre() {
		return identificadorNombreAlumno;
	}

	public void setIdentificadorNombre(EIdentificadores_Investigacion identificadorNombre) {
		this.identificadorNombreAlumno = identificadorNombre;
	}

	public EAlumno getAlumno() {
		return alumno;
	}

	public void setAlumno(EAlumno alumno) {
		this.alumno = alumno;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
