package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EDatosAcademicos;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base de datos de la información académica del alumno
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_datos_academicos")
public interface DatosAcademicosRepository extends JpaRepository<EDatosAcademicos, Serializable> {
	/**
	 * metodo para realizar una busqueda de datos de academicos por id
	 * @param id
	 * @return entidad datos academicos
	 */
	public abstract EDatosAcademicos findById(long id);

}
