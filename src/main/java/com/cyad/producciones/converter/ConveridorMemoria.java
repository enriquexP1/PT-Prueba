package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EMemoria;
import com.cyad.producciones.model.MMemoria;

/**
 * Esta clase realiza una conversion de una entidad EMemoria a un objeto
 * MMemoria
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_memoria")
public class ConveridorMemoria {
	public List<MMemoria> convertirLista(List<EMemoria> memorias)
	{
		List<MMemoria> mMemorias  = new ArrayList<>();
		for(EMemoria memoria :  memorias)
		{
			mMemorias.add(new MMemoria(memoria));
		}
		return mMemorias;
	}
}
