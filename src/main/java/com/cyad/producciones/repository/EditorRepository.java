package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.EEditor;

/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio
 * y las consultas hacia la base datos de la información de los editores de
 * producciones.
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Repository("repositorio_editor")
public interface EditorRepository extends JpaRepository<EEditor, Serializable> {
	/**
	 * metodo para realizar una busqueda de editor por id
	 * 
	 * @param id
	 * @return entidad editor
	 */
	public abstract EEditor findById(long id);
}
