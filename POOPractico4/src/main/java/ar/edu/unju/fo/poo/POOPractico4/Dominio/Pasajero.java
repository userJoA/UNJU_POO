package ar.edu.unju.fo.poo.POOPractico4.Dominio;

import ar.edu.unju.fo.poo.POOPractico4.util.Apellidos;
import ar.edu.unju.fo.poo.POOPractico4.util.Nombres;

public class Pasajero {
	
	private Nombres nombre;
	private Apellidos apellido;
	private String dni;
	private Integer telefono;
	private String correo;
	
	
	public Pasajero(Nombres nombre, Apellidos apellido, String dni, Integer telefono, String correo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.correo = correo;
	}


	public Nombres getNombre() {
		return nombre;
	}


	public void setNombre(Nombres nombre) {
		this.nombre = nombre;
	}


	public Apellidos getApellido() {
		return apellido;
	}


	public void setApellido(Apellidos apellido) {
		this.apellido = apellido;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public Integer getTelefono() {
		return telefono;
	}


	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
