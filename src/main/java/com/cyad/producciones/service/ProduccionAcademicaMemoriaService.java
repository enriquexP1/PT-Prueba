package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorProduccionAcademicaMemoria;
import com.cyad.producciones.entity.EProduccionAcademicaMemoria;
import com.cyad.producciones.model.MProduccionAcademicaMemoria;
import com.cyad.producciones.repository.ProduccionAcademicaMemoriaRepository;

/**
 * implementacion de la interface IProduccionAcademicaMemoriaService para
 * establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_produccion_academica_memoria")
public class ProduccionAcademicaMemoriaService implements IProduccionAcademicaMemoriaService {
	@Autowired
	@Qualifier("repositorio_produccion_academica_memoria")
	private ProduccionAcademicaMemoriaRepository repositorio;
	@Autowired
	@Qualifier("convertidor_produccion_academica_memoria")
	private ConvertidorProduccionAcademicaMemoria convertidor;
	private static final Log logger = LogFactory.getLog(ProduccionAcademicaMemoriaService.class);

	@Override
	public boolean crear(EProduccionAcademicaMemoria produccion) {
		try {
			repositorio.save(produccion);
			logger.info("EXITO AL CREAR PRODUCCION DE MEMORIA");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR PRODUCCION DE MEMORIA");
			return false;
		}

	}

	@Override
	public boolean actualizar(EProduccionAcademicaMemoria produccion) {
		try {
			repositorio.save(produccion);
			logger.info("EXITO AL ACTUALIZAR PRODUCCION DE MEMORIA");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR PRODUCCION DE MEMORIA");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			repositorio.delete(repositorio.findById(id));
			logger.info("EXITO AL BORRAR PRODUCCION DE MEMORIA");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR PRODUCCION DE MEMORIA");
			return false;
		}
	}

	@Override
	public List<MProduccionAcademicaMemoria> obtener() {
		try {
			List<MProduccionAcademicaMemoria> lista = convertidor.convertirLista(repositorio.findAll());
			logger.info("EXITO AL LISTAR PRODUCCIONES DE MEMORIA");
			return lista;
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR PRODUCCIONES DE MEMORIA");
			return null;
		}
	}

	@Override
	public MProduccionAcademicaMemoria obtener(long id) {
		try {
			MProduccionAcademicaMemoria memoria = new MProduccionAcademicaMemoria(repositorio.findById(id));
			logger.info("EXITO AL OBTENER PRODUCCION DE MEMORIA");
			return memoria;
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER PRODUCCION DE MEMORIA");
			return null;
		}
	}

}
