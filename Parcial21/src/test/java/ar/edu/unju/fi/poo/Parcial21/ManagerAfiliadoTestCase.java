package ar.edu.unju.fi.poo.Parcial21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.poo.Parcial21.Dominio.Afiliado;
import ar.edu.unju.fi.poo.Parcial21.Dominio.PlanB;
import ar.edu.unju.fi.poo.Parcial21.Dominio.PlanP;
import ar.edu.unju.fi.poo.Parcial21.Manager.ManagerAfiliado;

class ManagerAfiliadoTestCase {
	
	static ManagerAfiliado target;
	static Afiliado afiliado1;
	static Afiliado afiliado2;
	static Afiliado afiliado3;
	static Afiliado afiliado4;
	static PlanB pb;
	static PlanP pP;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		target= new ManagerAfiliado();
		pb=new PlanB("PlanBasico",3000.0 , target.MAXIMO_CONSULTAS);
		pP=new PlanP("PlanPremium", 6000.0, target.MAXIMO_CIRUGIAS);
		afiliado1=new Afiliado(235689, "cachorrao", pP);
		afiliado2=new Afiliado(78419, "messi lionel", pP);
		afiliado3=new Afiliado(8781, "santiago bernabeu", pb);
		afiliado4=new Afiliado(11478, "miltrass jhon", pb);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		target=null;
		afiliado1=null;
		afiliado2=null;
		afiliado3=null;
		afiliado4=null;
		pb=null;
		pP=null;
	}

	@BeforeEach
	void setUp() throws Exception {
		target.clearListaAfiliados();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void registrarAfiliadosTest() throws Exception {
		try {
			target.registrarAfiliado(afiliado1);
			target.registrarAfiliado(afiliado2);
			target.registrarAfiliado(afiliado3);
			target.registrarAfiliado(afiliado4);
			assertTrue(target.getListaAfiliados().size()==4);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	@Test
	void cantidadAfiliadosTest() throws Exception {
			target.registrarAfiliado(afiliado1);
			target.registrarAfiliado(afiliado2);
			target.registrarAfiliado(afiliado3);
			target.registrarAfiliado(afiliado4);
			assertTrue(target.cantidadAfiliados("PlanBasico")==2);
			assertTrue(target.cantidadAfiliados("PlanPremium")==2);
	}
	
	@Test
	void importeTotalTest() throws Exception {
			target.registrarAfiliado(afiliado1);
			target.registrarAfiliado(afiliado2);
			target.registrarAfiliado(afiliado3);
			target.registrarAfiliado(afiliado4);
			assertTrue(target.importeTotal("PlanBasico")==6000.0);
			assertTrue(target.importeTotal("PlanPremium")==12000.0);
	}

}
