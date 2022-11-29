package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EOrigenReporte;
import com.cyad.producciones.model.MOrigenReporte;

public interface IOrigenReporteService {
	/**
	 * metodo para crear un registro de origenReporte
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EOrigenReporte origenReporte);

	/**
	 * metodo para actualizar un registro de origenReporte
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EOrigenReporte origenReporte);

	/**
	 * metodo para borrar un resgistro de origenReporte
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de origenReporte del repositorio
	 * 
	 * @return lista de registros de revista
	 */
	public abstract List<MOrigenReporte> obtener();

	/**
	 * metodo para obtener un registro de origenReporte del repositorio
	 * 
	 * @return revista
	 */
	public abstract MOrigenReporte obtener(long id);
}
