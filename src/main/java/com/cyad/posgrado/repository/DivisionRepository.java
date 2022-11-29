package com.cyad.posgrado.repository;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EDivision;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base de datos de la información de la división a la que pertenece un profesor.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_divisiones")
public interface DivisionRepository extends JpaRepository<EDivision, Serializable>{
	/**
	 * metodo para realizar una busqueda de division por id
	 * @param id
	 * @return entidad division
	 */
	public abstract EDivision findById(long id);
	/**
	 * metodo para realizar una busqueda de division por id
	 * @param nombre division
	 * @return entidad division
	 */
	public abstract EDivision findByDivision(String division);
}
