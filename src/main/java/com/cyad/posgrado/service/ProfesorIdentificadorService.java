package com.cyad.posgrado.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.cyad.posgrado.converter.ConvertidorProfesorIdentificador;
import com.cyad.posgrado.entity.EProfesor_Identificador_puente;
import com.cyad.posgrado.model.MProfesor_Identificador_puente;
import com.cyad.posgrado.repository.ProfesorIdentificadorRepository;

/**
 * implementacion de la interface IProfesorIdentificadorService para establecer el servicio
 * @author Enrique Ramírez Martínez 
 *
 */
@Service("servicio_profesorIdentificador")
public class ProfesorIdentificadorService implements IProfesorIdentificadorService {
	@Autowired
	@Qualifier("repositorio_ProfesorIdentificador")
	private ProfesorIdentificadorRepository repositorio;
	
	@Autowired
	@Qualifier("convertidor_ProfesorIdentificador")
	private ConvertidorProfesorIdentificador convertidor;
	
	private static final Log logger = LogFactory.getLog(ProfesorIdentificadorService.class);

	@Override
	public boolean crear(EProfesor_Identificador_puente profesorIdentificador) {
		try {
			logger.info("EXITO AL CREAR PROFESORIDENTIFICADOR");
			repositorio.save(profesorIdentificador);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR PROFESORIDENTIFICADOR");
			return false;
		}
	}

	@Override
	public boolean actualizar(EProfesor_Identificador_puente profesorIdentificador) {
		try {
			logger.info("EXITO AL ACTUALIZAT PROFESORIDENTIFICADOR");
			repositorio.save(profesorIdentificador);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAT PROFESORIDENTIFICADOR");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			logger.info("EXITO AL BORRAR PROFESORIDENTIFICADOR");
			EProfesor_Identificador_puente profesorIdentificador = repositorio.findById(id);
			repositorio.delete(profesorIdentificador);
			return true;
			
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR PROFESORIDENTIFICADOR");
			return false;
		}
	}

	@Override
	public List<MProfesor_Identificador_puente> obtener() {
		try {
			logger.info("EXITO AL LISTAR LOS PROFESORESIDENTIFICADORES");
			return convertidor.convertiLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR LOS PROFESORESIDENTIFICADORES");
			return null;
		}
	}

	@Override
	public MProfesor_Identificador_puente obtener(long id) {
		try {
			logger.info("EXITO AL RECUPERAR PROFESORIDENTIFICADOR");
			return new MProfesor_Identificador_puente(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL RECUPERAR PROFESORIDENTIFICADOR");
			return null;
		}
	}

}
