package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.cyad.posgrado.entity.EProfesor_Identificador_puente;
import com.cyad.posgrado.model.MProfesor_Identificador_puente;

/**
 * clase componente para conversion de entidad  EProfesor_Identificador_puente a modelo 
 * @author Enrique Ramírez Martínez 
 *
 */
@Component("convertidor_ProfesorIdentificador")
public class ConvertidorProfesorIdentificador {
	public List<MProfesor_Identificador_puente> convertiLista (List<EProfesor_Identificador_puente> listaProfesorIdentificador)
	{
		List<MProfesor_Identificador_puente> mProfesorIdentificador = new ArrayList<>();
		for(EProfesor_Identificador_puente profesorIdentificador :  listaProfesorIdentificador)
		{
			mProfesorIdentificador.add(new MProfesor_Identificador_puente(profesorIdentificador));
		}
		return mProfesorIdentificador;
	}
}
