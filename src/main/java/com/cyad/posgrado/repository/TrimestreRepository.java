package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.ETrimestre;
/**
 * 	Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base datos de la información los periodos trimestrales, inicio, fin y nombre que recibe cada trimestre.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_trimestres")
public interface TrimestreRepository extends JpaRepository<ETrimestre ,Serializable>{
	/**
	 * metodo para realizar una busqueda de un alumo por id
	 * @param numero de id
	 * @return entidad trimestre
	 */
	public abstract ETrimestre findById(long id);
}
