package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.ELibroPalabrasPuente;
import com.cyad.producciones.model.MLibroPalabrasPuente;

/**
 * Esta clase realiza una conversion de una entidad ELibroPalabraPuente a un
 * objeto MLibroPalabraPuente
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_libro_palabras_puente")
public class ConvertidorLibroPalabrasPuente {

	public List<MLibroPalabrasPuente> convertirLista(List<ELibroPalabrasPuente> libros) {
		List<MLibroPalabrasPuente> mlibros = new ArrayList<>();
		for (ELibroPalabrasPuente libro : libros) {
			mlibros.add(new MLibroPalabrasPuente(libro));
		}
		return mlibros;
	}
}
