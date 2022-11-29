package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorAutor;
import com.cyad.producciones.entity.EAutor;
import com.cyad.producciones.model.MAutor;
import com.cyad.producciones.repository.AutorRepository;

/**
 * implementacion de la interface IAutorService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_autor")
public class AutorService implements IAutorService {
	@Autowired
	@Qualifier("repositorio_autor")
	private AutorRepository repositorio;

	@Autowired
	@Qualifier("convertidor_autor")
	private ConvertidorAutor convertidor;

	private static final Log logger = LogFactory.getLog(AutorService.class);

	@Override
	public boolean crear(EAutor autor) {
		try {
			if (isRepited(autor) == false) {
				repositorio.save(autor);
				logger.info("EXITO AL CREAR AUTOR)");
				return true;
			} else {
				logger.info("AUTOR YA EXISTENTE");
				return false;
			}

		} catch (Exception e) {
			logger.info("ERROR AL CREAR AUTOR");
			return false;
		}
	}

	@Override
	public boolean actualizar(EAutor autor) {
		try {
			repositorio.save(autor);
			logger.info("EXITO AL ACTUALIZAR AUTOR)");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR AUTOR");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			repositorio.delete(repositorio.findById(id));
			logger.info("EXITO AL BORRAR AUTOR");
			return true;

		} catch (Exception e) {
			logger.info("ERROR AL BORRAR AUTOR");
			return false;
		}
	}

	@Override
	public List<MAutor> obtener() {
		try {
			List<MAutor> lista = convertidor.convertirLista(repositorio.findAll());
			logger.info("EXITO AL LISTAR LOS AUTORES");
			return lista;
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR LOS AUTORES");
			return null;
		}
	}

	@Override
	public MAutor obtener(long id) {
		try {
			MAutor autor = new MAutor(repositorio.findById(id));
			logger.info("EXITO AL OBTENER EL AUTOR");
			return autor;
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER EL AUTOR");
			return null;
		}
	}

	@Override
	public MAutor buscar(EAutor autor) {
		MAutor autor2 = null;
		try {
			List<MAutor> autores = convertidor.convertirLista(repositorio.findAll());
			MAutor autorAux = new MAutor(autor);
			for (MAutor aut : autores) {
				if (aut.getNombre().equals(autorAux.getNombre())) {
					if (aut.getPrimerApellido().equals(autorAux.getPrimerApellido())) {
						if (aut.getSegundoApellido().equals(autorAux.getSegundoApellido())) {
							autor2 = aut;
						}
					}
				}
			}
		} catch (Exception e) {
			logger.info("ERROR AL ENCONTRAR AUTOR");
		}
		return autor2;
	}

	@Override
	public boolean isRepited(EAutor autor) {
		boolean determinante = false;
		try {
			List<MAutor> autores = convertidor.convertirLista(repositorio.findAll());
			MAutor autorAux = new MAutor(autor);
			for (MAutor aut : autores) {
				if (aut.getNombre().equals(autorAux.getNombre())) {
					if (aut.getPrimerApellido().equals(autorAux.getPrimerApellido())) {
						if (aut.getSegundoApellido().equals(autorAux.getSegundoApellido())) {
							determinante = true;
						}
					}
				}
			}
		} catch (Exception e) {
			logger.info("ERROR AL ENCONTRAR AUTOR");
		}
		return determinante;
	}

}
