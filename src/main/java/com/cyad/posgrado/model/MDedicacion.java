package com.cyad.posgrado.model;

import com.cyad.posgrado.entity.EDedicacion;

public class MDedicacion {
	private long id;
	private String dedicacion;
	
	public MDedicacion(EDedicacion dedicacion)
	{
		this.id =  dedicacion.getId();
		this.dedicacion= dedicacion.getDedicacion();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDedicacion() {
		return dedicacion;
	}

	public void setDedicacion(String dedicacion) {
		this.dedicacion = dedicacion;
	}
	
}
