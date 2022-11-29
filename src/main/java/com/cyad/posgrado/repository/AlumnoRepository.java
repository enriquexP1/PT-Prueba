package com.cyad.posgrado.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EAlumno;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base de datos de la información de los alumnos
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_alumnos")
public interface AlumnoRepository  extends JpaRepository<EAlumno, Serializable> {
	/**
	 * metodo para realizar una busqueda de alumno por id
	 * @param id
	 * @return entidad alumno
	 */
	public abstract EAlumno findById(long id);
	
}
