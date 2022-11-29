package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EDedicacion;
import com.cyad.posgrado.model.MDedicacion;

/**
 * clase componente para conversion de entidad  EDedicacion a modelo MDedicacion
 * @author Enrique Ramírez Martínez 
 *
 */
@Component("convertidor_dedicacion")
public class ConvertidorDedicacion {
public List<MDedicacion> convertirLista(List<EDedicacion> Ededicaciones)
{
	List<MDedicacion> dedicaciones = new ArrayList<>();
	for(EDedicacion dedicacion : Ededicaciones)
	{
		dedicaciones.add(new MDedicacion(dedicacion));
	}

	return dedicaciones;
}
}
