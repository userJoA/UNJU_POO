package ar.edu.unju.fo.poo.POOPractico4.Dominio;

import java.time.LocalDate;

import ar.edu.unju.fo.poo.POOPractico4.util.Ciudades;
import ar.edu.unju.fo.poo.POOPractico4.util.EstadoReserva;

public class Reserva {
	private Ciudades origen;
	private Ciudades destino;
	private LocalDate fechaSalida;
	private LocalDate fechaRegreso;
	private Pasajero pasajero;
	private Pasajero acompaniante;
	private EstadoReserva estado;
	
	
	public Reserva(Ciudades origen, Ciudades destino, LocalDate fechaSalida, LocalDate fechaRegreso, Pasajero pasajero,
			Pasajero acomp, EstadoReserva estadoReserva) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.fechaSalida = fechaSalida;
		this.fechaRegreso = fechaRegreso;
		this.pasajero = pasajero;
		this.acompaniante = acomp;
		this.estado = estadoReserva;
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


	public EstadoReserva getEstadoReserva() {
		return estado;
	}


	public void setEstadoReserva(EstadoReserva estadoReserva) {
		this.estado = estadoReserva;
	}



	@Override
	public String toString() {
		return "Reserva [origen=" + origen + ", destino=" + destino + ", fechaSalida=" + fechaSalida + ", fechaRegreso="
				+ fechaRegreso + ", pasajero=" + pasajero + ", estado=" + estado + "]";
	}
	
	
	
	
}
