package ar.edu.unju.fi.main;

import ar.edu.unju.fi.manager.EmpleadoManager;

public class Main {

	public static void main(String[] args) {
		
		//agregar Empleados
		EmpleadoManager.generarEmpleados();
		//descomentar para ver los empleados generados
		//EmpleadoManager.listarEmpleados();
		
		//listar empleados por X años de Antiguedad
		EmpleadoManager.listaEmpleadosPorAntiguedad(5);

		//LISTAR EMPLEADOS POR EDAD
		EmpleadoManager.listarEmpleadosPorEdad(25);
	}

}
