package com.cyad.producciones.model;


import com.cyad.producciones.entity.EDocumentos_Reseñas;

public class MDocumentos_Reseñas {
	private long id;
	private boolean documento_reseña;
	private String titulo;
	private String nombre;
	private String primer_apellido;
	private String segundo_apellido;
	private int pagina_inicio;
	private int pagina_fin;

	public MDocumentos_Reseñas(EDocumentos_Reseñas doc) {
		this.id = doc.getId();
		this.documento_reseña = doc.isDocumento_reseña();
		this.titulo = doc.getTitulo();
		this.nombre = doc.getNombre();
		this.primer_apellido = doc.getPrimer_apellido();
		this.segundo_apellido = doc.getSegundo_apellido();
		this.pagina_inicio = doc.getPagina_inicio();
		this.pagina_fin = doc.getPagina_fin();
	}

	public MDocumentos_Reseñas() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isDocumento_reseña() {
		return documento_reseña;
	}

	public void setDocumento_reseña(boolean documento_reseña) {
		this.documento_reseña = documento_reseña;
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

}
