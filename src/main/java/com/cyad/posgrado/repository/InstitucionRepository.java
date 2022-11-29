package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EInstitucion;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base datos de la información de la institución de procedencia de un profesor.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_instituciones")
public interface InstitucionRepository extends JpaRepository<EInstitucion, Serializable>{
	/**
	 * metodo para realizar una busqueda de institucion por id
	 * @param id
	 * @return entidad institucion
	 */
	public abstract EInstitucion findById(long id);
	/**
	 * metodo para realizar una busqueda de institucion por vision
	 * @param id
	 * @return entidad institucion
	 */
	public abstract EInstitucion findByInstitucion(String division);
}
