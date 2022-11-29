package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EParticipante;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base datos de la información de los participantes de un grupo de protocolo.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_participantes")
public interface ParticipantesRepository extends JpaRepository <EParticipante,Serializable>{
	/**
	 * metodo para realizar una busqueda de alumno por id
	 * @param id
	 * @return entidad participante
	 */
	public abstract EParticipante findById(long id);
}
