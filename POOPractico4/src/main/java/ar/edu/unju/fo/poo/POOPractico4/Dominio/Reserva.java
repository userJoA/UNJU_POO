package ar.edu.unju.fo.poo.POOPractico4.Dominio;

import java.time.LocalDate;

import ar.edu.unju.fo.poo.POOPractico4.util.Ciudades;
import ar.edu.unju.fo.poo.POOPractico4.util.Clase;
import ar.edu.unju.fo.poo.POOPractico4.util.EstadoReserva;

public class Reserva {
	private static Integer nextID=100;
	
	private Integer id;
	private Ciudades origen;
	private Ciudades destino;
	private LocalDate fechaSalida;
	private LocalDate fechaRegreso;
	private Clase clase;
	private Pasajero pasajero;
	private Pasajero acompaniante;
	private EstadoReserva estado;
	
	
	

	public Reserva(Ciudades origen, Ciudades destino, LocalDate fechaSalida, LocalDate fechaRegreso, Clase clase,
			Pasajero pasajero, Pasajero acompaniante, EstadoReserva estado) {
		super();
		nextID++;
		this.id=nextID;
		this.origen = origen;
		this.destino = destino;
		this.fechaSalida = fechaSalida;
		this.fechaRegreso = fechaRegreso;
		this.clase = clase;
		this.pasajero = pasajero;
		this.acompaniante = acompaniante;
		this.estado = estado;
	}




	public Ciudades getOrigen() {
		return origen;
	}




	public void setOrigen(Ciudades origen) {
		this.origen = origen;
	}




	public Ciudades getDestino() {
		return destino;
	}




	public void setDestino(Ciudades destino) {
		this.destino = destino;
	}




	public LocalDate getFechaSalida() {
		return fechaSalida;
	}




	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}




	public LocalDate getFechaRegreso() {
		return fechaRegreso;
	}




	public void setFechaRegreso(LocalDate fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}




	public Clase getClase() {
		return clase;
	}




	public void setClase(Clase clase) {
		this.clase = clase;
	}




	public Pasajero getPasajero() {
		return pasajero;
	}




	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}




	public Pasajero getAcompaniante() {
		return acompaniante;
	}




	public void setAcompaniante(Pasajero acompaniante) {
		this.acompaniante = acompaniante;
	}




	public EstadoReserva getEstado() {
		return estado;
	}




	public void setEstado(EstadoReserva estado) {
		this.estado = estado;
	}




	@Override
	public String toString() {
		return "Reserva [origen=" + origen + ", destino=" + destino + ", fechaSalida=" + fechaSalida + ", fechaRegreso="
				+ fechaRegreso + ", pasajero=" + pasajero+ ", estado=" + estado + "]";
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	
}
