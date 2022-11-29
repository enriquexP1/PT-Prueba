package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EDocumentoRespaldo;
import com.cyad.producciones.model.MDocumentoRespaldo;

/**
 * Interface para realizar operaciones CRUD al repositorio de documento de respaldo
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IDocumentoRespaldoService {
	/**
	 * metodo para crear un registro de documento de respaldo
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EDocumentoRespaldo doc);

	/**
	 * metodo para actualizar un registro de documento de respaldo
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EDocumentoRespaldo doc);

	/**
	 * metodo para borrar un resgistro de documento de respaldo
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de documento de respaldo del
	 * repositorio
	 * 
	 * @return lista de registros de documento de respaldo
	 */
	public abstract List<MDocumentoRespaldo> obtener();

	/**
	 * metodo para obtener un registro de documento de respaldo del repositorio
	 * 
	 * @return documentoRespaldo
	 */
	public abstract MDocumentoRespaldo obtener(long id);
}
