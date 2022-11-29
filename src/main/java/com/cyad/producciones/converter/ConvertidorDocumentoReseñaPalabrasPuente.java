package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EDocumentoReseñaPalabrasPuente;
import com.cyad.producciones.model.MDocumentoReseñaPalabrasPuente;

/**
 * Esta clase realiza una conversion de una entidad EDocumentoReseñaPalabraPuente a un
 * objeto MDocumentoReseñaPalabraPuente
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_documento_reseña_palabras_puente")
public class ConvertidorDocumentoReseñaPalabrasPuente {
	public List<MDocumentoReseñaPalabrasPuente> convertirLista(List<EDocumentoReseñaPalabrasPuente> documentos) {
		List<MDocumentoReseñaPalabrasPuente> mdocumentos = new ArrayList<>();
		for (EDocumentoReseñaPalabrasPuente documento : documentos) {
			mdocumentos.add(new MDocumentoReseñaPalabrasPuente(documento));
		}
		return mdocumentos;
	}
}
