package com.cyad.producciones.model;

import java.util.Date;

import com.cyad.producciones.entity.ELibro;

public class MLibro {
	private long id;
	private String isbn;
	private String titulo;
	private String pais;
	private String idioma;
	private Date fecha_publicacion;
	private int volumen;
	private int tomo;
	private String doi;
	private int numero_paginas;
	private String editorial;
	private int numero_edicion;
	private int año_edicion;
	private String titulo_traducido;
	private String idioma_traducido;

	public MLibro(ELibro libro) {
		this.id = libro.getId();
		this.isbn = libro.getIsbn();
		this.titulo = libro.getTitulo();
		this.pais = libro.getPais();
		this.idioma = libro.getIdioma();
		this.fecha_publicacion = libro.getFecha_publicacion();
		this.volumen = libro.getVolumen();
		this.tomo = libro.getTomo();
		this.doi = libro.getDoi();
		this.numero_paginas = libro.getNumero_paginas();
		this.editorial = libro.getEditorial();
		this.numero_edicion = libro.getNumero_edicion();
		this.año_edicion = libro.getAño_edicion();
		this.titulo_traducido = libro.getTitulo_traducido();
		this.idioma_traducido = libro.getIdioma_traducido();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public Date getFecha_publicacion() {
		return fecha_publicacion;
	}

	public void setFecha_publicacion(Date fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public int getTomo() {
		return tomo;
	}

	public void setTomo(int tomo) {
		this.tomo = tomo;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public int getNumero_paginas() {
		return numero_paginas;
	}

	public void setNumero_paginas(int numero_paginas) {
		this.numero_paginas = numero_paginas;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getNumero_edicion() {
		return numero_edicion;
	}

	public void setNumero_edicion(int numero_edicion) {
		this.numero_edicion = numero_edicion;
	}

	public int getAño_edicion() {
		return año_edicion;
	}

	public void setAño_edicion(int año_edicion) {
		this.año_edicion = año_edicion;
	}

	public String getTitulo_traducido() {
		return titulo_traducido;
	}

	public void setTitulo_traducido(String titulo_traducido) {
		this.titulo_traducido = titulo_traducido;
	}

	public String getIdioma_traducido() {
		return idioma_traducido;
	}

	public void setIdioma_traducido(String idioma_traducido) {
		this.idioma_traducido = idioma_traducido;
	}

}
