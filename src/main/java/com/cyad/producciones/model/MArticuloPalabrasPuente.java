package com.cyad.producciones.model;

import com.cyad.producciones.entity.EArticulo;
import com.cyad.producciones.entity.EArticuloPalabrasPuente;
import com.cyad.producciones.entity.EPalabrasClave;

public class MArticuloPalabrasPuente {
	private long id;
	private EArticulo articulo;
	private EPalabrasClave palabra;

	public MArticuloPalabrasPuente(EArticuloPalabrasPuente puente) {
		this.id = puente.getId();
		this.articulo = puente.getArticulo();
		this.palabra = puente.getPalabra();
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

	public EPalabrasClave getPalabra() {
		return palabra;
	}

	public void setPalabra(EPalabrasClave palabra) {
		this.palabra = palabra;
	}

}
