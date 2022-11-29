package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EProduccionAcademicaMemoria;
import com.cyad.producciones.model.MProduccionAcademicaMemoria;

/**
 * Esta clase realiza una conversion de una entidad EProduccionAcademicaMemoria
 * a un objeto MProduccionAcademicaMemoria
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_produccion_academica_memoria")
public class ConvertidorProduccionAcademicaMemoria {
	public List<MProduccionAcademicaMemoria> convertirLista(List<EProduccionAcademicaMemoria> producciones) {
		List<MProduccionAcademicaMemoria> mproducciones = new ArrayList<>();
		for (EProduccionAcademicaMemoria prod : producciones) {
			mproducciones.add(new MProduccionAcademicaMemoria(prod));
		}
		return mproducciones;
	}
}
