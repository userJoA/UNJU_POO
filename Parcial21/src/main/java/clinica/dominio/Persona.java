package clinica.dominio;

public abstract class Persona {
	private static Integer nextId=0;
	private Integer id;
	private String nombre;
	private int dni;
	
	public Persona(String nombre, int dni) {
		super();
		nextId++;
		this.id =nextId ;
		this.nombre = nombre;
		this.dni = dni;
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", dni=" + dni + "]";
	}
	
	
	
}
