package com.cyad.producciones.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * clase entidad representa la entidad Libro
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "LIBRO")
@Entity
public class ELibro implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@Column(name = "ISBN")
	private String isbn;
	@Column(name = "TITULO")
	private String titulo;
	@Column(name = "PAIS")
	private String pais;
	@Column(name = "IDIOMA")
	private String idioma;
	@Column(name = "FECHA_PUBLICACION")
	private Date fecha_publicacion;
	@Column(name = "VOLUMEN")
	private int volumen;
	@Column(name = "TOMO")
	private int tomo;
	@Column(name = "DOI")
	private String doi;
	@Column(name = "NUMERO_PAGINAS")
	private int numero_paginas;
	@Column(name = "EDITORIAL")
	private String editorial;
	@Column(name = "NUMERO_EDICION")
	private int numero_edicion;
	@Column(name = "AÑO_EDICION")
	private int año_edicion;
	@Column(name = "TITULO_TRADUCIDO")
	private String titulo_traducido;
	@Column(name = "IDIOMA_TRADUCIDO")
	private String idioma_traducido;

	public ELibro() {
		super();
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
