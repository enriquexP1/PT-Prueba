package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.EAlumno_Identificador_puente;
import com.cyad.posgrado.model.MAlumno_Identificador_puente;


/**
 * clase componente para conversion de entidad  EAlumno_Identificador_puente a modelo 
 * @author Enrique Ramírez Martínez 
 *
 */
@Component("convertidor_AlumnoIdentificador")
public class ConvertidorAlumnoIdentificador {
	public List<MAlumno_Identificador_puente> convertiLista (List<EAlumno_Identificador_puente> listaAlumnoIdentificador)
	{
		List<MAlumno_Identificador_puente> mAlumnoIdentificador = new ArrayList<>();
		for(EAlumno_Identificador_puente alumnoIdentificador :  listaAlumnoIdentificador)
		{
			mAlumnoIdentificador.add(new MAlumno_Identificador_puente(alumnoIdentificador));
		}
		return mAlumnoIdentificador;
	}
}
