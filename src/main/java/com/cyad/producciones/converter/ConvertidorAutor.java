package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EAutor;
import com.cyad.producciones.model.MAutor;

/**
 * Esta clase realiza una conversion de una entidad Eutora un objeto MAutor
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_autor")
public class ConvertidorAutor {
	public List<MAutor> convertirLista(List<EAutor> autores) {
		List<MAutor> mautores = new ArrayList<>();
		for (EAutor autor : autores) {
			mautores.add(new MAutor(autor));
		}
		return mautores;
	}
}
