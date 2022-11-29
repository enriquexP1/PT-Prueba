package com.cyad.producciones.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * clase entidad que representa a una memoria
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "MEMORIA")
@Entity
public class EMemoria implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@Column(name = "Titulo")
	private String titulo;
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Primer_Apellido")
	private String primer_apellido;
	@Column(name = "Segundo_Apellido")
	private String segundo_apellido;
	@Column(name = "Titulo_Publicacion")
	private String titulo_publicacion;
	@Column(name = "Pagina_Inicio")
	private int pagina_inicio;
	@Column(name = "Pagina_Fin")
	private int pagina_fin;
	@Column(name = "Año_Publicacion")
	private int año_publicacion;
	@Column(name = "Pais")
	private String pais;

	public EMemoria() {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
