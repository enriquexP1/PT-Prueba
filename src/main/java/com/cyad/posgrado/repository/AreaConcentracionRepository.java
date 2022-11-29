package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EAreaConcentracion;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base de datos de la información de las áreas de concentración.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_area_concentracion")
public interface AreaConcentracionRepository extends JpaRepository<EAreaConcentracion, Serializable> {
	/**
	 * metodo para realizar una busqueda de area de concentracion por id
	 * @param id
	 * @return entidad area de concentracion
	 */
	public abstract EAreaConcentracion findById(long id);

}
