package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EInnovacion;
import com.cyad.producciones.model.MInnovacion;

/**
 * Esta clase realiza una conversion de una entidad EInnovacion a un objeto
 * MInnovacion
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_innovacion")
public class ConvertidorInnovacion {
	public List<MInnovacion> convertirLista(List<EInnovacion> innovaciones)
	{
		List<MInnovacion> minnovaciones = new ArrayList<>();
		for(EInnovacion innovacion : innovaciones)
		{
			minnovaciones.add(new MInnovacion(innovacion));
		}
		
		return minnovaciones;
	}
	
}
