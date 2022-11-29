package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EMemoriaPalabrasPuente;
import com.cyad.producciones.model.MMemoriaPalabrasPuente;

/**
 * Esta clase realiza una conversion de una entidad EMemoriaPalabraPuente a un
 * objeto MMemoriaPalabraPuente
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_memoria_palabras_puente")
public class ConvertidorMemoriaPalabrasPuente {
	public List<MMemoriaPalabrasPuente> convertirLista(List<EMemoriaPalabrasPuente> memorias) {
		List<MMemoriaPalabrasPuente> mmemorias = new ArrayList<>();
		for (EMemoriaPalabrasPuente memoria : memorias) {
			mmemorias.add(new MMemoriaPalabrasPuente(memoria));
		}
		return mmemorias;
	}
}
