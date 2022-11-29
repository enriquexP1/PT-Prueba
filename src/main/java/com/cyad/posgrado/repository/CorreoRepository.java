package com.cyad.posgrado.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.ECorreo;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base de datos de la información de los correos de contacto del alumno.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_correos")
public interface CorreoRepository extends JpaRepository<ECorreo, Serializable>{
	/**
	 * metodo para realizar una busqueda de correo por id
	 * @param id
	 * @return entidad correo
	 */
	public abstract ECorreo findById(long id);
	/**
	 * metodo para realizar una busqueda de correo por tipo
	 * @param tipo
	 * @return lista entidad correos
	 */
	public abstract List<ECorreo> findByTipo(String tipo);
	/**
	 * metodo para realizar una busqueda de correo por correo y tipo
	 * @param correo
	 * @param tipo
	 * @return entidad correo
	 */
	public abstract ECorreo findByCorreoAndTipo(String correo, String tipo);
}
