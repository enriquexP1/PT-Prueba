package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.ERol;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base datos de la información el rol que tiene un participante dentro del grupo de protocolo.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_rol")
public interface RolRepository extends JpaRepository <ERol , Serializable>{
	/**
	 * metodo para realizar una busqueda de rol por id
	 * @param numero de id
	 * @return entidad rol
	 */
	public abstract ERol findById(long id);
	/**
	 * metodo para realizar una busqueda de un rol por rol
	 * @param rol
	 * @return entidad rol
	 */
	public abstract ERol findByRol(String rol);
}
