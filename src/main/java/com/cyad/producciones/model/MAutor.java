package com.cyad.producciones.model;

import com.cyad.producciones.entity.EAutor;

public class MAutor {
	private long id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;

	public MAutor(EAutor autor) {
		this.id = autor.getId();
		this.nombre = autor.getNombre();
		this.primerApellido = autor.getPrimerApellido();
		this.segundoApellido = autor.getSegundoApellido();
	}

	public MAutor() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

}
