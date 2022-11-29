package com.cyad.producciones.model;

import com.cyad.producciones.entity.EDocumentoRespaldo;

public class MDocumentoRespaldo {
	private long id;
	private String documentoRespaldo;

	public MDocumentoRespaldo(EDocumentoRespaldo documento) {
		this.id = documento.getId();
		this.documentoRespaldo = documento.getDocumento();
	}

	public MDocumentoRespaldo() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDocumentoRespaldo() {
		return documentoRespaldo;
	}

	public void setDocumentoRespaldo(String documentoRespaldo) {
		this.documentoRespaldo = documentoRespaldo;
	}

}
