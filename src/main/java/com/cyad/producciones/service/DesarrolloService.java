package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorDesarrollo;
import com.cyad.producciones.entity.EDesarrollo;
import com.cyad.producciones.model.MDesarrollo;
import com.cyad.producciones.repository.DesarrolloRepository;

/**
 * implementacion de la interface IDesarroloService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_desarrollo")
public class DesarrolloService implements IDesarrolloService {

	@Autowired
	@Qualifier("repositorio_desarrollo")
	private DesarrolloRepository repositorio;

	@Autowired
	@Qualifier("convertidor_desarrollo")
	private ConvertidorDesarrollo convertidor;

	private static final Log logger = LogFactory.getLog(DesarrolloService.class);

	@Override
	public boolean crear(EDesarrollo desarrollo) {
		try {
			if (isRepited(desarrollo) == false) {
				repositorio.save(desarrollo);
				logger.info("EXITO AL CREAR DESARROLLO");
				return true;
			} else {
				logger.info("DESARROLLO YA EXISTENTE");
				return false;
			}

		} catch (Exception e) {
			logger.info("ERROR AL CREAR DESARROLLO");
			return false;
		}
	}

	@Override
	public boolean actualizar(EDesarrollo desarrollo) {
		try {
			logger.info("EXITO AL ACTUALIZAR DESARROLLO");
			repositorio.save(desarrollo);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR DESARROLLO");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			logger.info("EXITO AL BORRAR DESARROLLO");
			repositorio.delete(repositorio.findById(id));
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR DESARROLLO");
			return false;
		}
	}

	@Override
	public List<MDesarrollo> obtener() {
		try {
			logger.info("EXITO AL LISTAR DESARROLLOS");
			return convertidor.convertiLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR DESARROLLOS");
			return null;
		}
	}

	@Override
	public MDesarrollo obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER DESARROLLO");
			return new MDesarrollo(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER DESARROLLO");
			return null;
		}
	}

	@Override
	public MDesarrollo buscar(EDesarrollo desarrollo) {
		MDesarrollo desarrollo2 = null;
		try {
			List<MDesarrollo> desarrollos = convertidor.convertiLista(repositorio.findAll());
			MDesarrollo desarolloAux = new MDesarrollo(desarrollo);
			for (MDesarrollo desarrollop : desarrollos) {
				if (desarrollop.getNombre().equals(desarolloAux.getNombre())) {
					desarrollo2 = desarrollop;
				}
			}
		} catch (Exception e) {
			logger.info("ERROR AL ENCONTRAR EL DESARROLLO");
		}
		return desarrollo2;
	}

	@Override
	public boolean isRepited(EDesarrollo desarrollo) {
		boolean determinante = false;
		try {
			List<MDesarrollo> desarrollos = convertidor.convertiLista(repositorio.findAll());
			MDesarrollo desarolloAux = new MDesarrollo(desarrollo);
			for (MDesarrollo desarrollop : desarrollos) {
				if (desarrollop.getNombre().equals(desarolloAux.getNombre())) {
					determinante = true;
				}
			}
		} catch (Exception e) {
			logger.info("ERROR AL ENCONTRAR EL DESARROLLO");
		}
		return determinante;
	}

}
