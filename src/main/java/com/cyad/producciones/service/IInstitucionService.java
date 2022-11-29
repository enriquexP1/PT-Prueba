package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.model.MInstitucion;
import com.cyad.producciones.entity.EInstitucion;

public interface IInstitucionService {
	/**
	 * metodo para crear un registro de institucion
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EInstitucion institucion);

	/**
	 * metodo para actualizar un registro de institucion
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EInstitucion institucion);

	/**
	 * metodo para borrar un resgistro de institucion
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de institucion del repositorio
	 * 
	 * @return lista de registros de revista
	 */
	public abstract List<MInstitucion> obtener();

	/**
	 * metodo para obtener un registro de institucion del repositorio
	 * 
	 * @return revista
	 */
	public abstract MInstitucion obtener(long id);
}
