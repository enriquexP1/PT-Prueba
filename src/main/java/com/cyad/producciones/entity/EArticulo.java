package com.cyad.producciones.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * clase entidad representa la entidad Articulo
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "ARTICULO")
@Entity
public class EArticulo implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@Column(name = "DOI")
	private String doi;
	@Column(name = "TITULO")
	private String titulo;
	@Column(name = "FECHA_PUBLICACION")
	private Date fecha_publicacion;
	@Column(name = "FECHA_ACEPTACION")
	private Date fecha_aceptacion;
	@Column(name = "PAGINA_INICIO")
	private int pagina_inicio;
	@Column(name = "PAGINA_FIN")
	private int pagina_fin;
	@Column(name = "PAIS")
	private String pais;
	@Column(name = "IDIOMA")
	private String idioma;

	@ManyToOne
	@JoinColumn(name = "REVISTA")
	private ERevista revista;

	public EArticulo() {

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

}
