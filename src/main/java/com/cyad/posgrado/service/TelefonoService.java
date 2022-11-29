package com.cyad.posgrado.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.posgrado.converter.ConvertidorTelefono;
import com.cyad.posgrado.entity.ETelefono;
import com.cyad.posgrado.model.MTelefono;
import com.cyad.posgrado.repository.TelefonoRepository;

/**
 * implementacion de la interface ITelefonoService para establecer el servicio
 * @author Enrique Ramírez Martínez 
 *
 */
@Service("servicio_telefono")
public class TelefonoService implements ITelefonoService{

	@Autowired
	@Qualifier("repositorio_telefono")
	private TelefonoRepository repositorio;
	
	@Autowired
	@Qualifier("convertidor_telefono")
	private ConvertidorTelefono convertidor;
	
	private static final Log logger = LogFactory.getLog(PlanService.class);
	
	@Override
	public boolean crear(ETelefono telefono) {
		try {
			logger.info("TELEFONO CREADO");
			repositorio.save(telefono);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR BECA");
			return false;
		}
	}

	@Override
	public boolean actualizar(ETelefono telefono) {
		try {
			logger.info("TELEFONO ACTUALIZADO");
			repositorio.save(telefono);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR LA BECA");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			ETelefono telefono = repositorio.findById(id);
			logger.info("TELEFONO BORRADO");
			repositorio.delete(telefono);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR TELEFONO");
			return false;
		}
	}

	@Override
	public List<MTelefono> obtener() {
		try {
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR LOS TELEFONOS");
			return null;
		}
		
	}

	@Override
	public MTelefono obtener(long id) {
		try {
			return new MTelefono(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL RECUPERAR EL TELEFONO");
			return null;
		}
	}

}
