package com.cyad.producciones.model;

import com.cyad.producciones.entity.EAutor;
import com.cyad.producciones.entity.EDesarrollo;
import com.cyad.producciones.entity.EOrden;
import com.cyad.producciones.entity.EProduccionAcademicaDesarrollo;

public class MProduccionAcademicaDesarrollo {
	private long id;
	private EDesarrollo desarrollo;
	private EAutor autor;
	private EOrden orden;

	public MProduccionAcademicaDesarrollo(EProduccionAcademicaDesarrollo prod) {
		this.id = prod.getId();
		this.desarrollo = prod.getDesarrollo();
		this.autor = prod.getAutor();
		this.orden = prod.getOrden();
	}

	public MProduccionAcademicaDesarrollo() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EDesarrollo getDesarrollo() {
		return desarrollo;
	}

	public void setDesarrollo(EDesarrollo desarrollo) {
		this.desarrollo = desarrollo;
	}

	public EAutor getAutor() {
		return autor;
	}

	public void setAutor(EAutor autor) {
		this.autor = autor;
	}

	public EOrden getOrden() {
		return orden;
	}

	public void setOrden(EOrden orden) {
		this.orden = orden;
	}

}
