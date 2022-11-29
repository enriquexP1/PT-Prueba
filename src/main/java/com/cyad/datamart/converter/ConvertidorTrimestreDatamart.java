package com.cyad.datamart.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.datamart.entity.ETrimestreDatamart;
import com.cyad.datamart.model.MTrimestreDatamart;
/**
 * clase componente para conversion de entidad  ETrimestreDatamart a modelo MTrimestreDatamart
 * @author Salvador Solis Atenco
 *
 */
@Component("data_convertidor_trimestre")
public class ConvertidorTrimestreDatamart {
	/**
	 * metodo que convierte una lista de entidades a objetos
	 * @param lista de entidades ETrayectoriaDatamart
	 * @return lista de objetos MTrayectoriaDatamart
	 */
	public List<MTrimestreDatamart> convertirLista(List<ETrimestreDatamart> e_trimestres){
		List<MTrimestreDatamart> m_trimestres = new ArrayList<MTrimestreDatamart>();
		for(ETrimestreDatamart trimestre : e_trimestres)
			m_trimestres.add(new MTrimestreDatamart(trimestre));
		
		return m_trimestres;
	}
}
