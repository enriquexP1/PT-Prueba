package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorOrden;
import com.cyad.producciones.entity.EOrden;
import com.cyad.producciones.model.MOrden;
import com.cyad.producciones.repository.OrdenRepository;

/**
 * implementacion de la interface IOrdenService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_orden")
public class OrdenService implements IOrdenService {
	@Autowired
	@Qualifier("repositorio_orden")
	private OrdenRepository repositorio;

	@Autowired
	@Qualifier("convertidor_orden")
	private ConvertidorOrden convertidor;

	private static final Log logger = LogFactory.getLog(OrdenService.class);

	@Override
	public boolean crear(EOrden orden) {
		try {
			repositorio.save(orden);
			logger.info("EXITO AL CREAR ORDEN");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR ORDEN");
			return false;
		}
	}

	@Override
	public boolean actualizar(EOrden orden) {
		try {
			repositorio.save(orden);
			logger.info("EXITO AL ACTUALIZAR ORDEN");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR ORDEN");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			repositorio.delete(repositorio.findById(id));
			logger.info("EXITO AL BORRAR ORDEN");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR ORDEN");
			return false;
		}
	}

	@Override
	public List<MOrden> obtener() {
		try {
			List<MOrden> ordenes = convertidor.convertirLista(repositorio.findAll());
			logger.info("EXITO AL LISTAR ORDENES");
			return ordenes;
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR ORDENES");
			return null;
		}
	}

	@Override
	public MOrden obtener(long id) {
		try {
			MOrden orden = new MOrden(repositorio.findById(id));
			logger.info("EXITO AL OBTENER ORDEN");
			return orden;
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER ORDEN");
			return null;
		}
	}

	@Override
	public MOrden buscar(EOrden orden) {
		MOrden orden2 = null;
		try {
			List<MOrden> ordenes = convertidor.convertirLista(repositorio.findAll());
			MOrden ordenAux = new MOrden(orden);
			for (MOrden ord : ordenes) {
				if (ord.getOrden() == ordenAux.getOrden()) {
					orden2 = ord;
				}
			}
		} catch (Exception e) {
			logger.info("ERROR AL ENCONTRAR ORDEN");
		}
		return orden2;
	}

	@Override
	public boolean isRepited(EOrden orden) {
		boolean determinante = false;
		try {
			List<MOrden> ordenes = convertidor.convertirLista(repositorio.findAll());
			MOrden ordenAux = new MOrden(orden);
			for (MOrden ord : ordenes) {
				if (ord.getOrden() == ordenAux.getOrden()) {
					determinante = true;
				}
			}
		} catch (Exception e) {
			logger.info("ERROR AL ENCONTRAR ORDEN");
		}
		return determinante;
	}

}
