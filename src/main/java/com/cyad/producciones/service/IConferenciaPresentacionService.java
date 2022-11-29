package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EConferenciaPresentacion;
import com.cyad.producciones.model.MConferenciaPresentacion;

/**
 * Interface para realizar operaciones CRUD al repositorio de
 * conferenciaPresentacion
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IConferenciaPresentacionService {
	/**
	 * metodo para obtener un registro de conferenciaPresentacion del repositorio
	 * 
	 * @return articulo
	 */
	public abstract MConferenciaPresentacion buscar(EConferenciaPresentacion conferenciaPresentacion);

	/**
	 * metodo para obtener un registro de conferenciaPresentacion del repositorio y
	 * verificar si está repetido
	 * 
	 * @return articulo
	 */
	public abstract boolean isRepited(EConferenciaPresentacion conferenciaPresentacion);

	/**
	 * metodo para crear un registro de conferenciaPresentacion
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EConferenciaPresentacion conferenciaPresentacion);

	/**
	 * metodo para actualizar un registro de conferenciaPresentacion
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EConferenciaPresentacion conferenciaPresentacion);

	/**
	 * metodo para borrar un resgistro de conferenciaPresentacion
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de conferenciaPresentacion del
	 * repositorio
	 * 
	 * @return lista de registros de conferenciaPresentacion
	 */
	public abstract List<MConferenciaPresentacion> obtener();

	/**
	 * metodo para obtener un registro de conferenciaPresentacion del repositorio
	 * 
	 * @return conferenciaPresentacion
	 */
	public abstract MConferenciaPresentacion obtener(long id);
}
