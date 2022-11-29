package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EAreaInvestigacion;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base de datos de la información de las áreas de investigación.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_areas")
public interface AreaInvestigacionRepository extends JpaRepository<EAreaInvestigacion, Serializable>{
	/**
	 * metodo para realizar una busqueda de area de investigacion por id
	 * @param id
	 * @return entidad area de investigacion
	 */
	public abstract EAreaInvestigacion findById(long id);
}
