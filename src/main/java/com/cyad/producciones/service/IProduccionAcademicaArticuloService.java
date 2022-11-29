package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EProduccionAcademicaArticulo;
import com.cyad.producciones.model.MProduccionAcademicaArticulo;

/**
 * Interface para realizar operaciones CRUD al repositorio de producción
 * académica - articulo
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IProduccionAcademicaArticuloService {
	/**
	 * metodo para crear un registro de producción académica - articulo
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EProduccionAcademicaArticulo produccion);

	/**
	 * metodo para actualizar un registro de producción académica - articulo
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EProduccionAcademicaArticulo produccion);

	/**
	 * metodo para borrar un resgistro de producción académica - articulo
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de producción académica - articulo
	 * del repositorio
	 * 
	 * @return lista de registros de articulo
	 */
	public abstract List<MProduccionAcademicaArticulo> obtener();

	/**
	 * metodo para obtener un registro de producción académica - articulo del
	 * repositorio
	 * 
	 * @return articulo
	 */
	public abstract MProduccionAcademicaArticulo obtener(long id);
}
