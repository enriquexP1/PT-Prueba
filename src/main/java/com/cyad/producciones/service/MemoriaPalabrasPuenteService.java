package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorMemoriaPalabrasPuente;
import com.cyad.producciones.entity.EMemoriaPalabrasPuente;
import com.cyad.producciones.model.MMemoriaPalabrasPuente;
import com.cyad.producciones.repository.MemoriaPalabrasPuenteRespository;

/**
 * implementacion de la interface IArticuloService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_memoria_palabras_puente")
public class MemoriaPalabrasPuenteService implements IMemoriaPalabrasPuenteService {
	@Autowired
	@Qualifier("repositorio_memoria_palabras_puente")
	private MemoriaPalabrasPuenteRespository repositorio;

	@Autowired
	@Qualifier("convertidor_memoria_palabras_puente")
	private ConvertidorMemoriaPalabrasPuente convertidor;

	private static final Log logger = LogFactory.getLog(MemoriaPalabrasPuenteService.class);

	@Override
	public boolean crear(EMemoriaPalabrasPuente palabra) {
		try {
			logger.info("EXITO AL CREAR PUENTE MEMORIA PALABRA");
			repositorio.save(palabra);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR PUENRE MEMORIA PALABRA");
			return false;
		}
	}

	@Override
	public boolean actualizar(EMemoriaPalabrasPuente palabra) {
		try {
			logger.info("EXITO AL ACTUALIZAR PUENTE MEMORIA PALABRA");
			repositorio.save(palabra);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR PUENRE MEMORIA PALABRA");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			EMemoriaPalabrasPuente palabra = repositorio.findById(id);
			repositorio.delete(palabra);
			logger.info("EXITO AL BORRAR PUENTE MEMORIA PALABRA");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR PUENTE MEMORIA PALABRA");
			return false;
		}
	}

	@Override
	public List<MMemoriaPalabrasPuente> obtener() {
		try {
			logger.info("EXITO AL LISTAR PUENTE MEMORIA PALABRA");
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR PUENTE MEMORIA PALABRA");
			return null;
		}
	}

	@Override
	public MMemoriaPalabrasPuente obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER PUENTE MEMORIA PALABRA");
			return new MMemoriaPalabrasPuente(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER PUENTE MEMORIA PALABRA");
			return null;
		}
	}
}
