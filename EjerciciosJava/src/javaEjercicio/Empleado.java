package javaEjercicio;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Empleado {
	private static int nextId=0;
	private int id;
	private int legajo;
	private String nombre;
	private LocalDate fechaDeingreso;
	private double salario;
	
	
	public Empleado(int legajo, String nombre, LocalDate fechaDeingreso, double salario) {
		super();
		nextId++;
		this.id = nextId;
		this.legajo = legajo;
		this.nombre = nombre;
		this.fechaDeingreso = fechaDeingreso;
		this.salario = salario;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getLegajo() {
		return legajo;
	}


	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public LocalDate getFechaDeingreso() {
		return fechaDeingreso;
	}


	public void setFechaDeingreso(LocalDate fechaDeingreso) {
		this.fechaDeingreso = fechaDeingreso;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "\nlegajo=" + legajo + " - nombre=" + nombre + " - fechaDeingreso=" + fechaDeingreso
				+ " - salario=" + salario + "\n";
	}


	
}
