package com.cyad.producciones.model;



import com.cyad.producciones.entity.EInstitucion;
import com.cyad.producciones.entity.EReporte;

public class MInstitucion {
	private long id;
	private String nombre;
	private boolean publica_privada;
	private String tipo_institucion;
	private EReporte reporte;
	
	public MInstitucion(EInstitucion institucion)
	{
		this.id= institucion.getId();
		this.nombre= institucion.getNombre();
		this.publica_privada=institucion.isPublica_privada();
		this.tipo_institucion= institucion.getTipo_institucion();
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

	public boolean isPublica_privada() {
		return publica_privada;
	}

	public void setPublica_privada(boolean publica_privada) {
		this.publica_privada = publica_privada;
	}

	public String getTipo_institucion() {
		return tipo_institucion;
	}

	public void setTipo_institucion(String tipo_institucion) {
		this.tipo_institucion = tipo_institucion;
	}

	public EReporte getReporte() {
		return reporte;
	}

	public void setReporte(EReporte reporte) {
		this.reporte = reporte;
	}
	
}
