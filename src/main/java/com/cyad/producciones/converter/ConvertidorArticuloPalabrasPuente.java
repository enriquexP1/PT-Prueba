package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EArticuloPalabrasPuente;
import com.cyad.producciones.model.MArticuloPalabrasPuente;

/**
 * Esta clase realiza una conversion de una entidad EArticuloPalabraPuente a un objeto
 * MArticuloPalabraPuente
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_articulo_palabras_puente")
public class ConvertidorArticuloPalabrasPuente {
public List<MArticuloPalabrasPuente> ConvertirLista(List<EArticuloPalabrasPuente> palabras)
{
	List<MArticuloPalabrasPuente> marticulopalabra = new ArrayList<>();
	for(EArticuloPalabrasPuente palabra : palabras)
	{
		marticulopalabra.add(new MArticuloPalabrasPuente(palabra));
	}
	return marticulopalabra;
	}
}
