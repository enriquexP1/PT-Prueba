package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EProduccionAcademicaDesarrollo;
import com.cyad.producciones.model.MProduccionAcademicaDesarrollo;

/**
 * Interface para realizar operaciones CRUD al repositorio de producción
 * académica - desarrollo tecnológico
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IProduccionAcademicaDesarrolloService {
	/**
	 * metodo para crear un registro de producción académica - desarrollo
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EProduccionAcademicaDesarrollo produccion);

	/**
	 * metodo para actualizar un registro de producción académica - desarrollo
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EProduccionAcademicaDesarrollo produccion);

	/**
	 * metodo para borrar un resgistro de producción académica - desarrollo
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de producción académica - desarrollo
	 * del repositorio
	 * 
	 * @return lista de registros de desarrollo
	 */
	public abstract List<MProduccionAcademicaDesarrollo> obtener();

	/**
	 * metodo para obtener un registro de producción académica - desarrollo del
	 * repositorio
	 * 
	 * @return desarrollo
	 */
	public abstract MProduccionAcademicaDesarrollo obtener(long id);
}
