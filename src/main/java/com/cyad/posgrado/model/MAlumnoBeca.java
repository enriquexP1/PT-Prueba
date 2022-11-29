package com.cyad.posgrado.model;


import com.cyad.posgrado.entity.EAlumno;
import com.cyad.posgrado.entity.EAlumnoBeca;
import com.cyad.posgrado.entity.EBecas;

public class MAlumnoBeca {
	
	private long Id;
	private EAlumno alumno;
	private EBecas beca;
	private boolean becaActiva;
	
	public MAlumnoBeca()
	{
		super();
	}
	
	
	public MAlumnoBeca(EAlumnoBeca EAlumnoBeca)
	{
		
		this.Id= EAlumnoBeca.getId();
		this.alumno=EAlumnoBeca.getAlumno();
		this.beca=EAlumnoBeca.getBeca();
		this.becaActiva=EAlumnoBeca.isBecaActiva();
	}


	public long getId() {
		return Id;
	}


	public void setId(long id) {
		Id = id;
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
