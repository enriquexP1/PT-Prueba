package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.model.MInstitucion;
import com.cyad.producciones.entity.EInstitucion;

/**
 * Esta clase realiza una conversion de una entidad EInstitucion a un objeto
 * MInstitucion
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_institucion")
public class ConvertidorInstitucion {

	public List<MInstitucion> convertirLista(List<EInstitucion> instituciones)
	{
		List<MInstitucion> minstituciones = new ArrayList<>();
		for(EInstitucion institucion : instituciones)
		{
			minstituciones.add(new MInstitucion(institucion));
		}
		return minstituciones;
		
	}
	
}
