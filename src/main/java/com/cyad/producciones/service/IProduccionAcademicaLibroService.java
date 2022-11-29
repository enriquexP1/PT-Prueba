package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EProduccionAcademicaLibro;
import com.cyad.producciones.model.MProduccionAcademicaLibro;

/**
 * Interface para realizar operaciones CRUD al repositorio de producción
 * académica - libro
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IProduccionAcademicaLibroService {
	/**
	 * metodo para crear un registro de producción académica - libro
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EProduccionAcademicaLibro produccion);

	/**
	 * metodo para actualizar un registro de producción académica - libro
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EProduccionAcademicaLibro produccion);

	/**
	 * metodo para borrar un resgistro de producción académica - libro
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de producción académica - libro del
	 * repositorio
	 * 
	 * @return lista de registros de libro
	 */
	public abstract List<MProduccionAcademicaLibro> obtener();

	/**
	 * metodo para obtener un registro de producción académica - libro del
	 * repositorio
	 * 
	 * @return libro
	 */
	public abstract MProduccionAcademicaLibro obtener(long id);
}
