package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EProduccionAcademicaArticulo;
import com.cyad.producciones.model.MProduccionAcademicaArticulo;

/**
 * Esta clase realiza una conversion de una entidad EProduccionAcademicaArticulo
 * a un objeto MProduccionAcademicaArticulo
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_produccion_academica_articulo")
public class ConvertidorProduccionAcademicaArticulo {

	public List<MProduccionAcademicaArticulo> convertirLista(List<EProduccionAcademicaArticulo> producciones) {
		List<MProduccionAcademicaArticulo> mproducciones = new ArrayList<>();
		for (EProduccionAcademicaArticulo prod : producciones) {
			mproducciones.add(new MProduccionAcademicaArticulo(prod));
		}
		return mproducciones;

	}
}
