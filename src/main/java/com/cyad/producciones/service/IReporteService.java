package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EReporte;
import com.cyad.producciones.model.MReporte;

public interface IReporteService {
	/**
	 * metodo para obtener un registro de reporte del repositorio
	 * 
	 * @return articulo
	 */
	public abstract MReporte buscar(EReporte reporte);

	/**
	 * metodo para obtener un registro de reporte del repositorio y verificar si
	 * está repetido
	 * 
	 * @return articulo
	 */
	public abstract boolean isRepited(EReporte reporte);

	/**
	 * metodo para crear un registro de reporte
	 * 
	 * @param entidad reporte
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EReporte reporte);

	/**
	 * metodo para actualizar un registro de reporte
	 * 
	 * @param entidad reporte
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EReporte reporte);

	/**
	 * metodo para borrar un resgistro de reporte
	 * 
	 * @param id del reporte a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de reporte del repositorio
	 * 
	 * @return lista de registros de reporte
	 */
	public abstract List<MReporte> obtener();

	/**
	 * metodo para obtener un registro de reporte del repositorio
	 * 
	 * @return reporte
	 */
	public abstract MReporte obtener(long id);
}
