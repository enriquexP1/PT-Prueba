package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.posgrado.service.AlumnoService;
import com.cyad.producciones.converter.ConvertidorRevista;
import com.cyad.producciones.entity.ERevista;
import com.cyad.producciones.model.MRevista;
import com.cyad.producciones.repository.RevistaRepository;

/**
 * implementacion de la interface IArticuloService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_revistas")
public class RevistasService implements IRevistaService {
	@Autowired
	@Qualifier("repositorio_revistas")
	private RevistaRepository repositorio;

	@Autowired
	@Qualifier("convertidor_revistas")
	private ConvertidorRevista convertidor;

	private static final Log logger = LogFactory.getLog(AlumnoService.class);

	@Override
	public boolean crear(ERevista revista) {
		try {
			logger.info("EXITO AL CREAR REVISTA");
			repositorio.save(revista);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR REVISTA");
			return false;
		}
	}

	@Override
	public boolean actualizar(ERevista revista) {
		try {
			logger.info("EXITO AL ACTUALIZAR REVISTA");
			repositorio.save(revista);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR REVISTA");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {

			ERevista revista = repositorio.findById(id);
			repositorio.delete(revista);
			logger.info("EXITO AL BORRAR LA REVISTA");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR LA REVISTA");
			return false;
		}
	}

	@Override
	public List<MRevista> obtener() {
		try {
			logger.info("EXITO AL LISTAR LAS REVISTAS");
			return convertidor.convertirLista(repositorio.findAll());

		} catch (Exception e) {
			logger.info("ERROR AL LISTAR LAS REVISTAS");
			return null;
		}
	}

	@Override
	public MRevista obtener(long id) {
		try {
			logger.info("EXITO AL ENCONTRAR REVISTA");
			return new MRevista(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL ENCONTRAR REVISTA");
			return null;
		}
	}

}
