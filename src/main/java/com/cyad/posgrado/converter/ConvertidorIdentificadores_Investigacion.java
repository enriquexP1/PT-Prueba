package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EIdentificadores_Investigacion;
import com.cyad.posgrado.model.MIdentificadores_Investigacion;

/**
 * clase componente para conversion de entidad  EIdentificadores_Investigacion a modelo MIdentificadores_Investigacion
 * @author Enrique Ramírez Martínez 
 *
 */
@Component("convertidor_identificadores_investigacion")
public class ConvertidorIdentificadores_Investigacion {

	public List<MIdentificadores_Investigacion> convertirLista(List<EIdentificadores_Investigacion> EIdentificadores )
	{
		List<MIdentificadores_Investigacion> identificadores = new ArrayList<>();
		for(EIdentificadores_Investigacion identificador : EIdentificadores)
		{
			identificadores.add(new MIdentificadores_Investigacion(identificador));
		}
		return identificadores;
	}
}
