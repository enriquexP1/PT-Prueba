package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorInnovacion;
import com.cyad.producciones.entity.EInnovacion;
import com.cyad.producciones.model.MInnovacion;
import com.cyad.producciones.repository.InnovacionRepository;

/**
 * implementacion de la interface IInnovacion para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_innovacion")
public class InnovacionService implements IInnovacionService {
	@Autowired
	@Qualifier("repositorio_innovacion")
	private InnovacionRepository repositorio;

	@Autowired
	@Qualifier("convertidor_innovacion")
	private ConvertidorInnovacion convertidor;

	private static final Log logger = LogFactory.getLog(InnovacionService.class);

	@Override
	public boolean crear(EInnovacion innovacion) {
		try {
			if (isRepited(innovacion) == false) {
				logger.info("EXITO AL CREAR INNOVACION");
				repositorio.save(innovacion);
				return true;
			} else {
				logger.info("INNOVACION YA EXISTENTE");
				return false;
			}

		} catch (Exception e) {
			logger.info("ERROR AL CREAR INNOVACION");
			return false;
		}
	}

	@Override
	public boolean actualizar(EInnovacion innovacion) {
		try {
			logger.info("EXITO AL ACTUALIZAR INNOVACION");
			repositorio.save(innovacion);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR INNOVACION");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			logger.info("EXITO AL BORRAR INNOVACION");
			repositorio.delete(repositorio.findById(id));
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR INNOVACION");
			return false;
		}
	}

	@Override
	public List<MInnovacion> obtener() {
		try {
			logger.info("EXITO AL LISTAR INNOVACIONES");
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR INNOVACIONES");
			return null;
		}
	}

	@Override
	public MInnovacion obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER INNOVACION");
			return new MInnovacion(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER INNOVACION");
			return null;
		}
	}

	@Override
	public MInnovacion buscar(EInnovacion innovacion) {
		MInnovacion innovacion2 = null;
		try {
			List<MInnovacion> innovaciones = convertidor.convertirLista(repositorio.findAll());
			MInnovacion innovacionAux = new MInnovacion(innovacion);
			for (MInnovacion inov : innovaciones) {
				if (inov.getNombre().equals(innovacionAux.getNombre())) {
					innovacion2 = inov;
				}
			}
		} catch (Exception e) {
			logger.info("ERROR AL BUSCAR INNOVACION");
		}
		return innovacion2;
	}

	@Override
	public boolean isRepited(EInnovacion innovacion) {
		Boolean determinante = false;
		try {
			List<MInnovacion> innovaciones = convertidor.convertirLista(repositorio.findAll());
			MInnovacion innovacionAux = new MInnovacion(innovacion);
			for (MInnovacion inov : innovaciones) {
				if (inov.getNombre().equals(innovacionAux.getNombre())) {
					determinante = true;
				}
			}
		} catch (Exception e) {
			logger.info("ERROR AL BUSCAR INNOVACION");
		}
		return determinante;
	}

}
