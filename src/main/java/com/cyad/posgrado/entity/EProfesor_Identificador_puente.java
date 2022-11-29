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
@Table(name="PROFESOR_IDENTIFICADOR_PUENTE")
@Entity
public class EProfesor_Identificador_puente implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="ID")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="ID_IDENTIFICADOR_PROFESOR")
	private EIdentificadores_Investigacion identificadorNombreProfesor;
	
	@ManyToOne
	@JoinColumn(name="ID_PROFESOR_IDENTIFICADOR")
	private EProfesor profesor;
	
	@Column(name="IDENTIFICADOR")
	private String identificador;
	
	public EProfesor_Identificador_puente()
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
		return identificadorNombreProfesor;
	}

	public void setIdentificadorNombre(EIdentificadores_Investigacion identificadorNombre) {
		this.identificadorNombreProfesor = identificadorNombre;
	}

	public EProfesor getProfesor() {
		return profesor;
	}

	public void setProfesor(EProfesor profesor) {
		this.profesor = profesor;
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
