package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EAlumnoBeca;


@Repository("repositorio_AlumnoBeca")
public interface AlumnoBecaRepository extends JpaRepository<EAlumnoBeca, Serializable>{
	/**
	 * metodo para realizar una busqueda de una beca asignada por id
	 * @param id
	 * @return entidad de una beca asignada con un alumno
	 */
	public abstract EAlumnoBeca findById(long id);
}
