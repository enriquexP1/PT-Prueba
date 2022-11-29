package com.cyad.posgrado.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyad.posgrado.entity.EAdeudo;
/**
 * Clase que hace uso de JpaRepository para proporcionar soporte de repositorio y las consultas hacia la base de datos de la información de adeudos de documentación de los alumnos.
 * @author Salvador Solis Atenco
 *
 */
@Repository("repositorio_adeudos")
public interface AdeudoRepository extends JpaRepository<EAdeudo, Serializable> {
	/**
	 * metodo para realizar una busqueda de adeudo por id
	 * @param id
	 * @return entidad adeudo
	 */
	public abstract EAdeudo findById(long id);
}
