/**
 * 
 */
package com.devpredator.practicajpa.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 4PF28LA_2004
 *
 */
@Entity
@Table (name = "restaurante")
public class Restaurante {
	
	@Getter @Setter
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idRestaurante")
	private Long idRestaurante;
	
	@Getter @Setter
	@Column(name = "nombre", length = 100)
	private String nombre;
	
	@Getter @Setter
	@Column(name = "imagen", length = 50)
	private String imagen;
	
	@Getter @Setter
	@Column(name = "slogan", length = 100)
	private String slogan;
	
	@Getter @Setter
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTipoRestaurante")
	@Cascade(CascadeType.REMOVE)
	private TipoRestaurante tipoRestaurante;
	
	@Getter @Setter
	@Column(name = "fechaCreacion")
	private LocalDateTime fechaCreacion;
	
	@Getter @Setter
	@Column(name = "fechaModificacion")
	private LocalDateTime fechaModificacion;
	
	@Getter @Setter
	@Column(name = "estatus")
	private boolean estatus;
	
	@Getter @Setter
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMenu")
	@Cascade(CascadeType.REMOVE)
	private Menu menu;
		

}
