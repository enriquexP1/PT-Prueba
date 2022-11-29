package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.ETelefono;

@Repository("repositorio_telefono")
public interface TelefonoRepository extends JpaRepository<ETelefono, Serializable> {
	/**
	 * metodo para realizar una busqueda de un telefono por id
	 * @param id
	 * @return entidad de un telefono
	 */
	public abstract ETelefono findById(long id);
}
