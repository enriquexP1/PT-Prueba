package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorRolParticipacion;
import com.cyad.producciones.entity.ERolParticipacion;
import com.cyad.producciones.model.MRolParticipacion;
import com.cyad.producciones.repository.RolParticipacionRepository;

/**
 * implementacion de la interface IDesarroloService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_rol_participacion")
public class RolParticipacionService implements IRolParticipacionService{
	@Autowired
	@Qualifier("repositorio_rol_participacion")
	private RolParticipacionRepository repositorio;

	@Autowired
	@Qualifier("convertidor_rol_participacion")
	private ConvertidorRolParticipacion convertidor;

	private static final Log logger = LogFactory.getLog(RolParticipacionService.class);

	@Override
	public boolean crear(ERolParticipacion rol) {
		try {
			logger.info("EXITO AL CREAR ROL");
			repositorio.save(rol);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR ROL");
			return false;
		}
	}

	@Override
	public boolean actualizar(ERolParticipacion rol) {
		try {
			logger.info("EXITO AL ACTUALIZAR ROL");
			repositorio.save(rol);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR ROL");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			logger.info("EXITO AL BORRAR ROL");
			repositorio.delete(repositorio.findById(id));
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR ROL");
			return false;
		}
	}

	@Override
	public List<MRolParticipacion> obtener() {
		try {
			logger.info("EXITO AL LISTAR ROLES");
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR ROLES");
			return null;
		}
	}

	@Override
	public MRolParticipacion obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER ROL");
			return new MRolParticipacion(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER ROL");
			return null;
		}
	}

}
