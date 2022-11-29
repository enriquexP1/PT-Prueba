package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.ETipoDesarrollo;
import com.cyad.producciones.model.MTipoDesarrollo;

/**
 * Interface para realizar operaciones CRUD al repositorio de tipo de desarrollo
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface ITipoDesarrollo {
	/**
	 * metodo para crear un registro de tipo de desarrollo
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(ETipoDesarrollo tipo);

	/**
	 * metodo para actualizar un registro de tipo de desarrollo
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(ETipoDesarrollo tipo);

	/**
	 * metodo para borrar un resgistro de tipo de desarrollo
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de tipo de desarrollo del repositorio
	 * 
	 * @return lista de registros de tipo desarrollo
	 */
	public abstract List<MTipoDesarrollo> obtener();

	/**
	 * metodo para obtener un registro de articulo del repositorio
	 * 
	 * @return tipoDesarrollo
	 */
	public abstract MTipoDesarrollo obtener(long id);
}
