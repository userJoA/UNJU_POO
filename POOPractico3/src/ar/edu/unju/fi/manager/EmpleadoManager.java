package ar.edu.unju.fi.manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import ar.edu.unju.fi.domain.Administrativo;
import ar.edu.unju.fi.domain.Empleado;
import ar.edu.unju.fi.util.Constantes;

public class EmpleadoManager {
	private static List<Empleado> LISTA_EMPLEADOS=new ArrayList<Empleado>();
	
	public static void generarEmpleados() {
		Date fec=new Date(92,5,8);
		Administrativo a1= new Administrativo(45, "selena martinez", 6, 2, fec, 2);
		Administrativo a2= new Administrativo(47, "esteban morales", 2, 0, fec, 1);
		Administrativo a3= new Administrativo(5, "mariana Ramirez", 10, 2, fec, 5);
		Administrativo a4= new Administrativo(50, "eusebio gonzales", 1, 3, fec, 1);
		Administrativo a5= new Administrativo(15, "mario flores", 7, 2, fec, 4);
		 
		LISTA_EMPLEADOS.add(a5);
		LISTA_EMPLEADOS.add(a4);
		LISTA_EMPLEADOS.add(a3);
		LISTA_EMPLEADOS.add(a2);
		LISTA_EMPLEADOS.add(a1);
		 
	}
	
	public static void listarEmpleados(){
		System.out.println("listando empleados: ");
		for(Empleado e:LISTA_EMPLEADOS) {
			System.out.println(e);
		}
	}
	
	
	public static void cambiarSueldoBasico() {
		for(Empleado e:LISTA_EMPLEADOS) {
			if(e.getAntiguedad()>5) {
				e.setSueldoBasico(Constantes.getSueldoBasico()+Constantes.getSueldoBasico()*0.1);
			}
		}
	}
	
	
}
