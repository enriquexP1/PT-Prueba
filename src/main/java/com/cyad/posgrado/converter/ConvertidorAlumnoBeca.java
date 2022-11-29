package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EAlumnoBeca;
import com.cyad.posgrado.model.MAlumnoBeca;

/**
 * clase componente para conversion de entidad  EAlumnoBecas a modelo MAlumnoBecas
 * @author Enrique Ramírez Martínez 
 *
 */
@Component("convertidor_AlumnoBeca")
public class ConvertidorAlumnoBeca {
	public List<MAlumnoBeca> convertiLista (List<EAlumnoBeca> listaAlumnoBeca)
	{
		List<MAlumnoBeca> mAlumnoBecas = new ArrayList<>();
		for(EAlumnoBeca beca : listaAlumnoBeca) {
			mAlumnoBecas.add(new MAlumnoBeca(beca));
		}
		return mAlumnoBecas;
	}
}
