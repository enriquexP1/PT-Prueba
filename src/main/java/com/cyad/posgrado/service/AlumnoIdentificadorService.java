package com.cyad.posgrado.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.posgrado.converter.ConvertidorAlumnoIdentificador;
import com.cyad.posgrado.entity.EAlumno_Identificador_puente;
import com.cyad.posgrado.model.MAlumno_Identificador_puente;
import com.cyad.posgrado.repository.AlumnoIdentificadorRepository;

/**
 * implementacion de la interface IAlumnoIdentificadorService para establecer el servicio
 * @author Enrique Ramírez Martínez 
 *
 */
@Service("servicio_AlumnoIdentificador")
public class AlumnoIdentificadorService implements IAlumnoIdentificadorService {
	@Autowired
	@Qualifier("repositorio_AlumnoIdentificador")
	private AlumnoIdentificadorRepository repositorio;
	
	@Autowired
	@Qualifier("convertidor_AlumnoIdentificador")
	private ConvertidorAlumnoIdentificador convertidor;
	
	private static final Log logger = LogFactory.getLog(AlumnoIdentificadorService.class);

	@Override
	public boolean crear(EAlumno_Identificador_puente alumnoIdentificador) {
		try {
			logger.info("CREACION EXITOSA DE ALUMNOIDENTIFICADOR");
			repositorio.save(alumnoIdentificador);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR ALUMNOIDENTIFICADOR");
			return false;
		}
	}

	@Override
	public boolean actualizar(EAlumno_Identificador_puente alumnoIdentificador) {
		try {
			logger.info("ACTUALIZACION EXITOSA DE ALUMNOIDENTIFICADOR");
			repositorio.save(alumnoIdentificador);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR ALUMNOIDENTIFICADOR");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			logger.info("EXITO AL BORRAR ALUMNOIDENTIFICADOR");
			EAlumno_Identificador_puente alumnoIdentificador = repositorio.findById(id);
			repositorio.delete(alumnoIdentificador);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR ALUMNOIDENTIFICADOR");
			return false;
		}
	}

	@Override
	public List<MAlumno_Identificador_puente> obtener() {
		try {
			logger.info("EXITO AL LISTAR ALUMNOSIDENTIFICADORES");
			return convertidor.convertiLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR ALUMNOSIDENTIFICADORES");
			return null;
		}
	}

	@Override
	public MAlumno_Identificador_puente obtener(long id) {
		try {
			logger.info("EXITO AL RECUPERAR ALUMNOIDENTIFICADOR");
			return new MAlumno_Identificador_puente(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL RECUPERAR ALUMNOIDENTIFICADOR");
			return null;
			
		}
	}
	
	
}
