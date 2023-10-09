package ar.edu.unju.fi.poo.Parcial21;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.poo.Parcial21.Exception.ModelException;
import ar.edu.unju.fi.poo.Parcial21.Manager.ManagerAfiliado;
import ar.edu.unju.fi.poo.Parcial23.Dominio.Equipo;
import ar.edu.unju.fi.poo.Parcial23.Dominio.Fabrica;
import ar.edu.unju.fi.poo.Parcial23.Dominio.Tecnico;
import ar.edu.unju.fi.poo.Parcial23.Dominio.Visita;
import ar.edu.unju.fi.poo.Parcial23.Manager.VisitaManager;

class VisitaManagerTestCase {
	
	static final Logger LOGGER =Logger.getLogger(VisitaManagerTestCase.class);
	
	static VisitaManager target;
	
	static Fabrica f;
	static Fabrica f2;
	static Equipo e;
	static Equipo e2;
	static Tecnico t;
	static Tecnico t2;
	static Visita v;
	static Visita v2;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	
	}

	@BeforeEach
	void setUp() throws Exception {
		target= new VisitaManager();
		f=new Fabrica("fabrica1", "N JJ W");
		f2=new Fabrica("fabrica1", "N JJ W");
		e=new Equipo("Impresora Industrial");
		e2=new Equipo("Mezcladora Industrial");
		t=new Tecnico("MM", "EE");
		t2=new Tecnico("HH", "EE");
		v=new Visita("ww", f, t, LocalDateTime.of(2023, 10, 10, 10, 30), LocalDateTime.of(2023,10,10, 12, 0), 2,"DDA", e, "reparacion");
		v2=new Visita("QQQE", f2, t, LocalDateTime.of(2023, 10, 10, 10, 30), LocalDateTime.of(2023,10,10, 12, 0), 2,"DDA", e2, "reparacion");	
	}

	@AfterEach
	void tearDown() throws Exception {
		target.getListaVisita().clear();
		target=null;
		f=null;
		f2=null;
		e=null;
		e2=null;
		t=null;
		t2=null;
		v=null;
		v2=null;	
	}

	@Test
	void registrarVisitaTest() throws Exception {
		assertTrue(target.validarFecha(v.getFechaHoraInicial(),v.getFechaHoraFinal()));
		assertTrue(target.validarTecnico(v.getTecnico(), v.getFechaHoraInicial(),v.getFechaHoraInicial()));
		target.registrarVisita(v);
		assertTrue(target.getListaVisita().size()==1);
		assertNotNull(target.buscarVisita(v.getId()));
	}

	@Test
	void registrarVisitaTestModelException() throws Exception {
		try {
			target.registrarVisita(v);
			assertTrue(target.validarFecha(v2.getFechaHoraInicial(),v2.getFechaHoraFinal()));
			assertFalse(target.validarTecnico(v2.getTecnico(), v2.getFechaHoraInicial(),v2.getFechaHoraFinal()));
			assertThrows(ModelException.class,()->target.registrarVisita(v2));
		}catch (ModelException e) {
			LOGGER.info("ERROR-C: "+e.getMessage());
		}
	}
}
