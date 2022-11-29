package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EOrigenReporte;
import com.cyad.producciones.model.MOrigenReporte;

/**
 * Esta clase realiza una conversion de una entidad EOrigenReporte a un objeto
 * MOrigenReporte
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_origen_reporte")
public class ConvertidorOrigenReporte {
public List<MOrigenReporte> convertirLista(List<EOrigenReporte> origenes)
{
	List<MOrigenReporte> morigenreportes = new ArrayList<>();
	for(EOrigenReporte reporte : origenes)
	{
		morigenreportes.add(new MOrigenReporte(reporte));
	}
	return morigenreportes;
	}
}
