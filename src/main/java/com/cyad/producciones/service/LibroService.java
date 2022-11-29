package com.cyad.producciones.service;

/**
 * implementacion de la interface ILibro para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorLibro;
import com.cyad.producciones.entity.EArticulo;
import com.cyad.producciones.entity.ELibro;
import com.cyad.producciones.model.MLibro;
import com.cyad.producciones.repository.ILibroRepository;

@Service("servicio_libro")
public class LibroService implements ILibroService {
	@Autowired
	@Qualifier("repositorio_libro")
	private ILibroRepository repositorio;

	@Autowired
	@Qualifier("convertidor_libro")
	private ConvertidorLibro convertidor;

	private static final Log logger = LogFactory.getLog(LibroService.class);

	@Override
	public boolean crear(ELibro libro) {
		try {
			if (isRepited(libro) == false) {
				logger.info("EXITO AL CREAR LIBRO");
				repositorio.save(libro);
				return true;
			} else {
				logger.info("LIBRO EXISTENTE");
				return false;
			}
		} catch (Exception e) {
			logger.info("ERROR AL CREAR LIBRO");
			return false;
		}
	}

	@Override
	public boolean actualizar(ELibro libro) {
		try {
			logger.info("EXITO AL ACTUALIZAR LIBRO");
			repositorio.save(libro);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR LIBRO");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			logger.info("EXITO AL BORRAR LIBRO");
			repositorio.delete(repositorio.findById(id));
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR LIBRO");
			return false;
		}
	}

	@Override
	public List<MLibro> obtener() {
		try {
			logger.info("EXITO AL LISTAR LIBROS");
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR LIBROS");
			return null;
		}
	}

	@Override
	public MLibro obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER LIBRO");
			return new MLibro(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER LIBRO");
			return null;
		}
	}

	@Override
	public boolean isRepited(ELibro libro) {
		boolean deter = false;
		try {
			List<MLibro> libros = convertidor.convertirLista(repositorio.findAll());
			MLibro libroBusc = new MLibro(libro);
			for (MLibro libroAux : libros) {
				if (libroAux.getTitulo().equals(libroBusc.getTitulo())) {
					if (libroAux.getNumero_edicion() == libroBusc.getNumero_edicion()) {
						deter = true;
					}
				}
			}

		} catch (Exception e) {
			logger.info("ERROR EN LIBRO REPETIDO");
		}
		return deter;
	}

	@Override
	public MLibro buscar(ELibro libro) {
		MLibro libro2 = null;
		try {
			List<MLibro> libros = convertidor.convertirLista(repositorio.findAll());
			MLibro libroBusc = new MLibro(libro);
			for (MLibro libroAux : libros) {
				if (libroAux.getTitulo().equals(libroBusc.getTitulo())) {
					if (libroAux.getNumero_edicion() == libroBusc.getNumero_edicion()) {
						logger.info("EXITO RECUPERANDO LIBRO");
						libro2 = libroAux;
					}
				}
			}
		} catch (Exception e) {
			logger.info("ERROR RECUPERANDO LIBRO");
		}
		return libro2;
	}

}
