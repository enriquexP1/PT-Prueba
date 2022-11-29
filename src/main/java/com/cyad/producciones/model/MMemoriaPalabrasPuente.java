package com.cyad.producciones.model;

import com.cyad.producciones.entity.EMemoria;
import com.cyad.producciones.entity.EMemoriaPalabrasPuente;
import com.cyad.producciones.entity.EPalabrasClave;

public class MMemoriaPalabrasPuente {
	private long id;
	private EMemoria memoria;
	private EPalabrasClave palabraClave;

	public MMemoriaPalabrasPuente(EMemoriaPalabrasPuente puente) {
		this.id = puente.getId();
		this.memoria = puente.getMemoria();
		this.palabraClave = puente.getPalabraClave();
	}

	public MMemoriaPalabrasPuente() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EMemoria getMemoria() {
		return memoria;
	}

	public void setMemoria(EMemoria memoria) {
		this.memoria = memoria;
	}

	public EPalabrasClave getPalabraClave() {
		return palabraClave;
	}

	public void setPalabraClave(EPalabrasClave palabraClave) {
		this.palabraClave = palabraClave;
	}

}
