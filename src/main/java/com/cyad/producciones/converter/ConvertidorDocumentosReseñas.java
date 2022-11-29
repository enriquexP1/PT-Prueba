package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EDocumentos_Reseñas;
import com.cyad.producciones.model.MDocumentos_Reseñas;

/**
 * Esta clase realiza una conversion de una entidad EDocumentos_Reseñas a un objeto
 * MDocumentos_Reseñas
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_documento_reseña")
public class ConvertidorDocumentosReseñas {

	public List<MDocumentos_Reseñas> convertirLista(List<EDocumentos_Reseñas> documentos) {
		List<MDocumentos_Reseñas> mdocumentos = new ArrayList<>();
		for (EDocumentos_Reseñas documento : documentos) {
			mdocumentos.add(new MDocumentos_Reseñas(documento));
		}
		return mdocumentos;
	}
}
