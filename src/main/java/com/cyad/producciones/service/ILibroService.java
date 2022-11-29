package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.ELibro;
import com.cyad.producciones.model.MLibro;

public interface ILibroService {
	/**
	 * metodo para obtener un registro de libro del repositorio
	 * 
	 * @return articulo
	 */
	public abstract MLibro buscar(ELibro libro);

	/**
	 * metodo para obtener un registro de libro del repositorio y verificar si está
	 * repetido
	 * 
	 * @return articulo
	 */
	public abstract boolean isRepited(ELibro libro);

	/**
	 * metodo para crear un registro de lirbo
	 * 
	 * @param entidad libro
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(ELibro libro);

	/**
	 * metodo para actualizar un registro de libro
	 * 
	 * @param entidad area lirbo
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(ELibro libro);

	/**
	 * metodo para borrar un resgistro de libro
	 * 
	 * @param id del libro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de libros del repositorio
	 * 
	 * @return lista de registros de libro
	 */
	public abstract List<MLibro> obtener();

	/**
	 * metodo para obtener un registro de libro del repositorio
	 * 
	 * @return libro
	 */
	public abstract MLibro obtener(long id);
}
