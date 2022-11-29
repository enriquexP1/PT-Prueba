package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EProduccionAcademicaLibro;
import com.cyad.producciones.model.MProduccionAcademicaLibro;

/**
 * Esta clase realiza una conversion de una entidad EProduccionAcademicaLibro a
 * un objeto MProduccionAcademicaLibro
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_produccion_academica_libro")
public class ConvertidorProduccionAcademicaLibro {
	public List<MProduccionAcademicaLibro> convertirLista(List<EProduccionAcademicaLibro> producciones) {
		List<MProduccionAcademicaLibro> mproducciones = new ArrayList<>();
		for (EProduccionAcademicaLibro prod : producciones) {
			mproducciones.add(new MProduccionAcademicaLibro(prod));
		}
		return mproducciones;
	}
}
