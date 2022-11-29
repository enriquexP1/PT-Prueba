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
 * clase entidad representa la entidad Produccion academica de documentos de
 * trabajo y reseñas
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "PRODUCCION_ACADEMICA_DOCUMENTO_RESENA")
@Entity
public class EProduccionAcademicaDocumentosReseña implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@ManyToOne
	@JoinColumn(name = "DOCUMENTO_RESENA")
	private EDocumentos_Reseñas documento_reseña;
	@ManyToOne
	@JoinColumn(name = "EDITOR")
	private EEditor editor;
	@ManyToOne
	@JoinColumn(name = "ORDEN")
	private EOrden orden;

	public EProduccionAcademicaDocumentosReseña() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EDocumentos_Reseñas getDocumento_reseña() {
		return documento_reseña;
	}

	public void setDocumento_reseña(EDocumentos_Reseñas documento_reseña) {
		this.documento_reseña = documento_reseña;
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
