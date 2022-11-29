package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.ERolParticipacion;
import com.cyad.producciones.model.MRolParticipacion;

/**
 * Esta clase realiza una conversion de una entidad EArticulo a un objeto
 * MArticulo
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_rol_participacion")
public class ConvertidorRolParticipacion {
	public List<MRolParticipacion> convertirLista(List<ERolParticipacion> roles) {
		List<MRolParticipacion> mroles = new ArrayList<>();
		for (ERolParticipacion rol : roles) {
			mroles.add(new MRolParticipacion(rol));
		}
		return mroles;
	}
}
