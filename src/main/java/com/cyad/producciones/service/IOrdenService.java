package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EOrden;
import com.cyad.producciones.model.MOrden;

/**
 * Interface para realizar operaciones CRUD al repositorio de orden
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IOrdenService {
	/**
	 * metodo para obtener un registro de orden del repositorio
	 * 
	 * @return orden
	 */
	public abstract MOrden buscar(EOrden orden);

	/**
	 * metodo para obtener un registro de orden del repositorio y verificar si está
	 * repetido
	 * 
	 * @return orden
	 */
	public abstract boolean isRepited(EOrden orden);

	/**
	 * metodo para crear un registro de orden
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EOrden orden);

	/**
	 * metodo para actualizar un registro de autor
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EOrden orden);

	/**
	 * metodo para borrar un resgistro de orden
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de orden del repositorio
	 * 
	 * @return lista de registros de orden
	 */
	public abstract List<MOrden> obtener();

	/**
	 * metodo para obtener un registro de autor del repositorio
	 * 
	 * @return orden
	 */
	public abstract MOrden obtener(long id);
}
