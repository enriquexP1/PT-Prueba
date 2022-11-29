package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EProduccionAcademicaInnovacion;
import com.cyad.producciones.model.MProduccionAcademicaInnovacion;

/**
 * Esta clase realiza una conversion de una entidad
 * EProduccionAcademicaInnovacion a un objeto MProduccionAcademicaInnovacion
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_produccion_academica_innovacion")
public class ConvertidorProduccionAcademicaInnovacion {
	public List<MProduccionAcademicaInnovacion> convertirLista(List<EProduccionAcademicaInnovacion> producciones) {
		List<MProduccionAcademicaInnovacion> mproducciones = new ArrayList<>();
		for (EProduccionAcademicaInnovacion prod : producciones) {
			mproducciones.add(new MProduccionAcademicaInnovacion(prod));
		}
		return mproducciones;
	}
}
