package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.ETipoParticipante;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base datos de la información del catálogo de tipos de participante, para el caso de uso desarrollado se consideran internos o externos.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_tipo_participante")
public interface TipoParticipantesRepository extends JpaRepository <ETipoParticipante , Serializable> {
	/**
	 * metodo para realizar una busqueda de tipo de participante por id
	 * @param numero de id
	 * @return entidad tipo de participante
	 */
	public abstract ETipoParticipante findById(long id);
	/**
	 * metodo para realizar una busqueda de un tipo de participante por tipo
	 * @param tipo
	 * @return entidad tipo de participante
	 */
	public abstract ETipoParticipante findByTipo(String tipo);
}
