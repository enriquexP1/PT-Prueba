package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EProduccionAcademicaMemoria;
import com.cyad.producciones.model.MProduccionAcademicaMemoria;

/**
 * Interface para realizar operaciones CRUD al repositorio de producción
 * académica - memoria
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IProduccionAcademicaMemoriaService {
	/**
	 * metodo para crear un registro de producción académica - memoria
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EProduccionAcademicaMemoria produccion);

	/**
	 * metodo para actualizar un registro de producción académica - memoria
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */

	public abstract boolean actualizar(EProduccionAcademicaMemoria produccion);

	/**
	 * metodo para borrar un resgistro de producción académica - memoria
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de producción académica - memoria del
	 * repositorio
	 * 
	 * @return lista de registros de memorias
	 */
	public abstract List<MProduccionAcademicaMemoria> obtener();

	/**
	 * metodo para obtener un registro de producción académica - memoria del
	 * repositorio
	 * 
	 * @return memoria
	 */
	public abstract MProduccionAcademicaMemoria obtener(long id);

}
