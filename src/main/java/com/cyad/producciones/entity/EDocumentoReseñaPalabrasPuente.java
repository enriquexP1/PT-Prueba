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
 * clase entidad representa la entidad Documento palabras puente
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "DOCUMENTO_RESEÑA_PALABRAS_PUENTE")
@Entity
public class EDocumentoReseñaPalabrasPuente implements Serializable {

	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@ManyToOne
	@JoinColumn(name = "DOCUMENTO")
	private EDocumentos_Reseñas documentoReseña;
	@ManyToOne
	@JoinColumn(name = "PALABRA_CLAVE")
	private EPalabrasClave palabraDocumentoReseña;

	public EDocumentoReseñaPalabrasPuente() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EDocumentos_Reseñas getDocumentoReseña() {
		return documentoReseña;
	}

	public void setDocumentoReseña(EDocumentos_Reseñas documentoReseña) {
		this.documentoReseña = documentoReseña;
	}

	public EPalabrasClave getPalabraClave() {
		return palabraDocumentoReseña;
	}

	public void setPalabraClave(EPalabrasClave palabraClave) {
		this.palabraDocumentoReseña = palabraClave;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
