package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EArticulo;
import com.cyad.producciones.model.MArticulo;

/**
 * Interface para realizar operaciones CRUD al repositorio de articulo
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IArticuloService {
	/**
	 * metodo para obtener un registro de articulo del repositorio
	 * 
	 * @return articulo
	 */
	public abstract MArticulo buscar(EArticulo articulo);

	/**
	 * metodo para obtener un registro de articulo del repositorio y verificar si
	 * está repetido
	 * 
	 * @return articulo
	 */
	public abstract boolean isRepited(EArticulo articulo);

	/**
	 * metodo para crear un registro de articulo
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EArticulo articulo);

	/**
	 * metodo para actualizar un registro de articulo
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EArticulo articulo);

	/**
	 * metodo para borrar un resgistro de articulo
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de articulo del repositorio
	 * 
	 * @return lista de registros de articulo
	 */
	public abstract List<MArticulo> obtener();

	/**
	 * metodo para obtener un registro de articulo del repositorio
	 * 
	 * @return articulo
	 */
	public abstract MArticulo obtener(long id);

}
