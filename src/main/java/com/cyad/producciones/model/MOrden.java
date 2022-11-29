package com.cyad.producciones.model;

import com.cyad.producciones.entity.EOrden;

public class MOrden {
	private long id;
	private int orden;

	public MOrden(EOrden ordens) {
		this.id = ordens.getId();
		this.orden = ordens.getOrden();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

}
