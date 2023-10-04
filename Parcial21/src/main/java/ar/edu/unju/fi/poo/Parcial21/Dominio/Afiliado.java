package ar.edu.unju.fi.poo.Parcial21.Dominio;

public class Afiliado {
	private static Integer nextId=0;
	private String numeroLegajo;
	private Integer id;
	private int dni;
	private String nombreAfiliado;
	private Plan plan;
	
	
	public Afiliado(int dni, String nombreAfiliado, Plan plan) {
		super();
		nextId++;
		this.id = nextId;
		this.dni = dni;
		this.nombreAfiliado = nombreAfiliado;
		this.plan = plan;
		this.numeroLegajo=String.valueOf(dni).substring(0,3)+"-"+String.format("%04d", id);
	}

	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getNombreAfiliado() {
		return nombreAfiliado;
	}


	public void setNombreAfiliado(String nombreAfiliado) {
		this.nombreAfiliado = nombreAfiliado;
	}


	public Plan getPlan() {
		return plan;
	}


	public void setPlan(Plan plan) {
		this.plan = plan;
	}


	public String getNumeroLegajo() {
		return numeroLegajo;
	}


	public void setNumeroLegajo(String numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}
	
}
