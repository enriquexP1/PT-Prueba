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
 * clase entidad representa el catalogo de Identificadores de investigacion
 * @author Enrique Ramírez Martínez 
 *
 */
@Table(name="CAT_IDENTIFICADORES_INVESTIGACION")
@Entity
public class EIdentificadores_Investigacion implements Serializable {

	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="ID")
	private long id;
	@Column(name="IDENTIFICADOR")
	private String identificador;
	
	@OneToOne(mappedBy = "identificadorNombreAlumno")
	@JsonIgnore
	private EAlumno_Identificador_puente alumnoIdentificador;
	
	@OneToOne(mappedBy = "identificadorNombreProfesor")
	@JsonIgnore
	private EProfesor_Identificador_puente profesorIdentificador;
	
	
	public EIdentificadores_Investigacion ()
	{
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
