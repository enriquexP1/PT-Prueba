package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.ETipoProyecto;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base datos de la información del catálogo de tipos de proyecto para el caso de uso desarrollado se considera Tesis o ICR.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_tipo_proyecto")
public interface TipoProyectoRepository extends JpaRepository<ETipoProyecto,Serializable>{
	/**
	 * metodo para realizar una busqueda de un tipo de proyecto por id
	 * @param numero de id
	 * @return entidad tipo de proyecto
	 */
	public abstract ETipoProyecto findById(long id);
	/**
	 * metodo para realizar una busqueda de un tipo de proyecto por tipo
	 * @param tipo
	 * @return entidad tipo de proyecto
	 */
	public abstract ETipoProyecto findByTipo(String tipo);
}
