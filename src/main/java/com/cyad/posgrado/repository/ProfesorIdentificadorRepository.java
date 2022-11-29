package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EProfesor_Identificador_puente;

@Repository("repositorio_ProfesorIdentificador")
public interface ProfesorIdentificadorRepository extends JpaRepository<EProfesor_Identificador_puente, Serializable>{
	/**
	 * metodo para realizar una busqueda de una beca asignada por id
	 * @param id
	 * @return entidad de un identificador asignada con un profesor
	 */
	public abstract EProfesor_Identificador_puente findById(long id);
}
