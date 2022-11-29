package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EOrden;
import com.cyad.producciones.model.MOrden;

/**
 * Esta clase realiza una conversion de una entidad EOrden a un objeto MOrden
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_orden")
public class ConvertidorOrden {
	public List<MOrden> convertirLista(List<EOrden> ordenes) {
		List<MOrden> mordenes = new ArrayList<>();
		for (EOrden orden : ordenes) {
			mordenes.add(new MOrden(orden));
		}
		return mordenes;
	}
}
