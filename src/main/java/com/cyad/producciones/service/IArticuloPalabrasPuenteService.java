package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EArticuloPalabrasPuente;
import com.cyad.producciones.model.MArticuloPalabrasPuente;

/**
 * Interface para realizar operaciones CRUD al repositorio de palabras clave
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IArticuloPalabrasPuenteService {
	/**
	 * metodo para crear un registro de palabras clave
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EArticuloPalabrasPuente palabra);

	/**
	 * metodo para actualizar un registro de palabras clave
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EArticuloPalabrasPuente palabra);

	/**
	 * metodo para borrar un resgistro de palabras clave
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de palabras clave del repositorio
	 * 
	 * @return lista de registros de palabras clave
	 */
	public abstract List<MArticuloPalabrasPuente> obtener();

	/**
	 * metodo para obtener un registro de palabras clave del repositorio
	 * 
	 * @return palabras clave
	 */
	public abstract MArticuloPalabrasPuente obtener(long id);
}
