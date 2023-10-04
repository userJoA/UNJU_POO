package ar.edu.unju.fi.poo.Parcial21;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.poo.Parcial21.Exception.ModelException;
import ar.edu.unju.fi.poo.Parcial21.Manager.ManagerAfiliado;
import ar.edu.unju.fi.poo.Parcial23.Dominio.Tecnico;
import ar.edu.unju.fi.poo.Parcial23.Dominio.Visita;
import ar.edu.unju.fi.poo.Parcial23.Manager.VisitaManager;

class VisitaManagerTestCase {
	static VisitaManager target;
	static Tecnico t;
	static Visita v;
	static Tecnico t1;
	static Visita v1;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		target= new VisitaManager();
		t=new Tecnico("Matias Name", "Asigado");
		t1=new Tecnico("Omar Estrada", "Asigado");
		v=new Visita("Reparacion", "Otito", t1, LocalDateTime.of(2023, 10, 5, 15, 0),LocalDateTime.of(2023, 10, 5, 16, 0),1, "Descripcion", "Dispositivo","Asignado");
		v1=new Visita("Reparacion", "Otito", t1, LocalDateTime.of(2023, 10, 5, 15, 0),LocalDateTime.of(2023, 10, 5, 16, 0),1, "Descripcion", "Dispositivo","Asignado");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		target= null;
		t=null;
		t1=null;
		v=null;
		v1=null;
	}

	@BeforeEach
	void setUp() throws Exception {
		target.getListaVisita().clear();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void registrarVisitaTest() throws Exception {
		
			target.registrarVisita(v);
			target.registrarVisita(v1);
			assertTrue(target.getListaVisita().size()==2);
			
	}

}
