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
 * clase entidad representa la entidad Memoria palabras puente
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "MEMORIA_PALABRAS_PUENTE")
@Entity
public class EMemoriaPalabrasPuente implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@ManyToOne
	@JoinColumn(name = "MEMORIA")
	private EMemoria memoria;
	@ManyToOne
	@JoinColumn(name = "PALABRA_CLAVE")
	private EPalabrasClave palabraMemoria;

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
		return palabraMemoria;
	}

	public void setPalabraClave(EPalabrasClave palabraClave) {
		this.palabraMemoria = palabraClave;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
