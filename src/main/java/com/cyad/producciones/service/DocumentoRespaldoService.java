package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorDocumentoRespaldo;
import com.cyad.producciones.entity.EDocumentoRespaldo;
import com.cyad.producciones.model.MDocumentoRespaldo;
import com.cyad.producciones.repository.DocumentoRespaldoRepository;

/**
 * implementacion de la interface IDesarroloService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_documento_respaldo")
public class DocumentoRespaldoService implements IDocumentoRespaldoService {
	@Autowired
	@Qualifier("repositorio_documento_respaldo")
	private DocumentoRespaldoRepository repositorio;

	@Autowired
	@Qualifier("convertidor_documento_respaldo")
	private ConvertidorDocumentoRespaldo convertidor;

	private static final Log logger = LogFactory.getLog(DocumentoRespaldoService.class);

	@Override
	public boolean crear(EDocumentoRespaldo doc) {
		try {
			logger.info("EXITO AL CREAR DOCUMENTO");
			repositorio.save(doc);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR DOCUMENTO");
			return false;
		}
	}

	@Override
	public boolean actualizar(EDocumentoRespaldo doc) {
		try {
			logger.info("EXITO AL ACTUALIZAR DOCUMENTO");
			repositorio.save(doc);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR DOCUMENTO");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			logger.info("EXITO AL BORRAR DOCUMENTO");
			repositorio.delete(repositorio.findById(id));
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR DOCUMENTO");
			return false;
		}
	}

	@Override
	public List<MDocumentoRespaldo> obtener() {
		try {
			logger.info("EXITO AL LISTAR DOCUMENTOS");
			return convertidor.convertiLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR DOCUMENTOS");
			return null;
		}
	}

	@Override
	public MDocumentoRespaldo obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER DOCUMENTO");
			return new MDocumentoRespaldo(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER DOCUMENTO");
			return null;
		}
	}

}
