package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EBecas;

/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base de datos de la información de las becas.
 * @author Enrique Ramírez Martínez 
 *
 */
@Repository("repositorio_becas")
public interface BecasRepository extends JpaRepository<EBecas, Serializable>{
	/**
	 * metodo para realizar una busqueda de una beca por id
	 * @param id
	 * @return entidad de una beca
	 */
	public abstract EBecas findById(long id);
}
