package ar.edu.unju.fi.poo.Practico5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.unju.fi.poo.Practico5.Dominio.ClienteCuentaCorriente;
import ar.edu.unju.fi.poo.Practico5.Dominio.ClienteGC;
import ar.edu.unju.fi.poo.Practico5.Dominio.Compra;
import ar.edu.unju.fi.poo.Practico5.Exception.ModelException;
import ar.edu.unju.fi.poo.Practico5.Exception.ValidacionException;
import ar.edu.unju.fi.poo.Practico5.Manager.ClienteManager;
import ar.edu.unju.fi.poo.Practico5.Util.Localidades;



class ClienteManagerTestCase {
	
	final static Logger LOGGER=Logger.getLogger(ClienteManagerTestCase.class);

	static ClienteManager target;
	static ClienteGC clienteGc1;
	static ClienteGC clienteGc2;
	static ClienteCuentaCorriente clienteCC1;
	static ClienteCuentaCorriente clienteCC2;
	static Compra compra1;
	static Compra compra2;
	static Compra compra3;
	static Compra compra4;
	
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		LOGGER.info("Inicializando Prueba ...\n");
		target=new ClienteManager();
		clienteGc1= new ClienteGC(1324, "name1","email1",452,Localidades.getCiudad(0));
		clienteGc2= new ClienteGC(1324, "name2","email2",453,Localidades.getCiudad(0));
		clienteCC1=new ClienteCuentaCorriente(1238,"name1","email1",222,Localidades.getCiudad(1));
		clienteCC2=new ClienteCuentaCorriente(1239,"name5","email5",422,Localidades.getCiudad(1));
		compra1=new Compra(LocalDate.now(),5000.0);
		compra2=new Compra(LocalDate.now(),3000.0);
		compra3=new Compra(LocalDate.now(),10000.0);
		compra4=new Compra(LocalDate.now(),1000.0);
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		LOGGER.info("Limpiando Variables ...");
		target=null;
		clienteCC1=null;
		clienteCC2=null;
		clienteGc1=null;
		clienteGc2=null;
		compra1=null;
		compra2=null;
		compra3=null;
		compra4=null;
		LOGGER.info("******* Prueba Finalizada *******");
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
		LOGGER.info("Borrando listaClientes....\n");
		target.getListaDeClientes().clear();
	}

	@Test
	@DisplayName("-------- Registro De Cliente ---------") 
	void registrarClienteTest() throws Exception {
		LOGGER.info("Prueba de Registro de Clientes ...\n");
		try {
			target.registrarCliente(clienteCC1);
			target.registrarCliente(clienteCC2);
		}catch (ValidacionException a) {
			// TODO: handle exception
			LOGGER.error("Exception-registrarCliente: "+a.getMessage());
		}finally {
			assertTrue(target.getListaDeClientes().size()==2);
		}
	}
	
	@Test
	@DisplayName("\n--------- Retornar Cantidad De Compras de Un Cliente ----------\n")
	void cantidadDeComprasTest() throws Exception{
		LOGGER.info("Prueba de Cantidad de Compras....\n");
			try {
			target.registrarCliente(clienteCC1);
			target.registrarCliente(clienteGc1);
			target.agregarComprasCliente(clienteCC1.getId(), compra1);
			target.agregarComprasCliente(5, compra2);
			assertTrue(target.mostrarCantidadCompras(clienteCC1.getId())==1 &&
					   target.mostrarCantidadCompras(clienteGc1.getId())==1);
			target.getListaDeClientes().clear();
			}catch (ValidacionException b) {
				LOGGER.error("Exception-cantidadDeCompras: "+b.getMessage());
	
			}
	}
	
	@Test
	@DisplayName("Importe total recaudado de una localidad determinada\n")
	void importeTotalRecaudadoPorLocalidadTest () throws Exception {
			
		LOGGER.info("Prueba de Importe recuadado por localidad...");
			try {
				target.registrarCliente(clienteCC1);
				target.registrarCliente(clienteGc2);
				target.agregarComprasCliente(clienteCC1.getId(), compra1);
				target.agregarComprasCliente(clienteCC1.getId(), compra2);
				target.agregarComprasCliente(clienteGc2.getId(), compra3);
				target.agregarComprasCliente(clienteGc2.getId(), compra4);
			}catch (ValidacionException c) {
				LOGGER.error("Exception-importeTotalRecaudadoPorLocalidad: "+c.getMessage());

			}finally {
				assertTrue(target.importeTotal(Localidades.listaCiudades.get(0))==8800.0 && target.importeTotal(Localidades.getCiudad(1))==8000.0);	
			}
	}
}
