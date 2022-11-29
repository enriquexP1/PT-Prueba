package com.cyad.producciones.model;

import com.cyad.producciones.entity.EEditor;

public class MEditor {
	private long id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String editorial;

	public MEditor(EEditor editor) {
		this.id = editor.getId();
		this.nombre = editor.getNombre();
		this.primerApellido = editor.getPrimerApellido();
		this.segundoApellido = editor.getSegundoApellido();
		this.editorial = editor.getEditorial();

	}

	public MEditor() {
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

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

}
