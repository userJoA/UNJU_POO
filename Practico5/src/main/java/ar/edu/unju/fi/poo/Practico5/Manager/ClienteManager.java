package ar.edu.unju.fi.poo.Practico5.Manager;


import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import ar.edu.unju.fi.poo.Practico5.Dominio.Cliente;
import ar.edu.unju.fi.poo.Practico5.Dominio.Compra;
import ar.edu.unju.fi.poo.Practico5.Exception.ModelException;
import ar.edu.unju.fi.poo.Practico5.Exception.ValidacionException;
import ar.edu.unju.fi.poo.Practico5.Util.BeneficiosClientes;
import ar.edu.unju.fi.poo.Practico5.Util.Localidades;


public class ClienteManager {
	final static Logger LOGGER = Logger.getLogger(ClienteManager.class);
	private static ArrayList<Cliente> listaClientes = new ArrayList<>();
	
	public static List<Cliente> getListaDeClientes(){
		return listaClientes;
	}
	
	/**
	 * 
	 * @param cliente
	 * @return registra un cliente en la lista de clientes solo si su email y dni no se repiten en otro registro de la lista
	 */
	public static void registrarCliente(Cliente cliente) throws ValidacionException {
		LOGGER.debug("iniciando validacion de datos");
		for(Cliente c :listaClientes) {
			if(c.getEmail().equals(cliente.getEmail()) || c.getDni()==cliente.getDni()){
				throw new ValidacionException("Correo o dni repetido");
			}	
		}
		listaClientes.add(cliente);
		/*LOGGER.info("Se agrego al cliente: "+cliente.getNombre());
		LOGGER.info("Tipo de Cliente: "+ cliente.getTipoCliente());
		LOGGER.info("Id Cliente: "+cliente.getId());
		LOGGER.info("Cantidad De compras: "+cliente.getListaCompras().size());	*/
	}
	
	public void agregarComprasCliente(Integer id,Compra compra) {	
		for(Cliente c:listaClientes) {
			if(c.getId()==id) {
				LOGGER.info("Agregando 1 compra a: "+ c.getNombre());
				c.registrarCompra(compra);	
			}
		}
	}
	
	/**
	 * 
	 * @param cliente
	 * @return el numero de compras asociadas a ese cliente
	 */
	public static int mostrarCantidadCompras(Integer id) {
			
			for (Cliente p : listaClientes) {
				if (p.getId() == id)
					return p.getListaCompras().size();	
	        }
			
			return 0;
	}
	
	
	
	public static List<Cliente> listaClientePorLocalidad(String localidad){
		List<Cliente> listaClientesDeUnaLocalidad = new ArrayList<Cliente>();
		for(Cliente c : listaClientes) {
			if(c.getLocalidad().equals(localidad)) {
				listaClientesDeUnaLocalidad.add(c);
			}
		}
		return listaClientesDeUnaLocalidad;
	}
	/**
	 * 
	 * @return retorna el importe Total recaudado 
	 */
	public static double importeTotal(String localidad) throws ValidacionException{
		if(localidad == "") {
			throw new ValidacionException("El argumento no puede estar vacio");
		}
	
		List<Cliente> listaClientesDeUnaLocalidad = new ArrayList<Cliente>();
		listaClientesDeUnaLocalidad=listaClientePorLocalidad(localidad);
		double importeTotalRecaudado = 0.0;
		
		for(Cliente cliente:listaClientesDeUnaLocalidad) {
			if(cliente.getTipoCliente().equals("ClienteGrandesCompras")) {
				for(Compra compra : cliente.getListaCompras()) {	
					importeTotalRecaudado = importeTotalRecaudado + (compra.getImporte() - compra.getImporte()*BeneficiosClientes.DESCUENTO) ;
				}
			}
			else {
				for(Compra compra : cliente.getListaCompras()) {
					importeTotalRecaudado = importeTotalRecaudado + compra.getImporte();
				}
			}
		}
			
		return importeTotalRecaudado;
	}
	
}
