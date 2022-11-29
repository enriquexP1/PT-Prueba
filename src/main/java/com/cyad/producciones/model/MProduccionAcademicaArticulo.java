package com.cyad.producciones.model;

import com.cyad.producciones.entity.EArticulo;
import com.cyad.producciones.entity.EAutor;
import com.cyad.producciones.entity.EOrden;
import com.cyad.producciones.entity.EProduccionAcademicaArticulo;

public class MProduccionAcademicaArticulo {
	private long id;
	private EArticulo articulo;
	private EAutor autor;
	private EOrden orden;

	public MProduccionAcademicaArticulo(EProduccionAcademicaArticulo prod) {
		this.id = prod.getId();
		this.articulo = prod.getArticulo();
		this.autor = prod.getAutor();
		this.orden = prod.getOrden();
	}

	public MProduccionAcademicaArticulo() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EArticulo getArticulo() {
		return articulo;
	}

	public void setArticulo(EArticulo articulo) {
		this.articulo = articulo;
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
