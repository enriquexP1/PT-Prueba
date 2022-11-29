package com.cyad.producciones.model;



import com.cyad.producciones.entity.ERevista;

public class MRevista {
	private long id;
    private String nombre;
    private int numero;
    private String issn;
	
	
	public MRevista(ERevista revista)
	{
		this.id = revista.getId();
		this.nombre = revista.getNombre();
		this.numero =  revista.getNumero();
		this.issn =  revista.getIssn();
		
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	
	
}
