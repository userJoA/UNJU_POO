package ar.edu.unju.fi.poo.Practico5.Manager;

import java.util.ArrayList;
import org.apache.log4j.Logger;
import ar.edu.unju.fi.poo.Practico5.Dominio.Cliente;
import ar.edu.unju.fi.poo.Practico5.Exception.ModelException;




public class ClienteManager {
	final static Logger lOGGER = Logger.getLogger(ClienteManager.class);
	private static ArrayList<Cliente> listaClientes = new ArrayList<>();
	
	
	public static void registrarCliente(Cliente cliente) throws ModelException {
		for(Cliente c :listaClientes) {
			if(c.getEmail().equals(cliente.getEmail()) || c.getDni()==cliente.getDni()){
				throw new ModelException("Correo o dni repetido");
			}
		}
		
		listaClientes.add(cliente);
		lOGGER.info("Se agrego al cliente "+cliente.getNombre());
	}
}
