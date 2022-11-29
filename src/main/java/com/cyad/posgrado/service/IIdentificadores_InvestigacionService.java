package com.cyad.posgrado.service;

import java.util.List;


import com.cyad.posgrado.entity.EIdentificadores_Investigacion;
import com.cyad.posgrado.model.MIdentificadores_Investigacion;

public interface IIdentificadores_InvestigacionService {
	/**
	 * metodo para crear un registro de Identificadores de investigacion
	 * @param entidad area de dedicacion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EIdentificadores_Investigacion identificador);
	/**
	 * metodo para actualizar un registro de Identificadores de investigacion
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EIdentificadores_Investigacion identificador);
	/**
	 * metodo para borrar un resgistro de area Identificadores de investigacion
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);
	/**
	 * metodo para obtener todos los registros de Identificadores de investigacion del repositorio
	 * @return lista de registros de area de concentracion
	 */
	public abstract List<MIdentificadores_Investigacion> obtener();
	/**
	 * metodo para obtener un registro de Identificadores de investigacion del repositorio
	 * @return area de concentracion
	 */
	public abstract MIdentificadores_Investigacion obtener(long id);
}
