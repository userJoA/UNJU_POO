package ar.edu.unju.fi.domain;

import java.util.Date;

import ar.edu.unju.fi.util.Constantes;

public class Profesional extends Empleado{

	public Profesional(Integer legajo, String nombre, Integer antiguedad, Integer cantidadHijos, Date fechaNacimiento) {
		super(legajo, nombre, antiguedad, cantidadHijos, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double remunerativosBonificables() {
		// TODO Auto-generated method stub
		return super.remunerativosBonificables()+Constantes.getAdicionalTitulo();
	}

	
	
}
