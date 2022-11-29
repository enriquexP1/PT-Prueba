package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorReportePalabrasPuente;
import com.cyad.producciones.entity.EReportePalabrasPuente;
import com.cyad.producciones.model.MReportePalabrasPuente;
import com.cyad.producciones.repository.ReportePalabrasPuenteRespository;

/**
 * implementacion de la interface IArticuloService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_reporte_palabras_puente")
public class ReportePalabrasPuenteService implements IReportePalabrasPuenteService {
	@Autowired
	@Qualifier("repositorio_reporte_palabras_puente")
	private ReportePalabrasPuenteRespository repositorio;

	@Autowired
	@Qualifier("convertidor_reporte_palabras_puente")
	private ConvertidorReportePalabrasPuente convertidor;

	private static final Log logger = LogFactory.getLog(ReportePalabrasPuenteService.class);

	@Override
	public boolean crear(EReportePalabrasPuente palabra) {
		try {
			logger.info("EXITO AL CREAR PUENTE REPORTE PALABRA");
			repositorio.save(palabra);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR PUENRE REPORTE PALABRA");
			return false;
		}
	}

	@Override
	public boolean actualizar(EReportePalabrasPuente palabra) {
		try {
			logger.info("EXITO AL ACTUALIZAR PUENTE REPORTE PALABRA");
			repositorio.save(palabra);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR PUENRE REPORTE PALABRA");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			EReportePalabrasPuente palabra = repositorio.findById(id);
			repositorio.delete(palabra);
			logger.info("EXITO AL BORRAR PUENTE REPORTE PALABRA");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR PUENTE REPORTE PALABRA");
			return false;
		}
	}

	@Override
	public List<MReportePalabrasPuente> obtener() {
		try {
			logger.info("EXITO AL LISTAR PUENTE REPORTE PALABRA");
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR PUENTE REPORTE PALABRA");
			return null;
		}
	}

	@Override
	public MReportePalabrasPuente obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER PUENTE REPORTE PALABRA");
			return new MReportePalabrasPuente(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER PUENTE REPORTE PALABRA");
			return null;
		}
	}
}
