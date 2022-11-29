package com.cyad.posgrado.model;

import com.cyad.posgrado.entity.EIdentificadores_Investigacion;

public class MIdentificadores_Investigacion {
	private long id;
	private String identificador;
	
	public MIdentificadores_Investigacion(EIdentificadores_Investigacion EIdentificador)
	{
		this.id = EIdentificador.getId();
		this.identificador = EIdentificador.getIdentificador();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
}
