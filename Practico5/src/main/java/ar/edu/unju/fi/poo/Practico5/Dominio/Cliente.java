package ar.edu.unju.fi.poo.Practico5.Dominio;

import java.util.ArrayList;

public class Cliente {
	private static Integer IdSerial=0;
	private Integer id;
	private Integer dni;
	private String nombre;
	private String email;
	private int telefono;
	private String localidad;
	private ArrayList<Compra> listaCompras;
	

	
	
	public Cliente(Integer dni, String nombre, String email, int telefono, String localidad) {
		super();
		IdSerial++;
		this.id =IdSerial;
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
		this.localidad = localidad;
		this.listaCompras=null;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	
	public ArrayList<Compra> getListaCompras() {
		return listaCompras;
	}

	public void setListaCompras(ArrayList<Compra> listaCompras) {
		this.listaCompras = listaCompras;
	}
	
	public void registrarCompra(Compra compra) {
		this.listaCompras.add(compra);
	}
	
	public String getTipoCliente() {
		return "";
	}
	
	
}
