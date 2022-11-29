package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EProduccionAcademicaDesarrollo;
import com.cyad.producciones.model.MProduccionAcademicaDesarrollo;

/**
 * Esta clase realiza una conversion de una entidad
 * EProduccionAcademicaDesarrollo a un objeto MProduccionAcademicaDesarrollo
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_produccion_academica_desarrollo")
public class ConvertidorProduccionAcademicaDesarrollo {
	public List<MProduccionAcademicaDesarrollo> convertirLista(List<EProduccionAcademicaDesarrollo> producciones) {
		List<MProduccionAcademicaDesarrollo> mproducciones = new ArrayList<>();
		for (EProduccionAcademicaDesarrollo prod : producciones) {
			mproducciones.add(new MProduccionAcademicaDesarrollo(prod));
		}
		return mproducciones;
	}
}
