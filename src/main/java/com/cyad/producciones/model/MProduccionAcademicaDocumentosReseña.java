package com.cyad.producciones.model;

import com.cyad.producciones.entity.EDocumentos_Reseñas;
import com.cyad.producciones.entity.EEditor;
import com.cyad.producciones.entity.EOrden;
import com.cyad.producciones.entity.EProduccionAcademicaDocumentosReseña;

public class MProduccionAcademicaDocumentosReseña {
	private long id;
	private EDocumentos_Reseñas documento_Reseña;
	private EEditor editor;
	private EOrden orden;

	public MProduccionAcademicaDocumentosReseña(EProduccionAcademicaDocumentosReseña produccion) {
		this.id = produccion.getId();
		this.documento_Reseña = produccion.getDocumento_reseña();
		this.editor = produccion.getEditor();
		this.orden = produccion.getOrden();
	}

	public MProduccionAcademicaDocumentosReseña() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EDocumentos_Reseñas getDocumento_Reseña() {
		return documento_Reseña;
	}

	public void setDocumento_Reseña(EDocumentos_Reseñas documento_Reseña) {
		this.documento_Reseña = documento_Reseña;
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

}
