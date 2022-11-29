package com.cyad.posgrado.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.posgrado.converter.ConvertidorIdentificadores_Investigacion;
import com.cyad.posgrado.entity.EIdentificadores_Investigacion;
import com.cyad.posgrado.model.MIdentificadores_Investigacion;
import com.cyad.posgrado.repository.Identificadores_InvesitgacionRepository;

/**
 * implementacion de la interface IIdentidicadores_InvestigacionService para establecer el servicio
 * @author Enrique Ramírez Martínez 
 *
 */
@Service("servicio_identificadores_investigacion")
public class Identificadores_InvestigacionService implements IIdentificadores_InvestigacionService {
	@Autowired
	@Qualifier("repositorio_identificadores_investigacion")
	private Identificadores_InvesitgacionRepository repositorio;
	
	@Autowired
	@Qualifier("convertidor_identificadores_investigacion")
	private ConvertidorIdentificadores_Investigacion convertidor;
	
	private static final Log logger = LogFactory.getLog(PlanService.class);

	@Override
	public boolean crear(EIdentificadores_Investigacion identificador) {
		try {
			logger.info("EXITO AL CREAR IDENTIFICADOR");
			repositorio.save(identificador);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR IDENTIFICADOR");
			return false;
		}
	
	}

	@Override
	public boolean actualizar(EIdentificadores_Investigacion identificador) {
		try {
			logger.info("EXITO AL ACTUALIZAR IDENTIFICADOR");
			repositorio.save(identificador);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR IDENTIFICADOR");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			logger.info("EXITO AL BORRAR IDENTIFICADOR");
			EIdentificadores_Investigacion indentificador = repositorio.findById(id);
			repositorio.delete(indentificador);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR IDENTIFICADOR");
			return false;
		}
	}

	@Override
	public List<MIdentificadores_Investigacion> obtener() {
		try {
			logger.info("EXITO AL LISTAR IDENTIFICADORES");
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR IDENTIFICADORES");
			return null;
		}
	}

	@Override
	public MIdentificadores_Investigacion obtener(long id) {
		try {
			logger.info("EXITO AL ENCONTRAR IDENTIFICADOR");
			return new MIdentificadores_Investigacion(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL ENCONTRAR IDENTIFICADOR");
			return null;
		}
	}
	
	
}
