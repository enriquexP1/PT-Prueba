package com.cyad.producciones.model;

import com.cyad.producciones.entity.EAutor;
import com.cyad.producciones.entity.EInnovacion;
import com.cyad.producciones.entity.EOrden;
import com.cyad.producciones.entity.EProduccionAcademicaInnovacion;

public class MProduccionAcademicaInnovacion {
	private long id;
	private EInnovacion innovacion;
	private EAutor autor;
	private EOrden orden;

	public MProduccionAcademicaInnovacion(EProduccionAcademicaInnovacion prod) {
		this.id = prod.getId();
		this.innovacion = prod.getInnovacion();
		this.autor = prod.getAutor();
		this.orden = prod.getOrden();
	}

	public MProduccionAcademicaInnovacion() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EInnovacion getInnovacion() {
		return innovacion;
	}

	public void setInnovacion(EInnovacion innovacion) {
		this.innovacion = innovacion;
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
