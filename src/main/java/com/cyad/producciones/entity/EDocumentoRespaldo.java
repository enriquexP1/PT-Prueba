package com.cyad.producciones.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * clase entidad que representa a un rol de participacion
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "CAT_DOCUMENTO_RESPALDO")
@Entity
public class EDocumentoRespaldo implements Serializable {

	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@Column(name = "Documento")
	private String documento;

	public EDocumentoRespaldo() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
