package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EDocumentoRespaldo;
import com.cyad.producciones.model.MDocumentoRespaldo;

/**
 * Esta clase realiza una conversion de una entidad EArticulo a un objeto
 * MArticulo
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_documento_respaldo")
public class ConvertidorDocumentoRespaldo {
	public List<MDocumentoRespaldo> convertiLista(List<EDocumentoRespaldo> documentos) {
		List<MDocumentoRespaldo> mdocumentos = new ArrayList<>();
		for (EDocumentoRespaldo documento : documentos) {
			mdocumentos.add(new MDocumentoRespaldo(documento));
		}
		return mdocumentos;
	}
}
