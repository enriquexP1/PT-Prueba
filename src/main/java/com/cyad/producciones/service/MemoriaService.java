package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConveridorMemoria;
import com.cyad.producciones.entity.EMemoria;
import com.cyad.producciones.model.MMemoria;
import com.cyad.producciones.repository.MemoriaRepository;

/**
 * implementacion de la interface IMemoria para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_memoria")
public class MemoriaService implements IMemoriaService {
	@Autowired
	@Qualifier("repositorio_memoria")
	private MemoriaRepository repositorio;

	@Autowired
	@Qualifier("convertidor_memoria")
	private ConveridorMemoria convertidor;

	private static final Log logger = LogFactory.getLog(MemoriaService.class);

	@Override
	public boolean crear(EMemoria memoria) {
		try {
			if (isRepited(memoria) == false) {
				repositorio.save(memoria);
				logger.info("EXITO AL CREAR MEMORIA");
				return true;
			} else {
				logger.info("MEMORIA YA EXISTENTE");
				return false;
			}
		} catch (Exception e) {
			logger.info("ERROR AL CREAR MEMORIA");
			return false;
		}
	}

	@Override
	public boolean actualizar(EMemoria memoria) {
		try {
			logger.info("EXITO AL ACTUALIZAR MEMORIA");
			repositorio.save(memoria);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR MEMORIA");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			logger.info("EXITO AL BORRAR MEMORIA");
			repositorio.delete(repositorio.findById(id));
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR MEMORIA");
			return false;
		}
	}

	@Override
	public List<MMemoria> obtener() {
		try {
			logger.info("EXITO AL LISTAR MEMORIAS");
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR MEMORIAS");
			return null;
		}

	}

	@Override
	public MMemoria obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER MEMORIA");
			return new MMemoria(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERRO AL OBTENER MEMORIA");
			return null;
		}
	}

	@Override
	public MMemoria buscar(EMemoria memoria) {
		MMemoria memoria2 = null;
		try {
			List<MMemoria> memorias = convertidor.convertirLista(repositorio.findAll());
			MMemoria memoriaAux = new MMemoria(memoria);
			for (MMemoria mem : memorias) {
				if (mem.getTitulo().equals(memoriaAux.getTitulo())) {
					if (mem.getNombre().equals(memoriaAux.getNombre())) {
						memoria2 = mem;
					}
				}
			}
		} catch (Exception e) {
			logger.info("ERROR AL ENCONTRAR LA MEMORIA");
		}
		return memoria2;
	}

	@Override
	public boolean isRepited(EMemoria memoria) {
		boolean determinante = false;
		try {
			List<MMemoria> memorias = convertidor.convertirLista(repositorio.findAll());
			MMemoria memoriaAux = new MMemoria(memoria);
			for (MMemoria mem : memorias) {
				if (mem.getTitulo().equals(memoriaAux.getTitulo()) && mem.getNombre().equals(memoriaAux.getNombre())) {
					determinante = true;
				}
			}
		} catch (Exception e) {
			logger.info("ERROR AL ENCONTRAR LA MEMORIA");
		}
		return determinante;
	}

}
