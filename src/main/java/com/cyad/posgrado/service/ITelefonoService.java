package com.cyad.posgrado.service;

import java.util.List;


import com.cyad.posgrado.entity.ETelefono;
import com.cyad.posgrado.model.MTelefono;

public interface ITelefonoService {
	/**
	 * metodo para crear un registro de alumno
	 * @param entidad alumno
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(ETelefono telefono);
	/**
	 * metodo para actualizar un registro de alumno
	 * @param entidad area de alumno
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(ETelefono telefono);
	/**
	 * metodo para borrar un resgistro de alumno
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);
	/**
	 * metodo para obtener todos los registros de alumno del repositorio
	 * @return lista de registros de alumnos
	 */
	public abstract List<MTelefono> obtener();
	/**
	 * metodo para obtener un registro de alumno del repositorio
	 * @return alumno
	 */
	public abstract MTelefono obtener(long id);
}
