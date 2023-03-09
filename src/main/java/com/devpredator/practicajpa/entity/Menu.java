/**
 * 
 */
package com.devpredator.practicajpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 4PF28LA_2004
 *
 */
@Entity
@Table (name = "menu")
public class Menu {
	
	@Getter @Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMenu")
	private Long idMenu;
	
	@Getter @Setter
	@Column(name = "descripcion", length = 11)
	private String clave;
	
	@Getter @Setter
	@Column(name = "descripcion", length = 500)
	private String descripcion;
	
	@Getter @Setter
	@Column(name = "fechaCreacion")
	private LocalDateTime fechaCreacion;
	
	@Getter @Setter
	@Column(name = "fechaModificacion")
	private LocalDateTime fechaModificacion;
	
	@Getter @Setter
	@Column(name = "estatus")
	private boolean estatus;
	
	
}
