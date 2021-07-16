package com.ym.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // Anotacion de persistencia
public class Persona {
	@Id // indica clave primaria de la tabla
	private int idPersona;
	@Column(name = "user_nombre", length = 50)
	private String nombre;
	private String apellido;
	
	public int getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
