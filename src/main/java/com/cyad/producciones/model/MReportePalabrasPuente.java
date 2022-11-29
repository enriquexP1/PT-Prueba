package com.cyad.producciones.model;

import com.cyad.producciones.entity.EPalabrasClave;
import com.cyad.producciones.entity.EReporte;
import com.cyad.producciones.entity.EReportePalabrasPuente;

public class MReportePalabrasPuente {
	private long id;
	private EReporte reporte;
	private EPalabrasClave palabraClave;

	public MReportePalabrasPuente(EReportePalabrasPuente puente) {
		this.id = puente.getId();
		this.reporte = puente.getReporte();
		this.palabraClave = puente.getPalabraClave();
	}

	public MReportePalabrasPuente() {

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
		return palabraClave;
	}

	public void setPalabraClave(EPalabrasClave palabraClave) {
		this.palabraClave = palabraClave;
	}

}
