package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorProduccionAcademicaConferenciaPresentacion;
import com.cyad.producciones.entity.EProduccionAcademicaConferenciaPresentacion;
import com.cyad.producciones.model.MProduccionAcademicaConferenciaPresentacion;
import com.cyad.producciones.repository.ProduccionAcademicaConferenciaPresentacionRepository;

/**
 * implementacion de la interface IConferenciaPresentacionService para
 * establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_produccion_academica_conferencia_presentacion")
public class ProduccionAcademicaConferenciaPresentacionService
		implements IProduccionAcademicaConferenciaPresentacionService {
	@Autowired
	@Qualifier("repositorio_produccion_academica_conferencia_presentacion")
	private ProduccionAcademicaConferenciaPresentacionRepository repositorio;

	@Autowired
	@Qualifier("convertidor_produccion_academica_conferencia_presentacion")
	private ConvertidorProduccionAcademicaConferenciaPresentacion convertidor;

	private static final Log logger = LogFactory.getLog(ProduccionAcademicaConferenciaPresentacionService.class);

	@Override
	public boolean crear(EProduccionAcademicaConferenciaPresentacion produccion) {
		try {
			repositorio.save(produccion);
			logger.info("EXITO AL CREAR PRODUCCION ACADEMICA DE CONFERENCIA PRESENTACION");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR PRODUCCION ACADEMICA DE CONFERENCIA PRESENTACION");
			return false;
		}
	}

	@Override
	public boolean actualizar(EProduccionAcademicaConferenciaPresentacion produccion) {
		try {
			repositorio.save(produccion);
			logger.info("EXITO AL ACTUALIZAR PRODUCCION ACADEMICA DE CONFERENCIA PRESENTACION");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR PRODUCCION ACADEMICA DE CONFERENCIA PRESENTACION");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			repositorio.delete(repositorio.findById(id));
			logger.info("EXITO AL BORRAR PRODUCCION ACADEMICA DE CONFERENCIA PRESENTANCION");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR PRODUCCION ACADEMICA DE CONFERENCIA PRESENTACION");
			return false;
		}
	}

	@Override
	public List<MProduccionAcademicaConferenciaPresentacion> obtener() {
		try {
			List<MProduccionAcademicaConferenciaPresentacion> conferenciasPresentacions = convertidor
					.convertirLista(repositorio.findAll());
			logger.info("EXITO AL LISTAR PRODUCCIONES ACADEMICAS DE CONFERENCIAS Y PRESENTACIONES");
			return conferenciasPresentacions;
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR PRODUCCIONES ACADEMICAS DE CONFERENCIAS Y PRESENTACIONES");
			return null;
		}
	}

	@Override
	public MProduccionAcademicaConferenciaPresentacion obtener(long id) {
		try {
			MProduccionAcademicaConferenciaPresentacion conferenciaPresentacion = new MProduccionAcademicaConferenciaPresentacion(
					repositorio.findById(id));
			logger.info("EXITO AL OBTENER PRODUCCION ACADEMICA DE CONFERENCIA PRESENTACION");
			return conferenciaPresentacion;
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER PRODUCCION ACADEMICA DE CONFERENCIA PRESENTACION");
			return null;
		}
	}

}
