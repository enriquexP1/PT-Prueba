package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.EOrden;

/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio
 * y las consultas hacia la base datos de la información de los ordenes de
 * producciones.
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Repository("repositorio_orden")
public interface OrdenRepository extends JpaRepository<EOrden, Serializable> {
	/**
	 * metodo para realizar una busqueda de orden por id
	 * 
	 * @param id
	 * @return entidad orden
	 */
	public abstract EOrden findById(long id);
}
