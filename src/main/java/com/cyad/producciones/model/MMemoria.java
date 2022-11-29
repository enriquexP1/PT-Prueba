package com.cyad.producciones.model;

import com.cyad.producciones.entity.EMemoria;

public class MMemoria {
	private long id;
	private String titulo;
	private String nombre;
	private String primer_apellido;
	private String segundo_apellido;
	private String titulo_publicacion;
	private int pagina_inicio;
	private int pagina_fin;
	private int año_publicacion;
	private String pais;

	public MMemoria(EMemoria memoria) {
		this.id = memoria.getId();
		this.titulo = memoria.getTitulo();
		this.nombre = memoria.getNombre();
		this.primer_apellido = memoria.getPrimer_apellido();
		this.segundo_apellido = memoria.getSegundo_apellido();
		this.titulo_publicacion = memoria.getTitulo_publicacion();
		this.pagina_inicio = memoria.getPagina_inicio();
		this.pagina_fin = memoria.getPagina_fin();
		this.año_publicacion = memoria.getAño_publicacion();
		this.pais = memoria.getPais();
	}

	public MMemoria() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimer_apellido() {
		return primer_apellido;
	}

	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

	public String getTitulo_publicacion() {
		return titulo_publicacion;
	}

	public void setTitulo_publicacion(String titulo_publicacion) {
		this.titulo_publicacion = titulo_publicacion;
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

	public int getAño_publicacion() {
		return año_publicacion;
	}

	public void setAño_publicacion(int año_publicacion) {
		this.año_publicacion = año_publicacion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

}
