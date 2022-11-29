package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EDesarrollo;
import com.cyad.producciones.model.MDesarrollo;

/**
 * Esta clase realiza una conversion de una entidad EArticulo a un objeto
 * MArticulo
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_desarrollo")
public class ConvertidorDesarrollo {
	public List<MDesarrollo> convertiLista(List<EDesarrollo> desarrorllos) {
		List<MDesarrollo> mDesarrollos = new ArrayList<>();
		for (EDesarrollo desarrollo : desarrorllos) {
			mDesarrollos.add(new MDesarrollo(desarrollo));
		}
		return mDesarrollos;

	}
}
