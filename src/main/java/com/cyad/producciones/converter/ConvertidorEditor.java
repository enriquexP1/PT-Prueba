package com.cyad.producciones.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cyad.producciones.entity.EEditor;
import com.cyad.producciones.model.MEditor;

/**
 * Esta clase realiza una conversion de una entidad EEditor a un objeto MEditor
 * 
 * @author Enrique Ramírez martínez
 *
 */
@Component("convertidor_editor")
public class ConvertidorEditor {
	public List<MEditor> convertirLista(List<EEditor> editores) {
		List<MEditor> meditores = new ArrayList<>();
		for (EEditor editor : editores) {
			meditores.add(new MEditor(editor));
		}
		return meditores;
	}
}
