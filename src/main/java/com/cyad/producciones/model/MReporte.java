package com.cyad.producciones.model;

import java.util.Date;



import com.cyad.producciones.entity.EInstitucion;
import com.cyad.producciones.entity.EOrigenReporte;
import com.cyad.producciones.entity.EReporte;

public class MReporte {
	private long id;
	private String titulo;
	private Date fecha_entrega;
	private Date fecha_publicacion;
	private int numero_paginas;
	private String descripcion;
	private String objetivos;
	private EInstitucion institucion;
	private EOrigenReporte origenReporte;
	public MReporte(EReporte reporte)
	{
		this.id= reporte.getId();
		this.titulo= reporte.getTitulo();
		this.fecha_entrega = reporte.getFecha_entrega();
		this.fecha_publicacion= reporte.getFecha_publicacion();
		this.numero_paginas = reporte.getNumero_paginas();
		this.descripcion= reporte.getDescripcion();
		this.objetivos= reporte.getObjetivos();
		this.institucion =  reporte.getInstitucion();
		this.origenReporte= reporte.getOrigenReporte();
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
	
}
