package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorProduccionAcademicaDocumentoReseña;
import com.cyad.producciones.entity.EProduccionAcademicaDocumentosReseña;
import com.cyad.producciones.model.MProduccionAcademicaDocumentosReseña;
import com.cyad.producciones.repository.ProduccionAcademicaDocumentoReseñaRepository;

/**
 * implementacion de la interface IProduccionAcademicaDocumentoReseñaService
 * para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_produccion_academica_documento_reseña")
public class ProduccionAcademicaDocumentoReseñaService implements IProduccionAcademicaDocumentoReseñaService {
	@Autowired
	@Qualifier("repositorio_produccion_academica_documento_reseña")
	private ProduccionAcademicaDocumentoReseñaRepository repositorio;
	@Autowired
	@Qualifier("convertidor_produccion_academica_documento_reseña")
	private ConvertidorProduccionAcademicaDocumentoReseña convertidor;
	private static final Log logger = LogFactory.getLog(ProduccionAcademicaDocumentoReseñaService.class);

	@Override
	public boolean crear(EProduccionAcademicaDocumentosReseña produccion) {
		try {
			repositorio.save(produccion);
			logger.info("EXITO AL CREAR PRODUCCION DE DOCUMENTO/RESEÑA");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR PRODUCCION DE DOCUMENTO/RESEÑA");
			return false;
		}
	}

	@Override
	public boolean actualizar(EProduccionAcademicaDocumentosReseña produccion) {
		try {
			repositorio.save(produccion);
			logger.info("EXITO AL ACTUALIZAR PRODUCCION DE DOCUMENTO/RESEÑA");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR PRODUCCION DE DOCUMENTO/RESEÑA");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			repositorio.delete(repositorio.findById(id));
			logger.info("EXITO AL BORRAR PRODUCCION DE DOCUMENTO/RESEÑA");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR PRODUCCION DE DOCUMENTO/RESEÑA");
			return false;
		}
	}

	@Override
	public List<MProduccionAcademicaDocumentosReseña> obtener() {
		try {
			List<MProduccionAcademicaDocumentosReseña> lista = convertidor.convertirLista(repositorio.findAll());
			logger.info("EXITO AL LISTAR PRODUCCIONES DE DOCUMENTOS/RESEÑAS");
			return lista;
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR PRODUCCIONES DE DOCUMENTOS/RESEÑAS");
			return null;
		}
	}

	@Override
	public MProduccionAcademicaDocumentosReseña obtener(long id) {
		try {
			MProduccionAcademicaDocumentosReseña documentosReseña = new MProduccionAcademicaDocumentosReseña(
					repositorio.findById(id));
			logger.info("EXITO AL OBTENER PRODUCCION DE DOCUMENTO/RESEÑA");
			return documentosReseña;
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER PRODUCCION DE DOCUMENTO/RESEÑA");
			return null;
		}
	}

}
