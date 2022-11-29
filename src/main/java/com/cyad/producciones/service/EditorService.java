package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorEditor;
import com.cyad.producciones.entity.EEditor;
import com.cyad.producciones.model.MEditor;
import com.cyad.producciones.repository.EditorRepository;

/**
 * implementacion de la interface IEditorService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_editor")
public class EditorService implements IEditorService {
	@Autowired
	@Qualifier("repositorio_editor")
	private EditorRepository repositorio;

	@Autowired
	@Qualifier("convertidor_editor")
	private ConvertidorEditor convertidor;

	private static final Log logger = LogFactory.getLog(EditorService.class);

	@Override
	public boolean crear(EEditor editor) {
		try {
			if (isRepited(editor) == false) {
				repositorio.save(editor);
				logger.info("EXITO AL CREAR EDITOR");
				return true;
			} else {
				logger.info("EDITOR YA EXISTENTE");
				return false;
			}
		} catch (Exception e) {
			logger.info("ERROR AL CREAR EDITOR");
			return false;
		}
	}

	@Override
	public boolean actualizar(EEditor editor) {
		try {
			repositorio.save(editor);
			logger.info("EXITO AL ACTUALIZAR EDITOR");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR EDITOR");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			repositorio.delete(repositorio.findById(id));
			logger.info("EXITO AL BORRAR EDITOR");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR EDITOR");
			return false;
		}
	}

	@Override
	public List<MEditor> obtener() {
		try {
			List<MEditor> editores = convertidor.convertirLista(repositorio.findAll());
			logger.info("EXITO AL LISTAR EDITORES");
			return editores;
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR EDITORES");
			return null;
		}
	}

	@Override
	public MEditor obtener(long id) {
		try {
			MEditor editor = new MEditor(repositorio.findById(id));
			logger.info("EXITO AL OBTENER EDITOR");
			return editor;
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER EDITOR");
			return null;
		}
	}

	@Override
	public MEditor buscar(EEditor editor) {
		MEditor editor2 = null;
		try {
			List<MEditor> editores = convertidor.convertirLista(repositorio.findAll());
			MEditor editorAux = new MEditor(editor);
			for (MEditor edit : editores) {
				if (edit.getNombre().equals(editorAux.getNombre())) {
					if (edit.getPrimerApellido().equals(editorAux.getPrimerApellido())) {
						if (edit.getSegundoApellido().equals(editorAux.getSegundoApellido())) {
							editor2 = edit;
						}

					}
				}
			}
		} catch (Exception e) {
			logger.info("ERROR AL ENCONTRAR EDITOR");
		}
		return editor2;
	}

	@Override
	public boolean isRepited(EEditor editor) {
		boolean determinante = false;
		try {
			List<MEditor> editores = convertidor.convertirLista(repositorio.findAll());
			MEditor editorAux = new MEditor(editor);
			for (MEditor edit : editores) {
				if (edit.getNombre().equals(editorAux.getNombre())) {
					if (edit.getPrimerApellido().equals(editorAux.getPrimerApellido())) {
						if (edit.getSegundoApellido().equals(editorAux.getSegundoApellido())) {
							determinante = true;
						}

					}
				}
			}
		} catch (Exception e) {
			logger.info("ERROR AL ENCONTRAR EDITOR");
		}
		return determinante;
	}

}
