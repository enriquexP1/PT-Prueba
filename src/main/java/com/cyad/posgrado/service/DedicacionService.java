package com.cyad.posgrado.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.posgrado.converter.ConvertidorDedicacion;
import com.cyad.posgrado.entity.EDedicacion;
import com.cyad.posgrado.model.MDedicacion;
import com.cyad.posgrado.repository.DedicacionRepository;

/**
 * implementacion de la interface IDedicacion para establecer el servicio
 * @author Enrique Ramírez Martínez 
 *
 */
@Service("servicio_dedicacion")
public class DedicacionService implements IDedicacionService{
	@Autowired
	@Qualifier("repositorio_dedicacion")
	private DedicacionRepository repositorio;
	
	@Autowired
	@Qualifier("convertidor_dedicacion")
	private ConvertidorDedicacion convertidor;
	
	private static final Log logger = LogFactory.getLog(PlanService.class);

	@Override
	public boolean crear(EDedicacion dedicacion) {
		try {
			logger.info("CREACION DE DEDICACION EXITOSA");
			repositorio.save(dedicacion);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR DEDICACION");
			return false;
		}
	}

	@Override
	public boolean actualizar(EDedicacion dedicacion) {
		try {
			logger.info("ACTUALIZACION DE DEDICACION EXITOSA");
			repositorio.save(dedicacion);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR DEDICACION");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			EDedicacion dedicacion = repositorio.findById(id);
			repositorio.delete(dedicacion);
			logger.info("ELIMINACION EXITOSA DE DEDICACION");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ELIMINAR DEDICACION");
			return false;
		}
	}

	@Override
	public List<MDedicacion> obtener() {
		try {
			logger.info("EXITO AL LISTAR DEDICACION");
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR DEDICACION");
			return null;
		}
	}

	@Override
	public MDedicacion obtener(long id) {
		try {
			logger.info("EXITO AL ENCONTRAR DEDICACION");
			return new MDedicacion(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL ENCONTRAR DEDICACION");
			return null;
		}
	}
	
}
