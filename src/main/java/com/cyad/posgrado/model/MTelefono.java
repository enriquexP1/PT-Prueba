package com.cyad.posgrado.model;



import com.cyad.posgrado.entity.ETelefono;

public class MTelefono {
	private long id;
	private String tipo;
	private int numero;
	private String lada;
	
	public MTelefono(ETelefono telefono)
	{
		this.id=telefono.getId();
		this.tipo =  telefono.getTipo();
		this.numero = telefono.getNumero();
		this.lada = telefono.getLada();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLada() {
		return lada;
	}

	public void setLada(String lada) {
		this.lada = lada;
	}
	
}
