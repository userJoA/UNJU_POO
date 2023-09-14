package ar.edu.unju.fo.poo.POOPractico4.Main;

import java.time.LocalDate;

import ar.edu.unju.fo.poo.POOPractico4.Dominio.Pasajero;
import ar.edu.unju.fo.poo.POOPractico4.Dominio.Reserva;
import ar.edu.unju.fo.poo.POOPractico4.Manager.ReservaManager;
import ar.edu.unju.fo.poo.POOPractico4.util.Ciudades;
import ar.edu.unju.fo.poo.POOPractico4.util.Clase;
import ar.edu.unju.fo.poo.POOPractico4.util.EstadoReserva;
import ar.edu.unju.fo.poo.POOPractico4.util.listaPasajeros;

public class Main {

	public static void main(String[] args) {
		
		Reserva reserva=new Reserva(Ciudades.CORDOBA, Ciudades.LA_PLATA,LocalDate.parse("2023-05-03"),LocalDate.parse("2023-05-23"),Clase.ECONOMY, listaPasajeros.getListaPasajeros(3), null, EstadoReserva.RESERVADA);
		ReservaManager.registrarReseravaSA(reserva);
		
		System.out.println(ReservaManager.LISTA_RESERVAS);
	}

}
