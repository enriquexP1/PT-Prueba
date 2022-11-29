package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorProduccionAcademicaInnovacion;
import com.cyad.producciones.entity.EProduccionAcademicaInnovacion;
import com.cyad.producciones.model.MProduccionAcademicaInnovacion;
import com.cyad.producciones.repository.ProduccionAcademicaInnovacionRepository;

/**
 * implementacion de la interface IProduccionAcademicaInnovacionService para
 * establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_produccion_academica_innovacion")
public class ProduccionAcademicaInnovacionService implements IProduccionAcademicaInnovacionService {
	@Autowired
	@Qualifier("repositorio_produccion_academica_innovacion")
	private ProduccionAcademicaInnovacionRepository repositorio;
	@Autowired
	@Qualifier("convertidor_produccion_academica_innovacion")
	private ConvertidorProduccionAcademicaInnovacion convertidor;
	private static final Log logger = LogFactory.getLog(ProduccionAcademicaInnovacionService.class);

	@Override
	public boolean crear(EProduccionAcademicaInnovacion produccion) {
		try {
			repositorio.save(produccion);
			logger.info("EXITO AL CREAR PRODUCCIÓN DE INNOVACIÓN");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR PRODUCCIÓN DE INNOVACIÓN");
			return false;
		}
	}

	@Override
	public boolean actualizar(EProduccionAcademicaInnovacion produccion) {
		try {
			repositorio.save(produccion);
			logger.info("EXITO AL ACTUALIZAR PRODUCCIÓN DE INNOVACIÓN");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR PRODUCCIÓN DE INNOVACIÓN");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			repositorio.delete(repositorio.findById(id));
			logger.info("EXITO AL BORRAR PRODUCCIÓN DE INNOVACIÓN");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR PRODUCCIÓN DE INNOVACIÓN");
			return false;
		}
	}

	@Override
	public List<MProduccionAcademicaInnovacion> obtener() {
		try {
			List<MProduccionAcademicaInnovacion> lista = convertidor.convertirLista(repositorio.findAll());
			logger.info("EXITO AL LISTAR PRODUCCIONES DE INNOVACIONES");
			return lista;
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR PRODUCCIONES DE INNOVACIONES");
			return null;
		}
	}

	@Override
	public MProduccionAcademicaInnovacion obtener(long id) {
		try {
			MProduccionAcademicaInnovacion produccion = new MProduccionAcademicaInnovacion(repositorio.findById(id));
			logger.info("EXITO AL OBTENER PRODUCCIÓN DE INNOVACIÓN");
			return produccion;
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER PRODUCCIÓN DE INNOVACIÓN");
			return null;
		}
	}
}
