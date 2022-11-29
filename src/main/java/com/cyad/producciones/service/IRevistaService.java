package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.ERevista;
import com.cyad.producciones.model.MRevista;

/**
 * Interface para realizar operaciones CRUD al repositorio de revistas
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IRevistaService {
	/**
	 * metodo para crear un registro de revista
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(ERevista revista);

	/**
	 * metodo para actualizar un registro de revista
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(ERevista revista);

	/**
	 * metodo para borrar un resgistro de revista
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de revista del repositorio
	 * 
	 * @return lista de registros de revista
	 */
	public abstract List<MRevista> obtener();

	/**
	 * metodo para obtener un registro de revista del repositorio
	 * 
	 * @return revista
	 */
	public abstract MRevista obtener(long id);
}
