package com.cyad.producciones.model;

import com.cyad.producciones.entity.ETipoDesarrollo;

public class MTipoDesarrollo {
	private long id;
	private String tipoDesarrollo;

	public MTipoDesarrollo(ETipoDesarrollo desarrollo) {
		this.id = desarrollo.getId();
		this.tipoDesarrollo = desarrollo.getTipo();
	}

	public MTipoDesarrollo() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipoDesarrollo() {
		return tipoDesarrollo;
	}

	public void setTipoDesarrollo(String tipoDesarrollo) {
		this.tipoDesarrollo = tipoDesarrollo;
	}

}
