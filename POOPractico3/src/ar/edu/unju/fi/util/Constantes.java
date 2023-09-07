package ar.edu.unju.fi.util;

public class Constantes {
	
	private static final double SUELDO_BASICO=150000.00;
	private static final double ADICIONAL_ANTIGUEDAD=7000.00;
	private static final double ADICIONAL_HIJO=8000.00;
	private static final double ADICIONAL_TITULO=80000.00;
	private static final double PORCENTAJE_DESCUENTO=0.15;
	private static final double PORCENTAJE_AUMENTO=0.10;
	
	
	public static double getSueldoBasico() {
		return SUELDO_BASICO;
	}
	
	public static double getAdicionalAntiguedad() {
		return ADICIONAL_ANTIGUEDAD;
	}
	
	public static double getAdicionalHijo() {
		return ADICIONAL_HIJO;
	}
	
	public static double getAdicionalTitulo() {
		return ADICIONAL_TITULO;
	}
	
	public static double getDescuento() {
		return PORCENTAJE_DESCUENTO;
	}
	
	public static double getAumento() {
		return PORCENTAJE_AUMENTO;
	}
}
