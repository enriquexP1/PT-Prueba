package com.cyad.producciones.service;

import java.util.List;

import com.cyad.producciones.entity.EEditor;
import com.cyad.producciones.model.MEditor;

/**
 * Interface para realizar operaciones CRUD al repositorio de editor
 * 
 * @author Enrique Ramírez Martínez
 *
 */
public interface IEditorService {
	/**
	 * metodo para obtener un registro de editor del repositorio
	 * 
	 * @return editor
	 */
	public abstract MEditor buscar(EEditor editor);

	/**
	 * metodo para obtener un registro de editor del repositorio y verificar si está
	 * repetido
	 * 
	 * @return editor
	 */
	public abstract boolean isRepited(EEditor editor);

	/**
	 * metodo para crear un registro de editor
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean crear(EEditor editor);

	/**
	 * metodo para actualizar un registro de editor
	 * 
	 * @param entidad area de concentracion
	 * @return boleano de registro exitoso
	 */
	public abstract boolean actualizar(EEditor editor);

	/**
	 * metodo para borrar un resgistro de editor
	 * 
	 * @param id del registro a borrar
	 * @return boleano de borrado exitoso
	 */
	public abstract boolean borrar(long id);

	/**
	 * metodo para obtener todos los registros de editor del repositorio
	 * 
	 * @return lista de registros de articulo
	 */
	public abstract List<MEditor> obtener();

	/**
	 * metodo para obtener un registro de editor del repositorio
	 * 
	 * @return articulo
	 */
	public abstract MEditor obtener(long id);
}
