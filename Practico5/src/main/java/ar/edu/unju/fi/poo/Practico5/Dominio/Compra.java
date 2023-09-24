package ar.edu.unju.fi.poo.Practico5.Dominio;

import java.time.LocalDate;

public class Compra {
	private static Integer nextId=0;
	private Integer id;
	private LocalDate fecha;
	private Double importe;
	
	
	public Compra(LocalDate fecha, Double importe) {
		super();
		nextId++;
		this.id = nextId;
		this.fecha = fecha;
		this.importe = importe;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public Double getImporte() {
		return importe;
	}


	public void setImporte(Double importe) {
		this.importe = importe;
	}
	
	
	

}
