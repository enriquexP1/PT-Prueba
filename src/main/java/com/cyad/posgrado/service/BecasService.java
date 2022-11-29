package com.cyad.posgrado.service;

import java.util.List;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cyad.posgrado.converter.ConvertidorBecas;
import com.cyad.posgrado.entity.EBecas;
import com.cyad.posgrado.model.MBecas;
import com.cyad.posgrado.repository.BecasRepository;

/**
 * implementacion de la interface IBecas para establecer el servicio
 * @author Enrique Ramírez Martínez 
 *
 */
@Service("servicio_becas")
public class BecasService implements IBecasService{
	@Autowired
	@Qualifier("repositorio_becas")
	private BecasRepository repositorio;
	
	@Autowired
	@Qualifier("convertidor_becas")
	private ConvertidorBecas convertidor;
	
	private static final Log logger = LogFactory.getLog(PlanService.class);
	
	@Override
	public boolean crear(EBecas beca) {
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
	public boolean actualizar(EBecas beca) {
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
			EBecas  beca = repositorio.findById(id);
			logger.info("BECA BORRADA");
			beca.setActivo(false);
			repositorio.delete(beca);
			//repositorio.delete(area);
			return true;
		}catch(Exception e){
			logger.info("ERROR AL BORRAR BECA");
			return false;
		}
	}

	@Override
	public List<MBecas> obtener() {
		try {
			return convertidor.covertirLista(repositorio.findAll());
		} catch (Exception e) {
			logger.info("ERROR AL LISTAR LAS BECAS");
			return null;
		}
	}

	@Override
	public MBecas obtener(long id) {
		try {
			return new MBecas(repositorio.findById(id));
		} catch (Exception e) {
			logger.info("ERROR AL CONSULTAR" + e);
			return null;
		}
	}

}
