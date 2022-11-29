package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorOrigenReporte;
import com.cyad.producciones.entity.EOrigenReporte;
import com.cyad.producciones.model.MOrigenReporte;
import com.cyad.producciones.repository.IOrigenReporteRepository;

/**
 * implementacion de la interface IOrigenReporteService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_origen_reporte")
public class OrigenReporteService implements IOrigenReporteService{
	@Autowired
	@Qualifier("repositorio_origen_reporte")
	private IOrigenReporteRepository repositorio;

	@Autowired
	@Qualifier("convertidor_origen_reporte")
	private ConvertidorOrigenReporte convertidor;

	private static final Log logger = LogFactory.getLog(OrigenReporteService.class);

	@Override
	public boolean crear(EOrigenReporte origenReporte) {
		try {
			logger.info("EXITO AL CREAR ORIGEN REPORTE");
			repositorio.save(origenReporte);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR ORIGEN REPORTE");
			return false;
		}
	}

	@Override
	public boolean actualizar(EOrigenReporte origenReporte) {
		try {
			logger.info("EXITO AL ACTUALIZAR ORIGEN REPORTE");
			repositorio.save(origenReporte);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR ORIGEN REPORTE");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			logger.info("EXITO AL BORRAR ORIGEN REPORTE");
			repositorio.delete(repositorio.findById(id));
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR ORIGEN REPORTE");
			return false;
		}
	}

	@Override
	public List<MOrigenReporte> obtener() {
		try {
			logger.info("EXITO AL LISTAR ORIGENES REPORTE");
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR ORIGENES REPORTE");
			return null;
		}
	}

	@Override
	public MOrigenReporte obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER ORIGEN REPORTE");
			return new MOrigenReporte(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER ORIGEN REPORTE");
			return null;
		}
	}
}
