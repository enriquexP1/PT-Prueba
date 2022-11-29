package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.cyad.posgrado.entity.EAlumno_Identificador_puente;

@Repository("repositorio_AlumnoIdentificador")
public interface AlumnoIdentificadorRepository extends JpaRepository<EAlumno_Identificador_puente, Serializable> {
	/**
	 * metodo para realizar una busqueda de una beca asignada por id
	 * @param id
	 * @return entidad de un identificador asignada con un alumno
	 */
	public abstract EAlumno_Identificador_puente findById(long id);
}
