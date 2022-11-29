package com.cyad.producciones.model;

import com.cyad.producciones.entity.EAutor;
import com.cyad.producciones.entity.EEditor;
import com.cyad.producciones.entity.EMemoria;
import com.cyad.producciones.entity.EOrden;
import com.cyad.producciones.entity.EProduccionAcademicaMemoria;

public class MProduccionAcademicaMemoria {
	private long id;
	private EMemoria memoria;
	private EAutor autor;
	private EEditor editor;
	private EOrden orden;

	public MProduccionAcademicaMemoria(EProduccionAcademicaMemoria produccion) {
		this.id = produccion.getId();
		this.memoria = produccion.getMemoria();
		this.autor = produccion.getAutor();
		this.editor = produccion.getEditor();
		this.orden = produccion.getOrden();
	}

	public MProduccionAcademicaMemoria() {

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

	public EAutor getAutor() {
		return autor;
	}

	public void setAutor(EAutor autor) {
		this.autor = autor;
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
