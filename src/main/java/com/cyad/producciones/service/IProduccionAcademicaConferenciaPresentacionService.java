package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EProduccionAcademicaConferenciaPresentacion;
import com.cyad.producciones.model.MProduccionAcademicaConferenciaPresentacion;

/**
 * Interface para realizar operaciones CRUD al repositorio de producción
 * académica - ProduccionAcademicaConferenciaPresentacion
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IProduccionAcademicaConferenciaPresentacionService {
	/**
	 * metodo para crear un registro de producción académica -
	 * ConferenciaPresentacion
	 * 
	 * @param entidad ProduccionAcadémicaConferenciaPresentacion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EProduccionAcademicaConferenciaPresentacion produccion);

	/**
	 * metodo para actualizar un registro de producción académica -
	 * ConferenciaPresentacion
	 * 
	 * @param entidad ProduccionAcadémicaConferenciaPresentacion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EProduccionAcademicaConferenciaPresentacion produccion);

	/**
	 * metodo para borrar un resgistro de producción académica -
	 * ConferenciaPresentacion
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de producción académica -
	 * ConferenciaPresentacion del repositorio
	 * 
	 * @return lista de registros de ProduccionAcademicaConferenciaPresentacion
	 */
	public abstract List<MProduccionAcademicaConferenciaPresentacion> obtener();

	/**
	 * metodo para obtener un registro de producción académica -
	 * ConferenciaPresentacion del repositorio
	 * 
	 * @return ProduccionAcademicaConferenciaPresentacion
	 */
	public abstract MProduccionAcademicaConferenciaPresentacion obtener(long id);
}
