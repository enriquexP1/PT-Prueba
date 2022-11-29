package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EEstadoAcademico;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base datos de la información de los estados académicos que puede tener un alumno en el trimestre vigente.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_estado_academico")
public interface EstadoAcademicoRepository extends JpaRepository<EEstadoAcademico, Serializable>{
	/**
	 * metodo para realizar una busqueda de estado academico por id
	 * @param id
	 * @return entidad estado academico
	 */
	public abstract EEstadoAcademico findById(long id);
}
