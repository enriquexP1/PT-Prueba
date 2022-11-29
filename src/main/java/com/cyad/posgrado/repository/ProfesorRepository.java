package com.cyad.posgrado.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EProfesor;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base datos de la información de los profesores.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_profesores")
public interface ProfesorRepository extends JpaRepository<EProfesor,Serializable> {
	/**
	 * metodo para realizar una busqueda de alumno por id
	 * @param numero de id
	 * @return entidad alumno
	 */
	public abstract EProfesor findById(long id);
	/**
	 * metodo para realizar una busqueda de alumno por nombre y id
	 * @param nombre
	 * @param id
	 * @return entidad alumno
	 */
	public abstract EProfesor findByNombreAndId(String nombre, long id);
	/**
	 * metodo para realizar una busqueda de alumno por nombre
	 * @param nombre
	 * @return entidad alumno
	 */
	public abstract List<EProfesor> findByNombre(String nombre);
	
}
