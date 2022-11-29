package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EMemoria;
import com.cyad.producciones.model.MMemoria;

/**
 * Interface para realizar operaciones CRUD al repositorio de memoria
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IMemoriaService {
	/**
	 * metodo para obtener un registro de memoria del repositorio
	 * 
	 * @return articulo
	 */
	public abstract MMemoria buscar(EMemoria memoria);

	/**
	 * metodo para obtener un registro de memoria del repositorio y verificar si
	 * está repetido
	 * 
	 * @return articulo
	 */
	public abstract boolean isRepited(EMemoria memoria);

	/**
	 * metodo para crear un registro de memoria
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EMemoria memoria);

	/**
	 * metodo para actualizar un registro de memoria
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EMemoria memoria);

	/**
	 * metodo para borrar un resgistro de memoria
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de memoria del repositorio
	 * 
	 * @return lista de registros de articulo
	 */
	public abstract List<MMemoria> obtener();

	/**
	 * metodo para obtener un registro de memoria del repositorio
	 * 
	 * @return articulo
	 */
	public abstract MMemoria obtener(long id);
}
