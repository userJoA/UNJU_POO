package ar.edu.unju.fo.poo.POOPractico4.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ar.edu.unju.fo.poo.POOPractico4.Dominio.Pasajero;

public class listaPasajeros {
	private static List<Pasajero> listaPasajero= new ArrayList<Pasajero>(Arrays.asList(
		new Pasajero("Andrea Ema", "Solis", 12233654,4257755,"andreaSolis@gmail.com"),
		new Pasajero("Maria Lorencia", "Alfaro", 40556789,388657815,"mariaAlfaro@gmail.com"),
		new Pasajero("Gustavo Jonatan", "Perez", 34654789,4288755,"gustavoPerez@gmail.com"),
		new Pasajero("Roberto", "Alvarez", 33111654,124567,"robertoPerez@gmail.com"),
		new Pasajero("Emanuel jose", "Solis", 23147654,4255755,"emanuelSolis@gmail.com"),
		new Pasajero("Manuel Alejo", "Diaz", 36111654,1234555,"manuelDiaz@gmail.com"),
		new Pasajero("Andrea Rebecca", "jodorinsky", 43123457,4157755,"andreaJordorinsky@gmail.com"),
		new Pasajero("Juan Nahuel", "Cortez", 41200852,5712755,"juanCortez@gmail.com"),
		new Pasajero("Gimena Silvia", "Huxley", 30333987,135555,"gimenaHuxley@gmail.com")
	  )
	);
	
	public static Pasajero getListaPasajeros(int num){
		return listaPasajero.get(num);
	}
}
