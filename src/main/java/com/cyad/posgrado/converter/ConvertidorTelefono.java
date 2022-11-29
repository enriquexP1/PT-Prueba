package com.cyad.posgrado.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.posgrado.entity.ETelefono;
import com.cyad.posgrado.model.MTelefono;

/**
 * clase componente para conversion de entidad  ETelefono a modelo MTelefono
 * @author Enrique Ramírez Martínez 
 *
 */
@Component("convertidor_telefono")
public class ConvertidorTelefono {
	public List<MTelefono> convertirLista (List<ETelefono> telefonos)
	{
		List<MTelefono> mtelefonos = new ArrayList<>();
		for(ETelefono telefono :  telefonos)
		{
			mtelefonos.add(new MTelefono(telefono));
		}
		return mtelefonos;
	}
}
