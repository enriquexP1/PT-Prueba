package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorInstitucion;
import com.cyad.producciones.entity.EInstitucion;
import com.cyad.producciones.model.MInstitucion;
import com.cyad.producciones.repository.IInstitucionRepository;
/**
 * implementacion de la interface IInstitucionService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_instituciones")
public class InstitucionService implements IInstitucionService{
	@Autowired
	@Qualifier("repositorio_institucion")
	private IInstitucionRepository repositorio;

	@Autowired
	@Qualifier("convertidor_institucion")
	private ConvertidorInstitucion convertidor;

	private static final Log logger = LogFactory.getLog(InstitucionService.class);

	@Override
	public boolean crear(EInstitucion institucion) {
		try {
			logger.info("EXITO AL CREAR INSTITUCION");
			repositorio.save(institucion);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR INSTITUCION");
			return false;
		}
	}

	@Override
	public boolean actualizar(EInstitucion institucion) {
		try {
			logger.info("EXITO AL ACTUALIZAR INSTITUCION");
			repositorio.save(institucion);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR INSTITUCION");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			logger.info("EXITO AL BORRAR LA INSTITUCION");
			repositorio.delete(repositorio.findById(id));
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR LA INSTITUCION");
			return false;
		}
	}

	@Override
	public List<com.cyad.producciones.model.MInstitucion> obtener() {
		try {
			logger.info("EXITO AL LISTAR LAS INSTITUCIONES");
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR LAS INSTITUCIONES");
			return null;
		}
	}

	@Override
	public MInstitucion obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER LA INSTITUCION");
			return new MInstitucion(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBETENER LA INSTITUCION");
			return null;
		}
	}
}
