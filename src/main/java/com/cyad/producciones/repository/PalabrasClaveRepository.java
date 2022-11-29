package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.EPalabrasClave;

/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base datos de la información de los autores de producciones.
 * @author Enrique Ramírez Martínez 
 *
 */
@Repository("repositorio_palabras_clave")
public interface PalabrasClaveRepository  extends JpaRepository<EPalabrasClave, Serializable>{
	/**
	 * metodo para realizar una busqueda de autor por id
	 * 
	 * @param id
	 * @return entidad articulo
	 */
	public abstract EPalabrasClave findById(long id);
}
