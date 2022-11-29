package com.cyad.producciones.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * clase entidad que representa a un Documento o reseña
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "DOCUMENTO_DE_TRABAJO_RESEÑA")
@Entity
public class EDocumentos_Reseñas implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@Column(name = "Documento_Reseña")
	private boolean documento_reseña;
	@Column(name = "Titulo")
	private String titulo;
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Primer_Apellido")
	private String primer_apellido;
	@Column(name = "Segundo_Apellido")
	private String segundo_apellido;
	@Column(name = "Pagina_Inicio")
	private int pagina_inicio;
	@Column(name = "Pagina_Fin")
	private int pagina_fin;

	public EDocumentos_Reseñas() {
		super();
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
