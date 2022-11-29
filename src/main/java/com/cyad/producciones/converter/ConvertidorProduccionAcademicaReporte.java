package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EProduccionAcademicaReporte;
import com.cyad.producciones.model.MProduccionAcademicaReporte;

/**
 * Esta clase realiza una conversion de una entidad EProduccionAcademicaReporte
 * a un objeto MProduccionAcademicaReporte
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_produccion_academica_reporte")
public class ConvertidorProduccionAcademicaReporte {

	public List<MProduccionAcademicaReporte> convertirLista(List<EProduccionAcademicaReporte> producciones) {
		List<MProduccionAcademicaReporte> mproducciones = new ArrayList<>();
		for (EProduccionAcademicaReporte prod : producciones) {
			mproducciones.add(new MProduccionAcademicaReporte(prod));
		}
		return mproducciones;
	}
}
