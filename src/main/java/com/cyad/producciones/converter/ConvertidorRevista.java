package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.ERevista;
import com.cyad.producciones.model.MRevista;

/**
 * Esta clase realiza una conversion de una entidad ERevista a un objeto MRevista
 * @author Enrique Ramírez martínez 
 *
 */
@Component("convertidor_revistas")
public class ConvertidorRevista {
	public List<MRevista> convertirLista(List<ERevista> revistas)
	{
		List<MRevista> mrevistas = new ArrayList<>();
		for(ERevista revista: revistas)
		{
			mrevistas.add(new MRevista(revista));
		}
		return mrevistas;
	}
}
