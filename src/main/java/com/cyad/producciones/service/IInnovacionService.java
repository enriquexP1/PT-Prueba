package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EInnovacion;
import com.cyad.producciones.model.MInnovacion;

/**
 * Interface para realizar operaciones CRUD al repositorio de innovacion
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IInnovacionService {
	/**
	 * metodo para obtener un registro de innovacion del repositorio
	 * 
	 * @return innovacion
	 */
	public abstract MInnovacion buscar(EInnovacion innovacion);

	/**
	 * metodo para obtener un registro de innovacion del repositorio y verificar si
	 * está repetido
	 * 
	 * @return innovacion
	 */
	public abstract boolean isRepited(EInnovacion innovacion);

	/**
	 * metodo para crear un registro de innovacion
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EInnovacion innovacion);

	/**
	 * metodo para actualizar un registro de innovacion
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EInnovacion innovacion);

	/**
	 * metodo para borrar un resgistro de innovacion
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de innovacion del repositorio
	 * 
	 * @return lista de registros de innovacion
	 */
	public abstract List<MInnovacion> obtener();

	/**
	 * metodo para obtener un registro de innovacion del repositorio
	 * 
	 * @return innovacion
	 */
	public abstract MInnovacion obtener(long id);
}
