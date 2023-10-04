package ar.edu.unju.fi.poo.Parcial23.Dominio;



public class Tecnico {
	private static Integer nextId=0;
	private Integer id;
	private String nombre;
	private String estado;
	
	
	public Tecnico(String nombre, String estado) {
		super();
		nextId++;
		this.id = nextId;
		this.nombre = nombre;
		this.estado = estado;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "Tecnico [id=" + id + ", nombre=" + nombre + ", estado=" + estado + "]";
	}
	

	
}
