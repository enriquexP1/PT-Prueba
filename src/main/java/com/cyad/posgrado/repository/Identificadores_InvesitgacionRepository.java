package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EIdentificadores_Investigacion;

@Repository("repositorio_identificadores_investigacion")
public interface Identificadores_InvesitgacionRepository extends JpaRepository<EIdentificadores_Investigacion, Serializable> {
	
	/**
	 * metodo para realizar una busqueda de un identificador de investigacion por id
	 * @param id
	 * @return entidad de un identificador
	 */
	public abstract EIdentificadores_Investigacion findById(long id);

}
