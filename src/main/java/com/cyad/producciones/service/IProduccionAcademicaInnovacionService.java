package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EProduccionAcademicaInnovacion;
import com.cyad.producciones.model.MProduccionAcademicaInnovacion;

/**
 * Interface para realizar operaciones CRUD al repositorio de producción
 * académica - innovación
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IProduccionAcademicaInnovacionService {
	/**
	 * metodo para crear un registro de producción académica - innovacion
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EProduccionAcademicaInnovacion produccion);

	/**
	 * metodo para actualizar un registro de producción académica - innovacion
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EProduccionAcademicaInnovacion produccion);

	/**
	 * metodo para borrar un resgistro de producción académica - innovacion
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de producción académica - innovacion
	 * del repositorio
	 * 
	 * @return lista de registros de innovacion
	 */
	public abstract List<MProduccionAcademicaInnovacion> obtener();

	/**
	 * metodo para obtener un registro de producción académica - innovacion del
	 * repositorio
	 * 
	 * @return innovacion
	 */
	public abstract MProduccionAcademicaInnovacion obtener(long id);
}
