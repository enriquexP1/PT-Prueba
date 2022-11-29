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
 * clase entidad representa la entidad Reporte
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "REPORTE")
@Entity
public class EReporte implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@Column(name = "TITULO")
	private String titulo;
	@Column(name = "FECHA_ENTREGA")
	private Date fecha_entrega;
	@Column(name = "FECHA_PUBLICACION")
	private Date fecha_publicacion;
	@Column(name = "NUMERO_PAGINAS")
	private int numero_paginas;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "Objetivos")
	private String objetivos;
	
	@ManyToOne
	@JoinColumn(name = "INSTITUCION")
	private EInstitucion institucion;

	@ManyToOne
	@JoinColumn(name = "ORIGEN_REPORTE")
	private EOrigenReporte origenReporte;

	

	public EReporte() {
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

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public Date getFecha_publicacion() {
		return fecha_publicacion;
	}

	public void setFecha_publicacion(Date fecha_publicacion) {
		this.fecha_publicacion = fecha_publicacion;
	}

	public int getNumero_paginas() {
		return numero_paginas;
	}

	public void setNumero_paginas(int numero_paginas) {
		this.numero_paginas = numero_paginas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(String objetivos) {
		this.objetivos = objetivos;
	}

	public EInstitucion getInstitucion() {
		return institucion;
	}

	public void setInstitucion(EInstitucion institucion) {
		this.institucion = institucion;
	}

	public EOrigenReporte getOrigenReporte() {
		return origenReporte;
	}

	public void setOrigenReporte(EOrigenReporte origenReporte) {
		this.origenReporte = origenReporte;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
