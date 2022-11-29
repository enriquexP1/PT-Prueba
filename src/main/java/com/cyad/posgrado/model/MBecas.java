package com.cyad.posgrado.model;

import com.cyad.posgrado.entity.EBecas;

/**
* clase que representa el objeto java de la entidad EBecas
* @author Enrique Ramírez Martínez 
*
*/
public class MBecas {

	private long id;
	private boolean activo;
	private String nombre;
	private String gradoDestinado;
	private String monto;
	private String procedencia;
	private String duracion;
	private String periodicidad;
	
	
	public MBecas()
	{
		super();
	}


	public MBecas(EBecas becas) {
		super();
		this.id = becas.getId();
		this.activo = becas.isActivo();
		this.nombre = becas.getNombre();
		this.gradoDestinado = becas.getGradoDestinado();
		this.monto = becas.getMonto();
		this.procedencia = becas.getProcedencia();
		this.duracion = becas.getDuracion();
		this.periodicidad = becas.getPeriodicidad();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getGradoDestinado() {
		return gradoDestinado;
	}


	public void setGradoDestinado(String gradoDestinado) {
		this.gradoDestinado = gradoDestinado;
	}


	public String getMonto() {
		return monto;
	}


	public void setMonto(String monto) {
		this.monto = monto;
	}


	public String getProcedencia() {
		return procedencia;
	}


	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}


	public String getDuracion() {
		return duracion;
	}


	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}


	public String getPeriodicidad() {
		return periodicidad;
	}


	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}
	
}
