package com.cyad.producciones.model;

import com.cyad.producciones.entity.ELibro;
import com.cyad.producciones.entity.ELibroPalabrasPuente;
import com.cyad.producciones.entity.EPalabrasClave;

public class MLibroPalabrasPuente {
	private long id;
	private ELibro libro;
	private EPalabrasClave palabraClave;

	public MLibroPalabrasPuente(ELibroPalabrasPuente puente) {
		this.id = puente.getId();
		this.libro = puente.getLibro();
		this.palabraClave = puente.getPalabraClave();
	}

	public MLibroPalabrasPuente() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ELibro getLibro() {
		return libro;
	}

	public void setLibro(ELibro libro) {
		this.libro = libro;
	}

	public EPalabrasClave getPalabraClave() {
		return palabraClave;
	}

	public void setPalabraClave(EPalabrasClave palabraClave) {
		this.palabraClave = palabraClave;
	}

}
