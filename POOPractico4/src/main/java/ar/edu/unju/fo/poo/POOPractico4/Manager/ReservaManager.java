package ar.edu.unju.fo.poo.POOPractico4.Manager;


import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fo.poo.POOPractico4.Dominio.Pasajero;
import ar.edu.unju.fo.poo.POOPractico4.Dominio.Reserva;
import ar.edu.unju.fo.poo.POOPractico4.util.EstadoReserva;


public class ReservaManager {
	public static List<Reserva> LISTA_RESERVAS=new ArrayList<Reserva>();
	
	public static void registrarReseravaSA(Reserva reserva) {
		LISTA_RESERVAS.add(reserva);
	}
	
	public static void registrarReservaCA(Reserva reserva,Pasajero acompaniante) {
		reserva.setAcompaniante(acompaniante);
		LISTA_RESERVAS.add(reserva);
	}
	
	public static Reserva buscarReserva(Integer id) {
		for(Reserva r:LISTA_RESERVAS) {
			if(r.getId()==id) {
				return r;
			}
		}
		return null;
	}
	
	public static void cancelarReserva(Integer id) {
		for(Reserva reserva:LISTA_RESERVAS) {
			if(reserva.getId()==id && reserva.getEstado()!=EstadoReserva.CANCELADA) {
				reserva.setEstado(EstadoReserva.CANCELADA);
			}
		}
	}
	
	public static void pagarReserva(Integer id) {
		for(Reserva reserva:LISTA_RESERVAS) {
			if(reserva.getId()==id && reserva.getEstado()!=EstadoReserva.PAGADA) {
				reserva.setEstado(EstadoReserva.PAGADA);
			}
		}
	}
	
	public static List<Reserva> listaReservasPorEstado(String estado){
		List<Reserva> lista=new ArrayList<Reserva>();
		for(Reserva reserva:LISTA_RESERVAS) {
			if(reserva.getEstado().toString()==estado) {
				lista.add(reserva);
			}
		}
		return lista;
	}

}
