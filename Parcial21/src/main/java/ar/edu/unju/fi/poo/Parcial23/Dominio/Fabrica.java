package ar.edu.unju.fi.poo.Parcial23.Dominio;

public class Fabrica {
	private String nombre;
	private String direccion;
	
	public Fabrica(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Fabrica [nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	
	
}
