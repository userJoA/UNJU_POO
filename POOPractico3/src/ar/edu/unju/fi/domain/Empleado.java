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
	private Integer sueldoBasico;
	
	
	
	
	public Empleado(Integer legajo, String nombre, Integer antiguedad, Integer cantidadHijos,
			Date fechaNacimiento, Integer sueldoBasico) {
		super();
		nextId++;
		this.id = this.nextId;
		this.legajo = legajo;
		this.nombre = nombre;
		this.antiguedad = antiguedad;
		this.cantidadHijos = cantidadHijos;
		this.fechaNacimiento = fechaNacimiento;
		this.sueldoBasico = sueldoBasico;
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
	public Integer getSueldoBasico() {
		return sueldoBasico;
	}
	public void setSueldoBasico(Integer sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	

	
	
}
