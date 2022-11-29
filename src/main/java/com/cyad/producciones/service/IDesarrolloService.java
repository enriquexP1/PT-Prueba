package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EDesarrollo;
import com.cyad.producciones.model.MDesarrollo;

/**
 * Interface para realizar operaciones CRUD al repositorio de desarrollo
 * tecnológico
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IDesarrolloService {
	/**
	 * metodo para obtener un registro de desarrollo del repositorio
	 * 
	 * @return articulo
	 */
	public abstract MDesarrollo buscar(EDesarrollo desarrollo);

	/**
	 * metodo para obtener un registro de desarrollo del repositorio y verificar si
	 * está repetido
	 * 
	 * @return articulo
	 */
	public abstract boolean isRepited(EDesarrollo desarrollo);

	/**
	 * metodo para crear un registro de desarrollo
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EDesarrollo desarrollo);

	/**
	 * metodo para actualizar un registro de desarrollo
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EDesarrollo desarrollo);

	/**
	 * metodo para borrar un resgistro de desarrollo
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de desarrollo del repositorio
	 * 
	 * @return lista de registros de articulo
	 */
	public abstract List<MDesarrollo> obtener();

	/**
	 * metodo para obtener un registro de articulo del repositorio
	 * 
	 * @return desarrollo
	 */
	public abstract MDesarrollo obtener(long id);
}
