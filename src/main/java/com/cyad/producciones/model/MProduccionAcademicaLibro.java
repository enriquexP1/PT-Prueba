package com.cyad.producciones.model;

import com.cyad.producciones.entity.EAutor;
import com.cyad.producciones.entity.ELibro;
import com.cyad.producciones.entity.EOrden;
import com.cyad.producciones.entity.EProduccionAcademicaLibro;

public class MProduccionAcademicaLibro {
	private long id;
	private ELibro libro;
	private EAutor autor;
	private EOrden orden;

	public MProduccionAcademicaLibro(EProduccionAcademicaLibro prod) {
		this.id = prod.getId();
		this.libro = prod.getLibro();
		this.autor = prod.getAutor();
		this.orden = prod.getOrden();
	}

	public MProduccionAcademicaLibro() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ELibro getLibro() {
		return libro;
	}

	public void setLibro(ELibro libro) {
		this.libro = libro;
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
