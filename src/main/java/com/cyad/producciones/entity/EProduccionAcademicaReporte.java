package com.cyad.producciones.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * clase entidad representa la entidad Produccion academica de reportes
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "PRODUCCION_ACADEMICA_REPORTE")
@Entity
public class EProduccionAcademicaReporte implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@ManyToOne
	@JoinColumn(name = "REPORTE")
	private EReporte reporte;
	@ManyToOne
	@JoinColumn(name = "EDITOR")
	private EEditor editor;
	@ManyToOne
	@JoinColumn(name = "ORDEN")
	private EOrden orden;

	public EProduccionAcademicaReporte() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EReporte getReporte() {
		return reporte;
	}

	public void setReporte(EReporte reporte) {
		this.reporte = reporte;
	}

	public EEditor getEditor() {
		return editor;
	}

	public void setEditor(EEditor editor) {
		this.editor = editor;
	}

	public EOrden getOrden() {
		return orden;
	}

	public void setOrden(EOrden orden) {
		this.orden = orden;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
