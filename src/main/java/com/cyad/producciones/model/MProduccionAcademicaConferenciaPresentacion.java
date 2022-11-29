package com.cyad.producciones.model;

import com.cyad.producciones.entity.EAutor;
import com.cyad.producciones.entity.EConferenciaPresentacion;
import com.cyad.producciones.entity.EProduccionAcademicaConferenciaPresentacion;

public class MProduccionAcademicaConferenciaPresentacion {
	private long id;
	private EConferenciaPresentacion conferenciaPresentacion;
	private EAutor autor;
	public MProduccionAcademicaConferenciaPresentacion(EProduccionAcademicaConferenciaPresentacion produccion)
	{
		this.id = produccion.getId();
		this.conferenciaPresentacion = produccion.getConferenciaPresentacion();
		this.autor = produccion.getAutor();
	}
	public MProduccionAcademicaConferenciaPresentacion()
	{
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
	
}
