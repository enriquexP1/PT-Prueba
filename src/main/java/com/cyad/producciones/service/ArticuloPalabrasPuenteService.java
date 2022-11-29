package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.posgrado.service.AlumnoService;
import com.cyad.producciones.converter.ConvertidorArticuloPalabrasPuente;
import com.cyad.producciones.entity.EArticuloPalabrasPuente;
import com.cyad.producciones.model.MArticuloPalabrasPuente;
import com.cyad.producciones.repository.ArticuloPalabrasPuenteRepository;

/**
 * implementacion de la interface IArticuloService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_articulo_palabras_puente")
public class ArticuloPalabrasPuenteService implements IArticuloPalabrasPuenteService {
	@Autowired
	@Qualifier("repositorio_articulo_palabras_puente")
	private ArticuloPalabrasPuenteRepository repositorio;

	@Autowired
	@Qualifier("convertidor_articulo_palabras_puente")
	private ConvertidorArticuloPalabrasPuente convertidor;

	private static final Log logger = LogFactory.getLog(AlumnoService.class);

	@Override
	public boolean crear(EArticuloPalabrasPuente palabra) {
		try {
			logger.info("EXITO AL CREAR PUENTE ARTICULO PALABRA");
			repositorio.save(palabra);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR PUENRE ARTICULO PALABRA");
			return false;
		}
	}

	@Override
	public boolean actualizar(EArticuloPalabrasPuente palabra) {
		try {
			logger.info("EXITO AL ACTUALIZAR PUENTE ARTICULO PALABRA");
			repositorio.save(palabra);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR PUENRE ARTICULO PALABRA");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			EArticuloPalabrasPuente palabra = repositorio.findById(id);
			repositorio.delete(palabra);
			logger.info("EXITO AL BORRAR PUENTE ARTICULO PALABRA");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR PUENTE ARTICULO PALABRA");
			return false;
		}
	}

	@Override
	public List<MArticuloPalabrasPuente> obtener() {
		try {
			logger.info("EXITO AL LISTAR PUENTE ARTICULO PALABRA");
			return convertidor.ConvertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR PUENTE ARTICULO PALABRA");
			return null;
		}
	}

	@Override
	public MArticuloPalabrasPuente obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER PUENTE ARTICULO PALABRA");
			return new MArticuloPalabrasPuente(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER PUENTE ARTCULO PALABRA");
			return null;
		}
	}

}
