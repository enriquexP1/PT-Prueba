package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EProduccionAcademicaDocumentosReseña;
import com.cyad.producciones.model.MProduccionAcademicaDocumentosReseña;

/**
 * Interface para realizar operaciones CRUD al repositorio de producción
 * académica - documentosReseñas
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IProduccionAcademicaDocumentoReseñaService {
	/**
	 * metodo para crear un registro de producción académica - documentosReseñas
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EProduccionAcademicaDocumentosReseña produccion);

	/**
	 * metodo para actualizar un registro de producción académica -
	 * documentosReseñas
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EProduccionAcademicaDocumentosReseña produccion);

	/**
	 * metodo para borrar un resgistro de producción académica - documentosReseñas
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de producción académica -
	 * documentosReseñas del repositorio
	 * 
	 * @return lista de registros de documentosReseñas
	 */
	public abstract List<MProduccionAcademicaDocumentosReseña> obtener();

	/**
	 * metodo para obtener un registro de producción académica - documentosReseñas
	 * del repositorio
	 * 
	 * @return documentoReseña
	 */
	public abstract MProduccionAcademicaDocumentosReseña obtener(long id);
}
