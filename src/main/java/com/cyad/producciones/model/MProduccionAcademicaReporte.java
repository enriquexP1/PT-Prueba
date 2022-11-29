package com.cyad.producciones.model;

import com.cyad.producciones.entity.EEditor;
import com.cyad.producciones.entity.EOrden;
import com.cyad.producciones.entity.EProduccionAcademicaReporte;
import com.cyad.producciones.entity.EReporte;

public class MProduccionAcademicaReporte {
	private long id;
	private EReporte reporte;
	private EEditor editor;
	private EOrden orden;

	public MProduccionAcademicaReporte(EProduccionAcademicaReporte produccion) {
		this.id = produccion.getId();
		this.reporte = produccion.getReporte();
		this.editor = produccion.getEditor();
		this.orden = produccion.getOrden();
	}

	public MProduccionAcademicaReporte() {

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
