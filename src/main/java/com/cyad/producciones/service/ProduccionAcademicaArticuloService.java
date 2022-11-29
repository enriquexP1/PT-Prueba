package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorProduccionAcademicaArticulo;
import com.cyad.producciones.entity.EProduccionAcademicaArticulo;
import com.cyad.producciones.model.MProduccionAcademicaArticulo;
import com.cyad.producciones.repository.ProduccionAcademicaArticuloRepository;

/**
 * implementacion de la interface IProduccionAcademicaArticuloService para
 * establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_produccion_academica_articulo")
public class ProduccionAcademicaArticuloService implements IProduccionAcademicaArticuloService {
	@Autowired
	@Qualifier("repositorio_produccion_academica_articulo")
	private ProduccionAcademicaArticuloRepository repositorio;
	@Autowired
	@Qualifier("convertidor_produccion_academica_articulo")
	private ConvertidorProduccionAcademicaArticulo convertidor;
	private static final Log logger = LogFactory.getLog(ProduccionAcademicaArticuloService.class);

	@Override
	public boolean crear(EProduccionAcademicaArticulo produccion) {
		try {
			repositorio.save(produccion);
			logger.info("EXITO AL CREAR PRODUCCIÓN DE ARTICULO");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR PRODUCCIÓN DE ARTICULO");
			return false;
		}
	}

	@Override
	public boolean actualizar(EProduccionAcademicaArticulo produccion) {
		try {
			repositorio.save(produccion);
			logger.info("EXITO AL ACTUALIZAR PRODUCCIÓN DE ARTICULO");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR PRODUCCIÓN DE ARTICULO");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			repositorio.delete(repositorio.findById(id));
			logger.info("EXITO AL BORRAR PRODUCCIÓN DE ARTICULO");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR PRODUCCIÓN DE ARTICULO");
			return false;
		}
	}

	@Override
	public List<MProduccionAcademicaArticulo> obtener() {
		try {
			List<MProduccionAcademicaArticulo> lista = convertidor.convertirLista(repositorio.findAll());
			logger.info("EXITO AL LISTAR PRODUCCIONES DE ARTICULOS");
			return lista;
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR PRODUCCIONES DE ARTICULOS");
			return null;
		}
	}

	@Override
	public MProduccionAcademicaArticulo obtener(long id) {
		try {
			MProduccionAcademicaArticulo prod = new MProduccionAcademicaArticulo(repositorio.findById(id));
			logger.info("EXITO AL OBTENER PRODUCCIÓN DE ARTICULO");
			return prod;
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER PRODUCCIÓN DE ARTICULO");
			return null;
		}
	}
}
