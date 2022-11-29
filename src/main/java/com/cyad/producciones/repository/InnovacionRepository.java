package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.EInnovacion;

/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio
 * y las consultas hacia la base datos de la información de los autores de
 * producciones.
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Repository("repositorio_innovacion")
public interface InnovacionRepository extends JpaRepository<EInnovacion, Serializable> {
	/**
	 * metodo para realizar una busqueda de innovacion por id
	 * 
	 * @param id
	 * @return entidad innovacion
	 */
	public abstract EInnovacion findById(long id);
}
