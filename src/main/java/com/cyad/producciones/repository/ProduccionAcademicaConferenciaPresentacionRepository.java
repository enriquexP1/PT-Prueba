package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.EProduccionAcademicaConferenciaPresentacion;

/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio
 * y las consultas hacia la base datos de la información de los la producción
 * académica de producciones.
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Repository("repositorio_produccion_academica_conferencia_presentacion")
public interface ProduccionAcademicaConferenciaPresentacionRepository
		extends JpaRepository<EProduccionAcademicaConferenciaPresentacion, Serializable> {
	/**
	 * metodo para realizar una busqueda de producciones académicas de conferencias
	 * o presentaciones por id
	 * 
	 * @param id
	 * @return entidad EProduccionAcademicaConferenciaPresentacion
	 */
	public abstract EProduccionAcademicaConferenciaPresentacion findById(long id);
}
