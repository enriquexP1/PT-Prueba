package com.cyad.producciones.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.producciones.converter.ConvertidorArticulo;
import com.cyad.producciones.entity.EArticulo;
import com.cyad.producciones.model.MArticulo;
import com.cyad.producciones.repository.ArticuloRepository;

/**
 * implementacion de la interface IArticuloService para establecer el servicio
 * 
 * @author Enrique Ramírez Martínez
 *
 */
@Service("servicio_articulo")
public class ArticuloService implements IArticuloService {
	@Autowired
	@Qualifier("repositorio_articulo")
	private ArticuloRepository repositorio;

	@Autowired
	@Qualifier("convertidor_articulo")
	private ConvertidorArticulo convertidor;

	private static final Log logger = LogFactory.getLog(ArticuloService.class);

	@Override
	public boolean crear(EArticulo articulo) {
		try {
			if(isRepited(articulo) == false)
			{
				repositorio.save(articulo);
				logger.info("EXITO AL CREAR ARTICULO");
				return true;
			}
			else {
				logger.info("ARTICULO YA EXISTENTE");
				return false;
			}

		} catch (Exception e) {
			logger.info("ERROR AL CREAR ARTICULO");
			return false;

		}

	}

	@Override
	public boolean actualizar(EArticulo articulo) {
		try {
			repositorio.save(articulo);
			logger.info("EXITO AL ACTUALIZAR ARTICULO");
			return true;

		} catch (Exception e) {
			logger.info("ERROR AL ACTUALIZAR ARTICULO");
			return false;

		}
	}

	@Override
	public boolean borrar(long id) {
		try {
			EArticulo articulo = repositorio.findById(id);
			repositorio.delete(articulo);
			logger.info("EXITO AL BORRAR EL ARTICULO");
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL BORRAR EL ARTICULO");
			return false;
		}
	}

	@Override
	public List<MArticulo> obtener() {
		try {
			logger.info("EXITO AL LISTAR ARTICULOS");
			return convertidor.convertirLista(repositorio.findAll());
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public MArticulo obtener(long id) {
		try {
			logger.info("EXITO AL OBTENER EL ARTICULO");
			return new MArticulo(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL OBTENER EL ARTICULO");
			return null;
		}

	}

	@Override
	public boolean isRepited(EArticulo articulo) {
		Boolean detBoolean = false;
		try {
			List<MArticulo> articulos = convertidor.convertirLista(repositorio.findAll());
			MArticulo articuloAux = new MArticulo(articulo);
			for (MArticulo art : articulos) {
				if (art.getTitulo().equals(articuloAux.getTitulo())) {
					detBoolean = true;
				}
			}
		} catch (Exception e) {
			logger.info("ERROR AL BUSCAR ARTICULO");
		}
		return detBoolean;
	}

	@Override
	public MArticulo buscar(EArticulo articulo) {
		MArticulo articuloRet = null;
		try {
			List<MArticulo> articulos = convertidor.convertirLista(repositorio.findAll());
			MArticulo articuloAux = new MArticulo(articulo);
			for (MArticulo art : articulos) {
				if(art.getTitulo().equals(articuloAux.getTitulo()))
				{
					articuloRet = art;
				}
			}
		} catch (Exception e) {
			logger.info("ERROR AL BUSCAR ARTICULO");
		}
		return articuloRet;
	}
}
