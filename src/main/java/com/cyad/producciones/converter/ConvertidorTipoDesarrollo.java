package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.ETipoDesarrollo;
import com.cyad.producciones.model.MTipoDesarrollo;

/**
 * Esta clase realiza una conversion de una entidad EArticulo a un objeto
 * MArticulo
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_tipo_desarrollo")
public class ConvertidorTipoDesarrollo {
	public List<MTipoDesarrollo> convertiLista(List<ETipoDesarrollo> tipos) {
		List<MTipoDesarrollo> mtipos = new ArrayList<>();
		for (ETipoDesarrollo tipo : tipos) {
			mtipos.add(new MTipoDesarrollo(tipo));
		}
		return mtipos;
	}
}
