package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorProduccionAcademicaDesarrollo;
import com.cyad.producciones.entity.EProduccionAcademicaDesarrollo;
import com.cyad.producciones.model.MProduccionAcademicaDesarrollo;
import com.cyad.producciones.repository.ProduccionAcademicaDesarrolloRepository;

/**
 * implementacion de la interface IProduccionAcademicaDesarrolloService para
 * establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_produccion_academica_desarrollo")
public class ProduccionAcademicaDesarrolloService implements IProduccionAcademicaDesarrolloService {
	@Autowired
	@Qualifier("repositorio_produccion_academica_desarrollo")
	private ProduccionAcademicaDesarrolloRepository repositorio;
	@Autowired
	@Qualifier("convertidor_produccion_academica_desarrollo")
	private ConvertidorProduccionAcademicaDesarrollo convertidor;
	private static final Log logger = LogFactory.getLog(ProduccionAcademicaDesarrolloService.class);

	@Override
	public boolean crear(EProduccionAcademicaDesarrollo produccion) {
		try {
			repositorio.save(produccion);
			logger.info("EXITO AL CREAR PRODUCCIÓN DE DESARROLLO");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR PRODUCCIÓN DE DESARROLLO");
			return false;
		}
	}

	@Override
	public boolean actualizar(EProduccionAcademicaDesarrollo produccion) {
		try {
			repositorio.save(produccion);
			logger.info("EXITO AL ACTUALIZAR PRODUCCIÓN DE DESARROLLO");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR PRODUCCIÓN DE DESARROLLO");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			repositorio.delete(repositorio.findById(id));
			logger.info("EXITO AL BORRAR PRODUCCIÓN DE DESARROLLO");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR PRODUCCIÓN DE DESARROLLO");
			return false;
		}
	}

	@Override
	public List<MProduccionAcademicaDesarrollo> obtener() {
		try {
			List<MProduccionAcademicaDesarrollo> lista = convertidor.convertirLista(repositorio.findAll());
			logger.info("EXITO AL LISTAR PRODUCCIONES DE DESARROLLO");
			return lista;
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR PRODUCCIONES DE DESARROLLO");
			return null;
		}
	}

	@Override
	public MProduccionAcademicaDesarrollo obtener(long id) {
		try {
			MProduccionAcademicaDesarrollo produccion = new MProduccionAcademicaDesarrollo(repositorio.findById(id));
			logger.info("EXITO AL OBTENER PRODUCCIÓN DE DESARROLLO");
			return produccion;
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER PRODUCCIÓN DE DESARROLLO");
			return null;
		}
	}
}
