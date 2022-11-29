package com.cyad.producciones.model;

import com.cyad.producciones.entity.EDocumentoReseñaPalabrasPuente;
import com.cyad.producciones.entity.EDocumentos_Reseñas;
import com.cyad.producciones.entity.EPalabrasClave;

public class MDocumentoReseñaPalabrasPuente {
	private long id;
	private EDocumentos_Reseñas documentos_Reseñas;
	private EPalabrasClave palabraClave;

	public MDocumentoReseñaPalabrasPuente(EDocumentoReseñaPalabrasPuente puente) {
		this.id = puente.getId();
		this.documentos_Reseñas = puente.getDocumentoReseña();
		this.palabraClave = puente.getPalabraClave();
	}

	public MDocumentoReseñaPalabrasPuente() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EDocumentos_Reseñas getDocumentos_Reseñas() {
		return documentos_Reseñas;
	}

	public void setDocumentos_Reseñas(EDocumentos_Reseñas documentos_Reseñas) {
		this.documentos_Reseñas = documentos_Reseñas;
	}

	public EPalabrasClave getPalabraClave() {
		return palabraClave;
	}

	public void setPalabraClave(EPalabrasClave palabraClave) {
		this.palabraClave = palabraClave;
	}

}
