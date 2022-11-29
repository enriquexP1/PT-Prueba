package com.cyad.producciones.model;

import com.cyad.producciones.entity.ERolParticipacion;

public class MRolParticipacion {
	private long id;
	private String rolParticipacion;

	public MRolParticipacion(ERolParticipacion rol) {
		this.id = rol.getId();
		this.rolParticipacion = rol.getRol();
	}

	public MRolParticipacion() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRolParticipacion() {
		return rolParticipacion;
	}

	public void setRolParticipacion(String rolParticipacion) {
		this.rolParticipacion = rolParticipacion;
	}

}
