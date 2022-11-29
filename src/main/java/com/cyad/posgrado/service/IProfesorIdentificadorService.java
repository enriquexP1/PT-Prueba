package com.cyad.posgrado.service;

import java.util.List;


import com.cyad.posgrado.entity.EProfesor_Identificador_puente;
import com.cyad.posgrado.model.MProfesor_Identificador_puente;

public interface IProfesorIdentificadorService {
	/**
	 * metodo para crear un registro de profesor Identificado
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EProfesor_Identificador_puente profesorIdentificador);
	/**
	 * metodo para actualizar un registro de profesor Identificado
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EProfesor_Identificador_puente profesorIdentificador);
	/**
	 * metodo para borrar un resgistro de profesor Identificado
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);
	/**
	 * metodo para obtener todos los registros de profesor Identificadodel repositorio
	 * @return lista de registros de area de concentracion
	 */
	public abstract List<MProfesor_Identificador_puente> obtener();
	/**
	 * metodo para obtener un registro de profesor Identificador del repositorio
	 * @return area de concentracion
	 */
	public abstract MProfesor_Identificador_puente  obtener(long id);
}
