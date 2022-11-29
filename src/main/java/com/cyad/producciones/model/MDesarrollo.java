package com.cyad.producciones.model;


import com.cyad.producciones.entity.EDesarrollo;
import com.cyad.producciones.entity.EDocumentoRespaldo;
import com.cyad.producciones.entity.ERolParticipacion;
import com.cyad.producciones.entity.ETipoDesarrollo;

public class MDesarrollo {
	private long id;
	private String nombre;
	private String objetivos;
	private String resumen;
	private ERolParticipacion rolParticipacion;
	private ETipoDesarrollo tipoDesarrollo;
	private EDocumentoRespaldo documentoRespaldo;
	
	
	public MDesarrollo(EDesarrollo desarrollo)
	{
		this.id= desarrollo.getId();
		this.nombre= desarrollo.getNombre();
		this.objetivos= desarrollo.getObjetivos();
		this.resumen= desarrollo.getResumen();
		this.rolParticipacion= desarrollo.getRolParticipacion();
		this.tipoDesarrollo= desarrollo.getTipoDesarrollo();
		this.documentoRespaldo= desarrollo.getDocumentoRespaldo();
	}
	public MDesarrollo()
	{
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObjetivos() {
		return objetivos;
	}
	public void setObjetivos(String objetivos) {
		this.objetivos = objetivos;
	}
	public String getResumen() {
		return resumen;
	}
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	public ERolParticipacion getRolParticipacion() {
		return rolParticipacion;
	}
	public void setRolParticipacion(ERolParticipacion rolParticipacion) {
		this.rolParticipacion = rolParticipacion;
	}
	public ETipoDesarrollo getTipoDesarrollo() {
		return tipoDesarrollo;
	}
	public void setTipoDesarrollo(ETipoDesarrollo tipoDesarrollo) {
		this.tipoDesarrollo = tipoDesarrollo;
	}
	public EDocumentoRespaldo getDocumentoRespaldo() {
		return documentoRespaldo;
	}
	public void setDocumentoRespaldo(EDocumentoRespaldo documentoRespaldo) {
		this.documentoRespaldo = documentoRespaldo;
	}
	
}
