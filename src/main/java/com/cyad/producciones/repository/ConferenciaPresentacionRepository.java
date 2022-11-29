package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.EConferenciaPresentacion;

/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio
 * y las consultas hacia la base datos de la información de las conferencias y
 * presentaciones
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Repository("repositorio_conferencia_presentacion")
public interface ConferenciaPresentacionRepository extends JpaRepository<EConferenciaPresentacion, Serializable> {
	/**
	 * metodo para realizar una busqueda de conferencias o presentaciones por id
	 * 
	 * @param id
	 * @return entidad conferenciaPresentacion
	 */
	public abstract EConferenciaPresentacion findById(long id);
}
