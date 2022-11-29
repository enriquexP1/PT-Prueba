package com.cyad.producciones.converter;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import java.util.List;
import com.cyad.producciones.model.MArticulo;
import com.cyad.producciones.entity.EArticulo;

/**
 * Esta clase realiza una conversion de una entidad EArticulo a un objeto
 * MArticulo
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_articulo")
public class ConvertidorArticulo {
	public List<MArticulo> convertirLista(List<EArticulo> articulos) {
		List<MArticulo> marticulos = new ArrayList<>();
		for (EArticulo articulo : articulos) {
			marticulos.add(new MArticulo(articulo));
		}
		return marticulos;
	}
}
