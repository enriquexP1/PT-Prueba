package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorTipoDesarrollo;
import com.cyad.producciones.entity.ETipoDesarrollo;
import com.cyad.producciones.model.MTipoDesarrollo;
import com.cyad.producciones.repository.TipoDesarrolloRespository;

/**
 * implementacion de la interface IDesarroloService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_tipo_desarrollo")
public class TipoDesarrolloService implements ITipoDesarrollo {
	@Autowired
	@Qualifier("repositorio_tipo_desarrollo")
	private TipoDesarrolloRespository repositorio;

	@Autowired
	@Qualifier("convertidor_tipo_desarrollo")
	private ConvertidorTipoDesarrollo convertidor;

	private static final Log logger = LogFactory.getLog(TipoDesarrolloService.class);

	@Override
	public boolean crear(ETipoDesarrollo tipo) {
		try {
			logger.info("EXITO AL CREAR TIPO");
			repositorio.save(tipo);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR TIPO");
			return false;
		}
	}

	@Override
	public boolean actualizar(ETipoDesarrollo tipo) {
		try {
			logger.info("EXITO AL ACTUALIZAR TIPO");
			repositorio.save(tipo);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR TIPO");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			logger.info("EXITO AL BORRAR TIPO");
			repositorio.delete(repositorio.findById(id));
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR TIPO");
			return false;
		}
	}

	@Override
	public List<MTipoDesarrollo> obtener() {
		try {
			logger.info("EXITO AL LISTAR TIPOS");
			return convertidor.convertiLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR TIPOS");
			return null;
		}
	}

	@Override
	public MTipoDesarrollo obtener(long id) {
		try {
			logger.info("EXITO AL OBETNER TIPO");
			return new MTipoDesarrollo(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER TIPO");
			return null;
		}
	}
	
	

}
