package com.cyad.posgrado.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EAlumno;
import com.cyad.posgrado.entity.EDireccion;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base de datos de la información de la dirección del alumno.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_direcciones")
public interface DireccionRepository extends JpaRepository<EDireccion, Serializable>{
	/**
	 * metodo para realizar una busqueda de direccion por id
	 * @param id
	 * @return entidad direccion
	 */
	public abstract EDireccion findById(long id);
	/**
	 * metodo para realizar una busqueda de direccion por calle y numero
	 * @param calle
	 * @param numero
	 * @return entidad direccion
	 */
	public abstract EDireccion findByCalleAndNumero(String calle, int numero);
	/**
	 * metodo para realizar una busqueda de direccion por alumno
	 * @param alumno
	 * @return entidad direccion
	 */
	public abstract EDireccion findByAlumno(EAlumno alumno);
	/**
	 * metodo para realizar una busqueda de direccion por codigo postal
	 * @param codigo postal
	 * @return lista entidad direccion
	 */
	public abstract List<EAlumno> findByCp(int cp);
}
