package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EProduccionAcademicaConferenciaPresentacion;
import com.cyad.producciones.model.MProduccionAcademicaConferenciaPresentacion;

/**
 * Esta clase realiza una conversion de una entidad
 * EProduccionAcademicaConferenciaPresentacion a un objeto
 * MProduccionAcademicaConferenciaPresentacion
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_produccion_academica_conferencia_presentacion")
public class ConvertidorProduccionAcademicaConferenciaPresentacion {
	public List<MProduccionAcademicaConferenciaPresentacion> convertirLista(
			List<EProduccionAcademicaConferenciaPresentacion> producciones) {
		List<MProduccionAcademicaConferenciaPresentacion> mproducciones = new ArrayList<>();
		for (EProduccionAcademicaConferenciaPresentacion produccion : producciones) {
			mproducciones.add(new MProduccionAcademicaConferenciaPresentacion(produccion));
		}
		return mproducciones;
	}
}
