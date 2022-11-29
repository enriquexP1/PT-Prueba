package com.cyad.producciones.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.producciones.entity.EProduccionAcademicaDocumentosReseña;

/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio
 * y las consultas hacia la base datos de la información de las producciones.
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Repository("repositorio_produccion_academica_documento_reseña")
public interface ProduccionAcademicaDocumentoReseñaRepository
		extends JpaRepository<EProduccionAcademicaDocumentosReseña, Serializable> {
	/**
	 * metodo para realizar una busqueda de autor por id
	 * 
	 * @param id
	 * @return entidad documentos/reseñas
	 */
	public abstract EProduccionAcademicaDocumentosReseña findById(long id);
}
