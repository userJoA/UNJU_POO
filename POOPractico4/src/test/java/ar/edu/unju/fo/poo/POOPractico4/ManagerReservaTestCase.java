/**
 * 
 */
package ar.edu.unju.fo.poo.POOPractico4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fo.poo.POOPractico4.Dominio.Reserva;
import ar.edu.unju.fo.poo.POOPractico4.Manager.ReservaManager;
import ar.edu.unju.fo.poo.POOPractico4.util.Ciudades;
import ar.edu.unju.fo.poo.POOPractico4.util.Clase;
import ar.edu.unju.fo.poo.POOPractico4.util.EstadoReserva;
import ar.edu.unju.fo.poo.POOPractico4.util.listaPasajeros;

/**
 * 
 */

@DisplayName("Pruebas unitarias de ReservaManager")
public class ManagerReservaTestCase {
	static ReservaManager target;
	static Reserva reserva1;
	static Reserva reserva2;
	static Reserva reserva3;
	static Reserva reserva4;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		target= new ReservaManager();
		reserva1= new Reserva(Ciudades.PARANA,Ciudades.SAN_MIGUEL_TUCUMAN, LocalDate.parse("2023-09-10"), LocalDate.parse("2023-09-12"),Clase.BUSINESS, listaPasajeros.getListaPasajeros(0), null, EstadoReserva.RESERVADA);
		reserva2= new Reserva(Ciudades.CORDOBA,Ciudades.SAN_MIGUEL_TUCUMAN, LocalDate.parse("2023-09-15"), LocalDate.parse("2023-09-19"),Clase.ECONOMY, listaPasajeros.getListaPasajeros(0), null, EstadoReserva.RESERVADA);
		reserva3= new Reserva(Ciudades.LA_PLATA,Ciudades.SAN_SALVADOR_JUJUY, LocalDate.parse("2023-09-17"), LocalDate.parse("2023-09-20"),Clase.BUSINESS, listaPasajeros.getListaPasajeros(0), null, EstadoReserva.RESERVADA);
		reserva4= new Reserva(Ciudades.SANTA_FE,Ciudades.VIEDMA, LocalDate.parse("2023-09-11"), LocalDate.parse("2023-09-21"),Clase.BUSINESS, listaPasajeros.getListaPasajeros(0), null, EstadoReserva.RESERVADA);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		target.borrarListaReservas();
		target = null;
		reserva1 = null;
		reserva2 = null;
		reserva3 = null;	
		reserva4 = null;
		
	}

	@Test	
	@DisplayName("Registrar una reserva sin acompañante")	
	void registrarReservaSinAcompanianteTest() {
		//Verifica que el acompaniante sea nulo
		assertNull(reserva1.getAcompaniante());
		//Verifica que la lista este vacia
		assertTrue(target.getlistaReservas().isEmpty());
		//Se agrega una reserva a la lista
		target.registrarReservaSA(reserva1);
		//verifica si la lista esta vacia
		assertFalse(target.getlistaReservas().isEmpty());
		
	}

	@Test	
	@DisplayName("Registrar una reserva con acompañante")	
	void registrarReservaConAcompanianteTest() {
		
		assertNull(reserva2.getAcompaniante());
		assertTrue(target.getlistaReservas().isEmpty());
		target.registrarReservaCA(reserva2,listaPasajeros.getListaPasajeros(5));
		assertTrue(target.getlistaReservas().size()>0);
		assertNotNull(target.buscarReserva(reserva2.getId()).getAcompaniante());
			
	}
	
	@Test	
	@DisplayName("Cancelar una reserva")	
	void cancelarReservaTest() {
		target.registrarReservaSA(reserva3);
		assertFalse(target.buscarReserva(reserva3.getId()).getEstado()==EstadoReserva.CANCELADA);
		target.cancelarReserva(reserva3.getId());
		assertTrue(target.buscarReserva(reserva3.getId()).getEstado()==EstadoReserva.CANCELADA);	
	}
	
	@Test	
	@DisplayName("Pagar una reserva")	
	void pagarReservaTest() {
		target.registrarReservaSA(reserva4);
		assertFalse(target.buscarReserva(reserva4.getId()).getEstado()==EstadoReserva.PAGADA);
		target.pagarReserva(reserva4.getId());
		assertTrue(target.buscarReserva(reserva4.getId()).getEstado()==EstadoReserva.PAGADA);
	}
	
	@Test	
	@DisplayName("Listar una reserva por estado")	
	void listaReservasPorEstadoTest() {
		reserva1.setEstado(EstadoReserva.PAGADA);
		reserva2.setEstado(EstadoReserva.PAGADA);
		reserva3.setEstado(EstadoReserva.PAGADA);
		
		reserva4.setEstado(EstadoReserva.RESERVADA);
		
		assertTrue(target.getlistaReservas().isEmpty());
		target.registrarReservaSA(reserva1);
		target.registrarReservaSA(reserva2);
		target.registrarReservaSA(reserva3);
		target.registrarReservaSA(reserva4);
		assertTrue(target.listaReservasPorEstado("PAGADA").size()==3);
	}
}
