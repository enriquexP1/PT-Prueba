package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EProduccionAcademicaReporte;
import com.cyad.producciones.model.MProduccionAcademicaReporte;

/**
 * Interface para realizar operaciones CRUD al repositorio de producción
 * académica - reporte
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IProduccionAcademicaReporteService {
	/**
	 * metodo para crear un registro de producción académica - reporte
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EProduccionAcademicaReporte produccion);

	/**
	 * metodo para actualizar un registro de producción académica - reporte
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EProduccionAcademicaReporte produccion);

	/**
	 * metodo para borrar un resgistro de producción académica - reporte
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de producción académica - reporte del
	 * repositorio
	 * 
	 * @return lista de registros de reporte
	 */
	public abstract List<MProduccionAcademicaReporte> obtener();

	/**
	 * metodo para obtener un registro de producción académica - reportes del
	 * repositorio
	 * 
	 * @return reporte
	 */
	public abstract MProduccionAcademicaReporte obtener(long id);
}
