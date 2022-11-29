package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.posgrado.service.AlumnoService;
import com.cyad.producciones.converter.ConvertidorPalabrasClave;
import com.cyad.producciones.entity.EPalabrasClave;
import com.cyad.producciones.model.MPalabrasClave;
import com.cyad.producciones.repository.PalabrasClaveRepository;

/**
 * implementacion de la interface IPalabrasclaveService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_palabras_clave")
public class PalabrasClaveService implements IPalabrasClaveService {
	@Autowired
	@Qualifier("repositorio_palabras_clave")
	private PalabrasClaveRepository repositorio;

	@Autowired
	@Qualifier("convertidor_palabras_clave")
	private ConvertidorPalabrasClave convertidor;

	private static final Log logger = LogFactory.getLog(AlumnoService.class);

	@Override
	public boolean crear(EPalabrasClave palabra) {
		try {
			logger.info("EXITO AL CREAR PALABRA CLAVE");
			repositorio.save(palabra);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR PALABRA CLAVE");
			return false;
		}
	}

	@Override
	public boolean actualizar(EPalabrasClave palabra) {
		try {
			logger.info("EXITO AL ACTUALIZAR PALABRA CLAVE");
			repositorio.save(palabra);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR PALABRA CLAVE");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			EPalabrasClave palabra = repositorio.findById(id);
			repositorio.delete(palabra);
			logger.info("EXITO AL BORRAR PALABRA CLAVE");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR PALABRA CLAVE");
			return false;
		}
	}

	@Override
	public List<MPalabrasClave> obtener() {
		try {
			logger.info("EXITO AL LISTAR PALABRAS CLAVE");
			return convertidor.ConvertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR PALABRAS CLAVE");
			return null;
		}
	}

	@Override
	public MPalabrasClave obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER PALABRA CLAVE");
			return new MPalabrasClave(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER PALABRA CLAVE");
			return null;
		}
	}

}
