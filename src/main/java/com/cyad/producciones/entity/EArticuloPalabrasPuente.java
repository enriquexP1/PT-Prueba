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
 * clase entidad representa la entidad Articulo
 * @author Enrique Ramírez Martínez 
 *
 */
@Table(name="ARTICULO_PALABRAS_CLAVE")
@Entity
public class EArticuloPalabrasPuente  implements Serializable {
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="ID")
	private long id;
	@ManyToOne
	@JoinColumn(name = "ARTICULO")
	private EArticulo articulo;
	@ManyToOne
	@JoinColumn(name = "PALABRA_CLAVE")
	private EPalabrasClave palabraArticulo;

	public EArticuloPalabrasPuente()
	{
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EArticulo getArticulo() {
		return articulo;
	}

	public void setArticulo(EArticulo articulo) {
		this.articulo = articulo;
	}

	public EPalabrasClave getPalabra() {
		return palabraArticulo;
	}

	public void setPalabra(EPalabrasClave palabra) {
		this.palabraArticulo = palabra;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

