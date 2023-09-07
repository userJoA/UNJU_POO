package ar.edu.unju.fi.domain;

import java.util.Date;

import ar.edu.unju.fi.util.Constantes;

public abstract class Empleado {
	private static Integer nextId = 0;
	
	private Integer id;
	private Integer legajo;
	private String nombre;
	private Integer antiguedad;
	private Integer cantidadHijos;
	private Date fechaNacimiento;
	private double sueldoBasico;
	
	
	public Empleado(Integer legajo, String nombre, Integer antiguedad, Integer cantidadHijos,
			Date fechaNacimiento) {
		super();
		nextId++;
		this.id = this.nextId;
		this.legajo = legajo;
		this.nombre = nombre;
		this.antiguedad = antiguedad;
		this.cantidadHijos = cantidadHijos;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = Constantes.getSueldoBasico();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getLegajo() {
		return legajo;
	}
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}
	public Integer getCantidadHijos() {
		return cantidadHijos;
	}
	public void setCantidadHijos(Integer cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public double getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	
	
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", legajo=" + legajo + ", nombre=" + nombre + ", antiguedad=" + antiguedad
				+ ", cantidadHijos=" + cantidadHijos + ", fechaNacimiento=" + fechaNacimiento + ", sueldoNeto="
				+ calcularSueldoNeto() + "]";
	}
	

	public double adicionalHijo() {
		return Constantes.getAdicionalHijo()*this.cantidadHijos;
	}
	
	public double adicionalAntiguedad() {
		return Constantes.getAdicionalAntiguedad()*this.antiguedad;
	}
	
	public double remunerativosBonificables() {
		return this.sueldoBasico + adicionalAntiguedad();
	}
	
	public double calcularSueldoNeto() {
		//REMUNERATIVOS BONIFICABLES + SALARIO FAMILIAR - DESCUENTOS
		return remunerativosBonificables()+adicionalHijo()-remunerativosBonificables()*Constantes.getDescuento();
	}
	
}
