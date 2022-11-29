package com.cyad.posgrado.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EProyecto;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base datos de la información de los proyectos (Tesis o ICR).
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_proyectos")
public interface ProyectoRepository extends JpaRepository<EProyecto,Serializable> {
	/**
	 * metodo para realizar una busqueda de proyecto por id
	 * @param numero de id
	 * @return entidad proyecto
	 */
	public abstract EProyecto findById(long id);
	/**
	 * metodo para realizar una busqueda de proyecto por lgac
	 * @param lgac
	 * @return entidad proyecto
	 */
	public abstract List<EProyecto> findByLgac(String lgac);
}
