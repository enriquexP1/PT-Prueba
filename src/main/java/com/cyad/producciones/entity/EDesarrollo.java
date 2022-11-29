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
 * clase entidad que representa a un autor
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Table(name = "DESARROLLO_TECNOLÓGICO")
@Entity
public class EDesarrollo implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ID")
	private long id;
	@Column(name = "Nombre")
	private String nombre;
	@Column(name = "Objetivos")
	private String objetivos;
	@Column(name = "Resumen")
	private String resumen;

	@ManyToOne
	@JoinColumn(name = "Rol_Participacion")
	private ERolParticipacion rolParticipacion;

	@ManyToOne
	@JoinColumn(name = "Tipo_Desarrollo")
	private ETipoDesarrollo tipoDesarrollo;

	@ManyToOne
	@JoinColumn(name = "Documento_Respaldo")
	private EDocumentoRespaldo documentoRespaldo;

	public ERolParticipacion getRolParticipacion() {
		return rolParticipacion;
	}

	public void setRolParticipacion(ERolParticipacion rolParticipacion) {
		this.rolParticipacion = rolParticipacion;
	}

	public ETipoDesarrollo getTipoDesarrollo() {
		return tipoDesarrollo;
	}

	public void setTipoDesarrollo(ETipoDesarrollo tipoDesarrolo) {
		this.tipoDesarrollo = tipoDesarrolo;
	}

	public EDocumentoRespaldo getDocumentoRespaldo() {
		return documentoRespaldo;
	}

	public void setDocumentoRespaldo(EDocumentoRespaldo documentoRespaldo) {
		this.documentoRespaldo = documentoRespaldo;
	}

	public EDesarrollo() {
		super();
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
