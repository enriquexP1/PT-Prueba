package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorProduccionAcademicaReporte;
import com.cyad.producciones.entity.EProduccionAcademicaReporte;
import com.cyad.producciones.model.MProduccionAcademicaReporte;
import com.cyad.producciones.repository.ProduccionAcademicaReporteRepository;

/**
 * implementacion de la interface IProduccionAcademicaReporteService para
 * establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_produccion_academica_reporte")
public class ProduccionAcademicaReporteService implements IProduccionAcademicaReporteService {
	@Autowired
	@Qualifier("repositorio_produccion_academica_reporte")
	private ProduccionAcademicaReporteRepository repositorio;
	@Autowired
	@Qualifier("convertidor_produccion_academica_reporte")
	private ConvertidorProduccionAcademicaReporte convertidor;
	private static final Log logger = LogFactory.getLog(ProduccionAcademicaReporteService.class);

	@Override
	public boolean crear(EProduccionAcademicaReporte produccion) {
		try {
			repositorio.save(produccion);
			logger.info("EXITO AL CREAR PRODUCCION DE REPORTE");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR PRODUCCION DE REPORTE");
			return false;
		}
	}

	@Override
	public boolean actualizar(EProduccionAcademicaReporte produccion) {
		try {
			repositorio.save(produccion);
			logger.info("EXITO AL ACTUALIZAR PRODUCCION DE REPORTE");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR PRODUCCION DE REPORTE");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			repositorio.delete(repositorio.findById(id));
			logger.info("EXITO AL BORRAR PRODUCCION DE REPORTE");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR PRODUCCION DE REPORTE");
			return false;
		}
	}

	@Override
	public List<MProduccionAcademicaReporte> obtener() {
		try {
			List<MProduccionAcademicaReporte> lista = convertidor.convertirLista(repositorio.findAll());
			logger.info("EXITO AL LISTAR PRODUCCIONES DE REPORTES");
			return lista;
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR PRODUCCIONES DE REPORTES");
			return null;
		}
	}

	@Override
	public MProduccionAcademicaReporte obtener(long id) {
		try {
			MProduccionAcademicaReporte reporte = new MProduccionAcademicaReporte(repositorio.findById(id));
			logger.info("EXITO AL OBTENER PRODUCCION DE REPORTE");
			return reporte;
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER PRODUCCION DE REPORTE");
			return null;
		}
	}

}
