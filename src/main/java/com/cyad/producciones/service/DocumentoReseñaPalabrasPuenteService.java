package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorDocumentoReseñaPalabrasPuente;
import com.cyad.producciones.entity.EDocumentoReseñaPalabrasPuente;
import com.cyad.producciones.model.MDocumentoReseñaPalabrasPuente;
import com.cyad.producciones.repository.DocumentoReseñaPalabrasPuenteRespository;

/**
 * implementacion de la interface IArticuloService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_documento_reseña_palabras_puente")
public class DocumentoReseñaPalabrasPuenteService implements IDocumentoReseñaPalabrasPuenteService {
	@Autowired
	@Qualifier("repositorio_documento_reseña_palabras_puente")
	private DocumentoReseñaPalabrasPuenteRespository repositorio;

	@Autowired
	@Qualifier("convertidor_documento_reseña_palabras_puente")
	private ConvertidorDocumentoReseñaPalabrasPuente convertidor;

	private static final Log logger = LogFactory.getLog(DocumentoReseñaPalabrasPuenteService.class);

	@Override
	public boolean crear(EDocumentoReseñaPalabrasPuente palabra) {
		try {
			logger.info("EXITO AL CREAR PUENTE DOCUMENTO/RESEÑA PALABRA");
			repositorio.save(palabra);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR PUENRE DOCUMENTO/RESEÑA PALABRA");
			return false;
		}
	}

	@Override
	public boolean actualizar(EDocumentoReseñaPalabrasPuente palabra) {
		try {
			logger.info("EXITO AL ACTUALIZAR PUENTE DOCUMENTO/RESEÑA PALABRA");
			repositorio.save(palabra);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR PUENTE DOCUMENTO/RESEÑA PALABRA");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			EDocumentoReseñaPalabrasPuente palabra = repositorio.findById(id);
			repositorio.delete(palabra);
			logger.info("EXITO AL BORRAR PUENTE DOCUMENTO/RESEÑA PALABRA");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR PUENTE DOCUMENTO/RESEÑA PALABRA");
			return false;
		}
	}

	@Override
	public List<MDocumentoReseñaPalabrasPuente> obtener() {
		try {
			logger.info("EXITO AL LISTAR PUENTE DOCUMENTO/RESEÑA PALABRA");
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR PUENTE DOCUMENTO/RESEÑA PALABRA");
			return null;
		}
	}

	@Override
	public MDocumentoReseñaPalabrasPuente obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER PUENTE DOCUMENTO/RESEÑA PALABRA");
			return new MDocumentoReseñaPalabrasPuente(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER PUENTE DOCUMENTO/RESEÑA PALABRA");
			return null;
		}
	}
}
