package com.cyad.producciones.model;

import java.util.Date;


import com.cyad.producciones.entity.EArticulo;
import com.cyad.producciones.entity.ERevista;

public class MArticulo {
	private long id;
	private String doi;
	private String titulo;
	private int año_publicacion;
	private int pagina_inicio;
	private int pagina_fin;
	private String pais;
	private String idioma;
	private Date fecha_publicacion;
	private Date fecha_aceptacion;

	private ERevista revista;

	public MArticulo(EArticulo articulo) {
		this.id = articulo.getId();
		this.doi = articulo.getDoi();
		this.titulo = articulo.getTitulo();
		this.pagina_inicio = articulo.getPagina_inicio();
		this.pagina_fin = articulo.getPagina_fin();
		this.revista = articulo.getRevista();
		this.pais = articulo.getPais();
		this.idioma = articulo.getIdioma();
		this.fecha_aceptacion = articulo.getFecha_aceptacion();
		this.fecha_publicacion = articulo.getFecha_publicacion();
	}

	public MArticulo() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAño_publicacion() {
		return año_publicacion;
	}

	public void setAño_publicacion(int año_publicacion) {
		this.año_publicacion = año_publicacion;
	}

	public int getPagina_inicio() {
		return pagina_inicio;
	}

	public void setPagina_inicio(int pagina_inicio) {
		this.pagina_inicio = pagina_inicio;
	}

	public int getPagina_fin() {
		return pagina_fin;
	}

	public void setPagina_fin(int pagina_fin) {
		this.pagina_fin = pagina_fin;
	}

	public ERevista getRevista() {
		return revista;
	}

	public void setRevista(ERevista revista) {
		this.revista = revista;
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

	public Date getFecha_aceptacion() {
		return fecha_aceptacion;
	}

	public void setFecha_aceptacion(Date fecha_aceptacion) {
		this.fecha_aceptacion = fecha_aceptacion;
	}

}
