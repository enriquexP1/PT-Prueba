package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EAutor;
import com.cyad.producciones.model.MAutor;

/**
 * Interface para realizar operaciones CRUD al repositorio de autor
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IAutorService {
	/**
	 * metodo para obtener un registro de autor del repositorio
	 * 
	 * @return autor
	 */
	public abstract MAutor buscar(EAutor autor);

	/**
	 * metodo para obtener un registro de autor del repositorio y verificar si está
	 * repetido
	 * 
	 * @return articulo
	 */
	public abstract boolean isRepited(EAutor autor);

	/**
	 * metodo para crear un registro de autor
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EAutor autor);

	/**
	 * metodo para actualizar un registro de autor
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EAutor autor);

	/**
	 * metodo para borrar un resgistro de autor
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de autor del repositorio
	 * 
	 * @return lista de registros de articulo
	 */
	public abstract List<MAutor> obtener();

	/**
	 * metodo para obtener un registro de autor del repositorio
	 * 
	 * @return articulo
	 */
	public abstract MAutor obtener(long id);
}
