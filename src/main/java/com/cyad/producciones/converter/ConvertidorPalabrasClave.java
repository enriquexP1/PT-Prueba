package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EPalabrasClave;
import com.cyad.producciones.model.MPalabrasClave;

/**
 * Esta clase realiza una conversion de una entidad ERevista a un objeto
 * MRevista
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_palabras_clave")
public class ConvertidorPalabrasClave {
	public List<MPalabrasClave> ConvertirLista(List<EPalabrasClave> palabras) {
		List<MPalabrasClave> mpalabras = new ArrayList<>();
		for(EPalabrasClave palabra : palabras)
		{
			mpalabras.add(new MPalabrasClave(palabra));
		}
		
		return mpalabras;
	}
}
