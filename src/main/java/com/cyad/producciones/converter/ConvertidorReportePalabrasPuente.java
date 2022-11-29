package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EReportePalabrasPuente;
import com.cyad.producciones.model.MReportePalabrasPuente;

/**
 * Esta clase realiza una conversion de una entidad EReportePalabraPuente a un
 * objeto MReportePalabraPuente
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_reporte_palabras_puente")
public class ConvertidorReportePalabrasPuente {
	public List<MReportePalabrasPuente> convertirLista(List<EReportePalabrasPuente> reportes) {
		List<MReportePalabrasPuente> mreportes = new ArrayList<>();
		for (EReportePalabrasPuente reporte : reportes) {
			mreportes.add(new MReportePalabrasPuente(reporte));
		}
		return mreportes;
	}
}
