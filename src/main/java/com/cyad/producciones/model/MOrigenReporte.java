package com.cyad.producciones.model;

import com.cyad.producciones.entity.EOrigenReporte;

public class MOrigenReporte {
	private long id;
	private String origen;
	public MOrigenReporte(EOrigenReporte origen)
	{
		this.id= origen.getId();
		this.origen= origen.getOrigen();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
}
