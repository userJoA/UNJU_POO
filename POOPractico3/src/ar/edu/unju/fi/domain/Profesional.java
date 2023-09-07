package ar.edu.unju.fi.domain;

import java.time.LocalDate;
import java.util.Date;

import ar.edu.unju.fi.util.Constantes;

public class Profesional extends Empleado{

	public Profesional(Integer legajo, String nombre, Integer antiguedad, Integer cantidadHijos, LocalDate fechaNacimiento) {
		super(legajo, nombre, antiguedad, cantidadHijos, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double remunerativosBonificables() {
		// TODO Auto-generated method stub
		return super.remunerativosBonificables()+Constantes.getAdicionalTitulo();
	}

	@Override
	public String toString() {
		return super.toString()
				+ "\n EMPLEADO PROFESIONAL"
				+ "\n SUELDO NETO: "+ "$"+calcularSueldoNeto();
	}

	
	
}
