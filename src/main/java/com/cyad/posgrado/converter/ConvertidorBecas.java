package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EBecas;
import com.cyad.posgrado.model.MBecas;

/**
 * clase componente para conversion de entidad  EBecas a modelo MBecas
 * @author Enrique Ramírez Martínez 
 *
 */
@Component("convertidor_becas")
public class ConvertidorBecas {
	public List<MBecas> covertirLista(List<EBecas> listaBecas)
	{
		List<MBecas> mbecas = new ArrayList<>();
		for(EBecas beca : listaBecas) {
			mbecas.add(new MBecas(beca));
		}
		return mbecas;
	}
}
