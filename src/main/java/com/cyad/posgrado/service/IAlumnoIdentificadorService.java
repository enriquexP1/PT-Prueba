package com.cyad.posgrado.service;

import java.util.List;

import com.cyad.posgrado.entity.EAlumno_Identificador_puente;
import com.cyad.posgrado.model.MAlumno_Identificador_puente;

public interface IAlumnoIdentificadorService {
	/**
	 * metodo para crear un registro de area de concentracion
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EAlumno_Identificador_puente alumnoIdentificador);
	/**
	 * metodo para actualizar un registro de area de concentracion
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EAlumno_Identificador_puente alumnoIdentificador);
	/**
	 * metodo para borrar un resgistro de area de concentracion
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);
	/**
	 * metodo para obtener todos los registros de area de concentracion del repositorio
	 * @return lista de registros de area de concentracion
	 */
	public abstract List<MAlumno_Identificador_puente> obtener();
	/**
	 * metodo para obtener un registro de area de concentracion del repositorio
	 * @return area de concentracion
	 */
	public abstract MAlumno_Identificador_puente  obtener(long id);
}
