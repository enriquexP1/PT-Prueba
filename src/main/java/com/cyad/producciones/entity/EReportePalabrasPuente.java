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
 * clase entidad representa la entidad Reporte palabras puente
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "REPORTE_PALABRAS_PUENTE")
@Entity
public class EReportePalabrasPuente implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@ManyToOne
	@JoinColumn(name = "REPORTE")
	private EReporte reporte;
	@ManyToOne
	@JoinColumn(name = "PALABRA_CLAVE")
	private EPalabrasClave palabraReporte;

	public EReportePalabrasPuente() {
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

	public EPalabrasClave getPalabraClave() {
		return palabraReporte;
	}

	public void setPalabraClave(EPalabrasClave palabraClave) {
		this.palabraReporte = palabraClave;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
