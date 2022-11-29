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
 * clase entidad representa el conjunto de datos que relacionan a un alumno con una beca
 * @author Enrique Ramírez Martínez 
 *
 */
@Table(name="ALUMNO_BECA")
@Entity
public class EAlumnoBeca implements Serializable{

	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="ID")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="ID_BECA_ALUMNO")
	private EBecas beca;
	
	@ManyToOne
	@JoinColumn(name="ID_ALUMNO_BECA")
	private EAlumno alumno;
	
	@Column(name="ACTIVO")
	private boolean becaActiva;
	
	
	private EAlumnoBeca(EAlumno alumno , EBecas beca)
	{
	 this.alumno=alumno;
	 this.beca=beca;
	 if(alumno.isActivo()==true && beca.isActivo()== true)
	 {
		 becaActiva= true;
	 }
	 else
	 {
		 becaActiva= false;
	 }
	}
	
	private EAlumnoBeca()
	{
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EAlumno getAlumno() {
		return alumno;
	}

	public void setAlumno(EAlumno alumno) {
		this.alumno = alumno;
	}

	public EBecas getBeca() {
		return beca;
	}

	public void setBeca(EBecas beca) {
		this.beca = beca;
	}

	public boolean isBecaActiva() {
		return becaActiva;
	}

	public void setBecaActiva(boolean becaActiva) {
		this.becaActiva = becaActiva;
	}
	
}
