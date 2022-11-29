package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorProduccionAcademicaLibro;
import com.cyad.producciones.entity.EProduccionAcademicaLibro;
import com.cyad.producciones.model.MProduccionAcademicaLibro;
import com.cyad.producciones.repository.ProduccionAcademicaLibroRepository;

/**
 * implementacion de la interface IProduccionAcademicaLibroService para
 * establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_produccion_academica_libro")
public class ProduccionAcademicaLibroService implements IProduccionAcademicaLibroService {
	@Autowired
	@Qualifier("repositorio_produccion_academica_libro")
	private ProduccionAcademicaLibroRepository repositorio;
	@Autowired
	@Qualifier("convertidor_produccion_academica_libro")
	private ConvertidorProduccionAcademicaLibro convertidor;
	private static final Log logger = LogFactory.getLog(ProduccionAcademicaLibroService.class);

	@Override
	public boolean crear(EProduccionAcademicaLibro produccion) {
		try {
			repositorio.save(produccion);
			logger.info("EXITO AL CREAR PRODUCCIÓN DE LIBRO");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR PRODUCCIÓN DE LIBRO");
			return false;
		}
	}

	@Override
	public boolean actualizar(EProduccionAcademicaLibro produccion) {
		try {
			repositorio.save(produccion);
			logger.info("EXITO AL ACTUALIZAR PRODUCCIÓN DE LIBRO");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR PRODUCCIÓN DE LIBRO");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			repositorio.delete(repositorio.findById(id));
			logger.info("EXITO AL BORRAR PRODUCCIÓN DE LIBRO");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR PRODUCCIÓN DE LIBRO");
			return false;
		}
	}

	@Override
	public List<MProduccionAcademicaLibro> obtener() {
		try {
			List<MProduccionAcademicaLibro> lista = convertidor.convertirLista(repositorio.findAll());
			logger.info("EXITO AL LISTAR PRODUCCIONES DE LIBROS");
			return lista;
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR PRODUCCIONES DE LIBROS");
			return null;
		}
	}

	@Override
	public MProduccionAcademicaLibro obtener(long id) {
		try {
			MProduccionAcademicaLibro produccion = new MProduccionAcademicaLibro(repositorio.findById(id));
			logger.info("EXITO AL OBTENER PRODUCCIÓN DE LIBRO");
			return produccion;
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER PRODUCCIÓN DE LIBRO");
			return null;
		}
	}
}
