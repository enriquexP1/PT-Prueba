package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cyad.posgrado.entity.EDedicacion;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base de datos de la información de las becas.
 * @author Enrique Ramírez Martínez 
 *
 */
@Repository("repositorio_dedicacion")
public interface DedicacionRepository extends JpaRepository<EDedicacion, Serializable>{
	/**
	 * metodo para realizar una busqueda de una dedicacion por id
	 * @param id
	 * @return entidad de una dedicacion
	 */
	public abstract EDedicacion findById(long id);
}
