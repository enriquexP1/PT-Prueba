package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EReporte;
import com.cyad.producciones.model.MReporte;

/**
 * Esta clase realiza una conversion de una entidad ELibro a un objeto
 * MLibro
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_reporte")
public class ConvertidorReporte {
	
public List<MReporte> convertirLista(List<EReporte> reportes)
{
	List<MReporte> mreportes =  new ArrayList<>();
	for(EReporte reporte :  reportes)
	{
		mreportes.add(new MReporte(reporte));
	}
	return mreportes;
	}

}
