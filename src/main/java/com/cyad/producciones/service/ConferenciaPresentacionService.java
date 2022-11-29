package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorConferenciaPresentacion;
import com.cyad.producciones.entity.EConferenciaPresentacion;
import com.cyad.producciones.model.MConferenciaPresentacion;
import com.cyad.producciones.repository.ConferenciaPresentacionRepository;

/**
 * implementacion de la interface IConferenciaPresentacionService para
 * establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_conferencia_presentacion")
public class ConferenciaPresentacionService implements IConferenciaPresentacionService {
	@Autowired
	@Qualifier("repositorio_conferencia_presentacion")
	private ConferenciaPresentacionRepository repositorio;

	@Autowired
	@Qualifier("convertidor_conferencia_presentacion")
	private ConvertidorConferenciaPresentacion convertidor;

	private static final Log logger = LogFactory.getLog(ConferenciaPresentacionService.class);

	@Override
	public MConferenciaPresentacion buscar(EConferenciaPresentacion conferenciaPresentacion) {
		MConferenciaPresentacion conferenciaPresentacion2 = null;
		try {
			List<MConferenciaPresentacion> mconferencias = convertidor.convertirLista(repositorio.findAll());
			MConferenciaPresentacion conferenciaAux = new MConferenciaPresentacion(conferenciaPresentacion);
			for (MConferenciaPresentacion conferencia : mconferencias) {
				if (conferencia.getTitulo().equals(conferenciaAux.getTitulo())) {
					if (conferencia.getEvento().equals(conferenciaAux.getEvento())) {
						//if (conferencia.getFecha_presentacion().equals(conferenciaAux.getFecha_presentacion())) {
							
							conferenciaPresentacion2 = conferencia;
							logger.info("EXITO AL ENCONTRAR CONFERENCIA PRESENTACION");
						//}
					}
				}
			}
		} catch (Exception e) {
			logger.info("Error al encontrar conferencia o presentacion");
		}
		return conferenciaPresentacion2;
	}

	@Override
	public boolean isRepited(EConferenciaPresentacion conferenciaPresentacion) {
		boolean determinante = false;
		try {
			List<MConferenciaPresentacion> mconferencias = convertidor.convertirLista(repositorio.findAll());
			MConferenciaPresentacion conferenciaAux = new MConferenciaPresentacion(conferenciaPresentacion);
			for (MConferenciaPresentacion conferencia : mconferencias) {
				if (conferencia.getTitulo().equals(conferenciaAux.getTitulo())) {
					if (conferencia.getEvento().equals(conferenciaAux.getEvento())) {
						if (conferencia.getFecha_presentacion().equals(conferenciaAux.getFecha_presentacion())) {
							determinante = true;
						}
					}
				}
			}
		} catch (Exception e) {
			logger.info("Error al encontrar conferencia o presentacion");
		}
		return determinante;
	}

	@Override
	public boolean crear(EConferenciaPresentacion conferenciaPresentacion) {
		try {
			if (!isRepited(conferenciaPresentacion)) {
				repositorio.save(conferenciaPresentacion);
				logger.info("EXITO AL CREAR CONFERENCIA PRESENTACION");
				return true;
			} else {
				logger.info("CONFERENCIA O PRESENTACION REPETIDA");
				return false;
			}
		} catch (Exception e) {
			logger.info("ERROR AL CREAR CONFERENCIA PRESENTACION");
			return false;
		}
	}

	@Override
	public boolean actualizar(EConferenciaPresentacion conferenciaPresentacion) {
		try {
			repositorio.save(conferenciaPresentacion);
			logger.info("EXITO AL ACTUALIZAR CONFERENCIA PRESENTACION");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR CONFERECNIA PRESENTACION");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			repositorio.delete(repositorio.findById(id));
			logger.info("EXITO AL BORRAR CONFERENCIA PRESENTACION");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR CONFERENCIA PRESENTACION");
			return false;
		}
	}

	@Override
	public List<MConferenciaPresentacion> obtener() {
		try {
			List<MConferenciaPresentacion> conferenciaPresentacions = convertidor.convertirLista(repositorio.findAll());
			logger.info("EXITO AL LISTAR CONFERENCIAS Y PRESENTACIONES");
			return conferenciaPresentacions;
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR CONFERENCIAS Y PRESENTACIONES");
			return null;
		}
	}

	@Override
	public MConferenciaPresentacion obtener(long id) {
		try {
			MConferenciaPresentacion conferenciaPresentacion = new MConferenciaPresentacion(repositorio.findById(id));
			logger.info("EXITO AL OBTENER CONFERENCIA PRESENTACION");
			return conferenciaPresentacion;
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER CONFERENCIA PRESENTACION");
			return null;
		}
	}

}
