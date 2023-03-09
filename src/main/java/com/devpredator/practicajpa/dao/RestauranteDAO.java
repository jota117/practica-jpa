/**
 * 
 */
package com.devpredator.practicajpa.dao;

import java.util.List;

import com.devpredator.practicajpa.entity.Restaurante;

/**
 * @author 4PF28LA_2004
 *
 */
public interface RestauranteDAO {
	
	void guardar(Restaurante restaurante);
	void actualizar(Restaurante restaurante);
	void eliminar(long id);
	List<Restaurante> consultar();
	Restaurante consultarById(Long id);

}
