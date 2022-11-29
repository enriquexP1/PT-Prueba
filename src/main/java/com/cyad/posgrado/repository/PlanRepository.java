package com.cyad.posgrado.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EPlan;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base datos de la información del catálogo de los planes de estudio.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_plan")
public interface PlanRepository extends JpaRepository<EPlan, Serializable> {
	/**
	 * metodo para realizar una busqueda de plan de estudios por id
	 * @param numero de id
	 * @return entidad plan
	 */
	public abstract EPlan findById(long id);
	/**
	 * metodo para realizar una busqueda de plan de estudios por division
	 * @param division
	 * @return entidad plan
	 */
	public abstract List<EPlan> findByDivision(String division);
}
