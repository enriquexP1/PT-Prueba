package com.cyad.posgrado.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.posgrado.converter.ConvertidorAlumnoBeca;
import com.cyad.posgrado.entity.EAlumnoBeca;
import com.cyad.posgrado.model.MAlumnoBeca;
import com.cyad.posgrado.repository.AlumnoBecaRepository;



/**
 * implementacion de la interface IBecas para establecer el servicio
 * @author Enrique Ramírez Martínez 
 *
 */
@Service("servicio_AlumnoBeca")
public class AlumnoBecaService implements IAlumnoBecaService{
	@Autowired
	@Qualifier("repositorio_AlumnoBeca")
	private AlumnoBecaRepository repositorio;
	
	@Autowired
	@Qualifier("convertidor_AlumnoBeca")
	private ConvertidorAlumnoBeca convertidor;
	
	private static final Log logger = LogFactory.getLog(AlumnoBecaService.class);
	
	@Override
	public boolean crear(EAlumnoBeca beca) {
		try {
			logger.info("BECA ASIGNADA");
			repositorio.save(beca);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL ASIGNAR BECA");
			return false;
		}
	}

	@Override
	public boolean actualizar(EAlumnoBeca beca) {
		try {
			logger.info("BECA CREADA");
			repositorio.save(beca);
			return true;
		} catch (Exception e) {
			logger.info("ERROR AL CREAR BECA");
			return false;
		}
	}

	@Override
	public boolean borrar(long id) {
		try {	
			EAlumnoBeca  beca = repositorio.findById(id);
			logger.info("BECA BORRADA");
			beca.setBecaActiva(false);
			repositorio.save(beca);
			//repositorio.delete(area);
			return true;
		}catch(Exception e){
			logger.info("ERROR AL BORRAR BECA");
			return false;
		}
	}

	@Override
	public List<MAlumnoBeca> obtener() {
		try {
			return convertidor.convertiLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR LAS BECAS");
			return null;
		}
	}

	@Override
	public MAlumnoBeca obtener(long id) {
		try {
			return new MAlumnoBeca(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL CONSULTAR" + e);
			return null;
		}
	}
}
