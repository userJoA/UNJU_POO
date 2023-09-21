package ar.edu.unju.fi.poo.Practico5.Manager;


import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;
import org.apache.log4j.Logger;

import ar.edu.unju.fi.poo.Practico5.Dominio.Cliente;
import ar.edu.unju.fi.poo.Practico5.Exception.ModelException;




public class ClienteManager {
	final static Logger LOGGER = Logger.getLogger(ClienteManager.class);
	private static ArrayList<Cliente> listaClientes = new ArrayList<>();
	
	/**
	 * 
	 * @param cliente
	 * @return registra un cliente en la lista de clientes solo si su email y dni no se repiten en otro registro de la lista
	 */
	public static void registrarCliente(Cliente cliente) throws ModelException {
		LOGGER.debug("iniciando validacion de datos");
		for(Cliente c :listaClientes) {
			if(c.getEmail().equals(cliente.getEmail()) || c.getDni()==cliente.getDni()){
				throw new ModelException("Correo o dni repetido");
			}
		}
		listaClientes.add(cliente);
		
		LOGGER.info("Se agrego al cliente: "+cliente.getNombre());
		LOGGER.info("Tipo de Cliente: "+ cliente.getTipoCliente());
	}
	
	/**
	 * 
	 * @param cliente
	 * @return el numero de compras asociadas a ese cliente
	 */
	public static int cantidadDeCompras(Cliente cliente) throws ModelException{
		if((cliente)==null) {
			throw new ModelException("Objeto no inicializado");
		}
		
		if(cliente.getListaCompras()==null) {
			throw new ModelException("lista no inicializada");
		}
		
		return cliente.getListaCompras().size();
	}
	
	public static double importeTotal() {
		
		return 0.0;
	}
	
}
