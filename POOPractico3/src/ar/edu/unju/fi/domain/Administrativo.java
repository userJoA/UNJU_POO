package ar.edu.unju.fi.domain;

import java.time.LocalDate;
import java.util.Date;


public class Administrativo extends Empleado{
	
	private static final double ADICIONAL_CATEGORIA1=10000;
	private static final double ADICIONAL_CATEGORIA2=14000;
	private static final double ADICIONAL_CATEGORIA3=18000;
	private static final double ADICIONAL_CATEGORIA4=30000;
	private static final double ADICIONAL_CATEGORIA5=40000;
	
	Integer categoria;

	public Administrativo(Integer legajo, String nombre, Integer antiguedad, Integer cantidadHijos,
			LocalDate fechaNacimiento, Integer categoria) {
		super(legajo, nombre, antiguedad, cantidadHijos, fechaNacimiento);
		this.categoria = categoria;
	}

	public Integer getCategoria() {
		return categoria;
	}

	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}

	public double adicionalCategoria() {
		double adicionalCategoria=0;
		switch(this.categoria) {
			case 1: adicionalCategoria= ADICIONAL_CATEGORIA1; break;
			case 2: adicionalCategoria= ADICIONAL_CATEGORIA2; break;
			case 3: adicionalCategoria= ADICIONAL_CATEGORIA3; break;
			case 4: adicionalCategoria= ADICIONAL_CATEGORIA4; break;
			case 5: adicionalCategoria= ADICIONAL_CATEGORIA5; break;
			default: System.out.println("error");
				
		}
		return adicionalCategoria;
	}

	@Override
	public double remunerativosBonificables() {
		// TODO Auto-generated method stub
		return super.remunerativosBonificables()+adicionalCategoria();
	}

	@Override
	public String toString() {
		return super.toString()
				+ "\n EMPLEADO ADMINISTRATIVO"
				+ "\n CATEGORIA: "+this.categoria
				+ "\n SUELDO NETO: " + "$"+ calcularSueldoNeto();
	}
	

	
	
	
}
