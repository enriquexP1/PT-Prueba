package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorLibroPalabrasPuente;
import com.cyad.producciones.entity.ELibroPalabrasPuente;
import com.cyad.producciones.model.MLibroPalabrasPuente;
import com.cyad.producciones.repository.LibroPalabrasPuenteRespository;

/**
 * implementacion de la interface IArticuloService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_libro_palabras_puente")
public class LibroPalabrasPuenteService implements ILibroPalabrasPuenteService {
	@Autowired
	@Qualifier("repositorio_libro_palabras_puente")
	private LibroPalabrasPuenteRespository repositorio;

	@Autowired
	@Qualifier("convertidor_libro_palabras_puente")
	private ConvertidorLibroPalabrasPuente convertidor;

	private static final Log logger = LogFactory.getLog(LibroPalabrasPuenteService.class);

	@Override
	public boolean crear(ELibroPalabrasPuente palabra) {
		try {
			logger.info("EXITO AL CREAR PUENTE LIBRO PALABRA");
			repositorio.save(palabra);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR PUENRE LIBRO PALABRA");
			return false;
		}
	}

	@Override
	public boolean actualizar(ELibroPalabrasPuente palabra) {
		try {
			logger.info("EXITO AL ACTUALIZAR PUENTE LIBRO PALABRA");
			repositorio.save(palabra);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR PUENRE LIBRO PALABRA");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			ELibroPalabrasPuente palabra = repositorio.findById(id);
			repositorio.delete(palabra);
			logger.info("EXITO AL BORRAR PUENTE LIBRO PALABRA");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR PUENTE LIBRO PALABRA");
			return false;
		}
	}

	@Override
	public List<MLibroPalabrasPuente> obtener() {
		try {
			logger.info("EXITO AL LISTAR PUENTE LIBRO PALABRA");
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR PUENTE LIBRO PALABRA");
			return null;
		}
	}

	@Override
	public MLibroPalabrasPuente obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER PUENTE LIBRO PALABRA");
			return new MLibroPalabrasPuente(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER PUENTE LIBRO PALABRA");
			return null;
		}
	}

}
