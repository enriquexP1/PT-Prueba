package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.ERolParticipacion;
import com.cyad.producciones.model.MRolParticipacion;
/**
 * Interface para realizar operaciones CRUD al repositorio de rol de participacion
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IRolParticipacionService {
	/**
	 * metodo para crear un registro de rol de participacion
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(ERolParticipacion rol);

	/**
	 * metodo para actualizar un registro de rol de participacion
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(ERolParticipacion rol);

	/**
	 * metodo para borrar un resgistro de rol de participacion
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de rol de participacion del
	 * repositorio
	 * 
	 * @return lista de registros de articulo
	 */
	public abstract List<MRolParticipacion> obtener();

	/**
	 * metodo para obtener un registro de rol de participacion del repositorio
	 * 
	 * @return articulo
	 */
	public abstract MRolParticipacion obtener(long id);
}
