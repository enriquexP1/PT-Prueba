package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EConferenciaPresentacion;
import com.cyad.producciones.model.MConferenciaPresentacion;

/**
 * Esta clase realiza una conversion de una entidad EConferenciaPresentacion a
 * un objeto MConferenciaPresentacion
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_conferencia_presentacion")
public class ConvertidorConferenciaPresentacion {
	public List<MConferenciaPresentacion> convertirLista(List<EConferenciaPresentacion> conferenciasPresentaciones) {
		List<MConferenciaPresentacion> mconferencias = new ArrayList<>();
		for (EConferenciaPresentacion conferencia : conferenciasPresentaciones) {
			mconferencias.add(new MConferenciaPresentacion(conferencia));
		}
		return mconferencias;
	}
}
