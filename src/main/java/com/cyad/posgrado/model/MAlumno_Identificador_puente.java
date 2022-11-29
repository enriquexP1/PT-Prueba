package com.cyad.posgrado.model;


import com.cyad.posgrado.entity.EAlumno;
import com.cyad.posgrado.entity.EAlumno_Identificador_puente;
import com.cyad.posgrado.entity.EIdentificadores_Investigacion;

public class MAlumno_Identificador_puente {
	private long id;
	private EIdentificadores_Investigacion identificadorNombre;
	private EAlumno alumno;
	private String identificador;
	
	public MAlumno_Identificador_puente()
	{
		super();
	}
	
	public MAlumno_Identificador_puente(EAlumno_Identificador_puente alumnoIdentificador_puente)
	{
		this.id=alumnoIdentificador_puente.getId();
		this.identificadorNombre = alumnoIdentificador_puente.getIdentificadorNombre();
		this.alumno = alumnoIdentificador_puente.getAlumno();
		this.identificador =  alumnoIdentificador_puente.getIdentificador();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EIdentificadores_Investigacion getIdentificadorNombre() {
		return identificadorNombre;
	}

	public void setIdentificadorNombre(EIdentificadores_Investigacion identificadorNombre) {
		this.identificadorNombre = identificadorNombre;
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
	
	
}
