package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.EDocumentos_Reseñas;

/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio
 * y las consultas hacia la base datos de la información de los autores de
 * producciones.
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Repository("repositorio_documento_reseña")
public interface DocumentosReseñasRepository extends JpaRepository<EDocumentos_Reseñas, Serializable> {
	/**
	 * metodo para realizar una busqueda de documentos/reseñas por id
	 * 
	 * @param id
	 * @return entidad documentosReseñas
	 */
	public abstract EDocumentos_Reseñas findById(long id);
}
