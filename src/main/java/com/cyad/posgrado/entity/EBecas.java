package com.cyad.posgrado.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * clase entidad representa el catalogo de Becas
 * @author Enrique Ramírez Martínez 
 *
 */
@Table(name="CAT_BECAS")
@Entity
public class EBecas implements Serializable{
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="ID")
	private long id;
	@Column(name= "ACTIVO")
	private boolean activo;
	@Column(name = "BECA")
	private String nombre;
	@Column(name ="GRADO")
	private String gradoDestinado;
	@Column(name= "MONTO")
	private String monto;
	@Column(name= "PROCEDENCIA")
	private String procedencia;
	@Column(name= "DURACION")
	private String duracion;
	@Column(name= "PERIODICIDAD")
	private String periodicidad;
	
	@OneToOne(mappedBy = "beca")
	@JsonIgnore
	private EAlumnoBeca beca;
	
	public EBecas()
	{
		this.activo= true;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
