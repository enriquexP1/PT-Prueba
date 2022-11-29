package com.cyad.posgrado.service;

import java.util.List;


import com.cyad.posgrado.entity.EDedicacion;
import com.cyad.posgrado.model.MDedicacion;

/**
 * Interface para realizar operaciones CRUD al repositorio de dedicacion
 * @author Enrique Ramírez Martínez
 *
 */
public interface IDedicacionService {
	/**
	 * metodo para crear un registro de area de concentracion
	 * @param entidad area de dedicacion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EDedicacion dedicacion);
	/**
	 * metodo para actualizar un registro de area de concentracion
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EDedicacion dedicacion);
	/**
	 * metodo para borrar un resgistro de area de concentracion
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);
	/**
	 * metodo para obtener todos los registros de area de concentracion del repositorio
	 * @return lista de registros de area de concentracion
	 */
	public abstract List<MDedicacion> obtener();
	/**
	 * metodo para obtener un registro de area de concentracion del repositorio
	 * @return area de concentracion
	 */
	public abstract MDedicacion obtener(long id);
}
