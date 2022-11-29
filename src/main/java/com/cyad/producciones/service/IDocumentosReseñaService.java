package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EDocumentos_Reseñas;
import com.cyad.producciones.model.MDocumentos_Reseñas;

/**
 * Interface para realizar operaciones CRUD al repositorio de documentos/reseñas
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IDocumentosReseñaService {
	/**
	 * metodo para obtener un registro de documentos/reseñas del repositorio
	 * 
	 * @return articulo
	 */
	public abstract MDocumentos_Reseñas buscar(EDocumentos_Reseñas documento_Reseña);

	/**
	 * metodo para obtener un registro de documentos/reseñas del repositorio y
	 * verificar si está repetido
	 * 
	 * @return articulo
	 */
	public abstract boolean isRepited(EDocumentos_Reseñas documento_Reseña);

	/**
	 * metodo para crear un registro de documentos/reseñas
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EDocumentos_Reseñas doc);

	/**
	 * metodo para actualizar un registro de documentos/reseñas
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EDocumentos_Reseñas doc);

	/**
	 * metodo para borrar un resgistro de documentos/reseñas
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de documentos/reseñas del repositorio
	 * 
	 * @return lista de registros de documentos/reseñas
	 */
	public abstract List<MDocumentos_Reseñas> obtener();

	/**
	 * metodo para obtener un registro de documentos/reseñas del repositorio
	 * 
	 * @return documentos/reseñas
	 */
	public abstract MDocumentos_Reseñas obtener(long id);
}
