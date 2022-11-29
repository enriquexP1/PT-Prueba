package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EProduccionAcademicaDocumentosReseña;
import com.cyad.producciones.model.MProduccionAcademicaDocumentosReseña;

/**
 * Esta clase realiza una conversion de una entidad
 * EProduccionAcademicaDocumentoReseña a un objeto
 * MProduccionAcademicaDocumentoReseña
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_produccion_academica_documento_reseña")
public class ConvertidorProduccionAcademicaDocumentoReseña {
	public List<MProduccionAcademicaDocumentosReseña> convertirLista(
			List<EProduccionAcademicaDocumentosReseña> producciones) {
		List<MProduccionAcademicaDocumentosReseña> mproducciones = new ArrayList<>();
		for (EProduccionAcademicaDocumentosReseña prod : producciones) {
			mproducciones.add(new MProduccionAcademicaDocumentosReseña(prod));
		}
		return mproducciones;
	}
}
