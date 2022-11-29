package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.ELibro;
import com.cyad.producciones.model.MLibro;

/**
 * Esta clase realiza una conversion de una entidad ELibro a un objeto
 * MLibro
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_libro")
public class ConvertidorLibro {
	public List<MLibro> convertirLista(List<ELibro> libros) {
		List<MLibro> mlibros = new ArrayList<>();
		for (ELibro libro : libros) {
			mlibros.add(new MLibro(libro));
		}
		return mlibros;
	}
}
