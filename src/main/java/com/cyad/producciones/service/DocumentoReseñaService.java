package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorDocumentosReseñas;
import com.cyad.producciones.entity.EDocumentos_Reseñas;
import com.cyad.producciones.model.MDocumentos_Reseñas;
import com.cyad.producciones.repository.DocumentosReseñasRepository;

/**
 * implementacion de la interface IDocumentosReseña para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_documento_reseña")
public class DocumentoReseñaService implements IDocumentosReseñaService {
	@Autowired
	@Qualifier("repositorio_documento_reseña")
	private DocumentosReseñasRepository repositorio;

	@Autowired
	@Qualifier("convertidor_documento_reseña")
	private ConvertidorDocumentosReseñas convertidor;

	private static final Log logger = LogFactory.getLog(DocumentoReseñaService.class);

	@Override
	public boolean crear(EDocumentos_Reseñas doc) {
		try {
			if (isRepited(doc) == false) {
				repositorio.save(doc);
				logger.info("EXITO AL CREAR DOCUMENTO/RESEÑA");
				return true;
			} else {
				logger.info("DOCUMENTO O RESEÑA YA EXISTENTE");
				return false;
			}
		} catch (Exception e) {
			logger.info("ERROR AL CREAR DOCUMENTO/RESEÑA");
			return false;

		}
	}

	@Override
	public boolean actualizar(EDocumentos_Reseñas doc) {
		try {
			logger.info("EXITO AL ACTUALIZAR DOCUMENTO/RESEÑA");
			repositorio.save(doc);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR DOCUMENTO/RESEÑA");
			return false;

		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			logger.info("EXITO AL BORRAR DOCUMENTO/RESEÑA");
			repositorio.delete(repositorio.findById(id));
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR DOCUMENTO/RESEÑA");
			return false;

		}
	}

	@Override
	public List<MDocumentos_Reseñas> obtener() {
		try {
			logger.info("EXITO AL LISTAR DOCUMENTOS/RESEÑAS");
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR DOCUMENTOS/RESEÑAS");
			return null;
		}
	}

	@Override
	public MDocumentos_Reseñas obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER DOCUMENTO/RESEÑA");
			return new MDocumentos_Reseñas(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER DOCUMENTO/RESEÑA");
			return null;
		}
	}

	@Override
	public MDocumentos_Reseñas buscar(EDocumentos_Reseñas documento_Reseña) {
		MDocumentos_Reseñas documentos_Reseñas2 = null;
		try {
			List<MDocumentos_Reseñas> documentos_Reseñas = convertidor.convertirLista(repositorio.findAll());
			MDocumentos_Reseñas documentoAux = new MDocumentos_Reseñas(documento_Reseña);
			for (MDocumentos_Reseñas docRes : documentos_Reseñas) {
				if (docRes.getNombre().equals(documentoAux.getNombre())
						&& docRes.getTitulo().equals(documentoAux.getTitulo())) {
					documentos_Reseñas2 = docRes;
				}
			}
		} catch (Exception e) {
			logger.info("ERROR AL ENCONTRAR DOCUMENTO O RESEÑA");
		}
		return documentos_Reseñas2;
	}

	@Override
	public boolean isRepited(EDocumentos_Reseñas documento_Reseña) {
		boolean determinante = false;
		try {
			List<MDocumentos_Reseñas> documentos_Reseñas = convertidor.convertirLista(repositorio.findAll());
			MDocumentos_Reseñas documentoAux = new MDocumentos_Reseñas(documento_Reseña);
			for (MDocumentos_Reseñas docRes : documentos_Reseñas) {
				if (docRes.getNombre().equals(documentoAux.getNombre())
						&& docRes.getTitulo().equals(documentoAux.getTitulo())) {
					determinante = true;
				}
			}
		} catch (Exception e) {
			logger.info("ERROR AL ENCONTRAR DOCUMENTO O RESEÑA");
		}
		return determinante;
	}

}
