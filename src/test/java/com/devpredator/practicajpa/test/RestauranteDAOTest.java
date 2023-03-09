package com.devpredator.practicajpa.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.devpredator.practicajpa.dao.RestauranteDAO;
import com.devpredator.practicajpa.dao.impl.RestauranteDAOImpl;
import com.devpredator.practicajpa.entity.Menu;
import com.devpredator.practicajpa.entity.Restaurante;
import com.devpredator.practicajpa.entity.TipoRestaurante;

class RestauranteDAOTest {

	private RestauranteDAO restauranteDAO = new RestauranteDAOImpl(); 
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	/**
	 * Test method for {@link com.buenmasttro.projectjpa.dao.impl.SubGeneroDAOImpl#guardar(com.buenmaestro.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testGuardar() {
		
		Menu menu = new Menu();
		menu.setDescripcion("Cortes de Carne");
		menu.setFechaCreacion(LocalDateTime.now());
		menu.setEstatus(true);
		
		TipoRestaurante tipoRestaurante = new TipoRestaurante();
		tipoRestaurante.setDescripcion("Platillos a la parrilla y Cortes de carne");
		tipoRestaurante.setFechaCreacion(LocalDateTime.now());
		tipoRestaurante.setEstatus(true);
		
		Restaurante restaurante = new Restaurante();
		restaurante.setNombre("Entre Fuegos");
		restaurante.setImagen(null);
		restaurante.setSlogan("Elite Steak House");
		restaurante.setTipoRestaurante(tipoRestaurante);
		restaurante.setFechaCreacion(LocalDateTime.now());
		restaurante.setEstatus(true);
		restaurante.setMenu(menu);
		
		this.restauranteDAO.guardar(restaurante);
		
		
	}

	/**
	 * Test method for {@link com.buenmasttro.projectjpa.dao.impl.SubGeneroDAOImpl#actualizar(com.buenmaestro.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testActualizar() {
		Restaurante restauranteConsultado = this.restauranteDAO.consultarById(7L);
		
		restauranteConsultado.setNombre("Entre Fuegos - Satelite");
		restauranteConsultado.getTipoRestaurante().setDescripcion("Cortes");
		restauranteConsultado.getMenu().setDescripcion("A la Parrilla");
		
		
		this.restauranteDAO.actualizar(restauranteConsultado);
		
	}

	/**
	 * Test method for {@link com.buenmasttro.projectjpa.dao.impl.SubGeneroDAOImpl#eliminar(long)}.
	 */
	@Test
	void testEliminar() {
		this.restauranteDAO.eliminar(6L);
	}

	/**
	 * Test method for {@link com.buenmasttro.projectjpa.dao.impl.SubGeneroDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<Restaurante> restauranteConsultados = this.restauranteDAO.consultar();
		
		assertTrue(restauranteConsultados.size() > 0);
		
		for(Restaurante restaurante : restauranteConsultados) {
			System.out.println("Restaurante: " + restaurante.getNombre());
			System.out.println("Tipo Restaurante: " + restaurante.getTipoRestaurante().getDescripcion());
			System.out.println("Menu: " + restaurante.getMenu().getDescripcion());
			
		}
	}



}
