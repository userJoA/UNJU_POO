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
		EmpleadoManager.listarEmpleadosPorEdad(40);
		
		//CALCULAR IMPORTE NETO ACUMULADO POR EDAD
		EmpleadoManager.calcularImporteNetoAcumulado(40);
		
		//AUMENTAR EL SALARIO BASICO DE LOS EMPLEADOS CON ANTIGUEDAD MENOR O IGUAL A 2 AÑOS
		EmpleadoManager.cambiarSalarioBasico(2);
	}

}
