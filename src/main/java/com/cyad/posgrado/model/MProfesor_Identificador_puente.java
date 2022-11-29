package com.cyad.posgrado.model;



import com.cyad.posgrado.entity.EIdentificadores_Investigacion;
import com.cyad.posgrado.entity.EProfesor;
import com.cyad.posgrado.entity.EProfesor_Identificador_puente;

public class MProfesor_Identificador_puente {
	private long id;
	private EIdentificadores_Investigacion identificadorNombre;
	private EProfesor profesor;
	private String identificador;
	
	
	public MProfesor_Identificador_puente()
	{
		super();
	}
	public MProfesor_Identificador_puente(EProfesor_Identificador_puente profesorIdentificador_puente)
	{
		this.id=profesorIdentificador_puente.getId();
		this.identificadorNombre = profesorIdentificador_puente.getIdentificadorNombre();
		this.profesor = profesorIdentificador_puente.getProfesor();
		this.identificador = profesorIdentificador_puente.getIdentificador();
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
	
}
