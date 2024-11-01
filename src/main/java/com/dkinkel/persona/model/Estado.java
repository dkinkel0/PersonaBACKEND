package com.dkinkel.persona.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

//se utiliza en el contexto de JPA (Java Persistence API) para definir una clase como una entidad que se mapeará a una tabla en la base de datos
@Entity
@Table(name = "estado") //se utiliza para especificar detalles sobre la tabla en la base de dato
public class Estado {

	@Id //en JPA se utiliza para designar un campo como la clave primaria de una entidad
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	@ManyToOne
	@JoinColumn(name = "id_pais")
	private Pais pais;
	private String nombre;

//	Generar el constructor y los Getters y Setters
	public Estado(Pais pais, String nombre) {
		super();
		this.pais = pais;
		this.nombre = nombre;
	}

	public Estado() {
		// Constructor vacio
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
