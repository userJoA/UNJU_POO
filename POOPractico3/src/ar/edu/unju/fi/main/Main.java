package ar.edu.unju.fi.main;

import ar.edu.unju.fi.manager.EmpleadoManager;

public class Main {

	public static void main(String[] args) {
		EmpleadoManager.generarEmpleados();
		EmpleadoManager.cambiarSueldoBasico();
		EmpleadoManager.listarEmpleados();

	}

}
