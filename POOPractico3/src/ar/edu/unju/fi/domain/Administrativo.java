package ar.edu.unju.fi.domain;

import java.util.Date;

public class Administrativo extends Empleado{
	
	Integer categoria;

	public Administrativo(Integer legajo, String nombre, Integer antiguedad, Integer cantidadHijos,
			Date fechaNacimiento, Integer categoria) {
		super(legajo, nombre, antiguedad, cantidadHijos, fechaNacimiento);
		this.categoria = categoria;
	}

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}
	
	
	
}
