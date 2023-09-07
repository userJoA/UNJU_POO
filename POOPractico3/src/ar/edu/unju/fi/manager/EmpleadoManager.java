package ar.edu.unju.fi.manager;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import ar.edu.unju.fi.domain.Administrativo;
import ar.edu.unju.fi.domain.Empleado;
import ar.edu.unju.fi.domain.Profesional;
import ar.edu.unju.fi.util.Constantes;

public class EmpleadoManager {
	private static List<Empleado> LISTA_EMPLEADOS=new ArrayList<Empleado>();
	
	
	//PUNTO 2 GENERAR EMPLEADOS
	public static void generarEmpleados() {
		
		Administrativo a1= new Administrativo(45, "selena martinez", 6, 2, LocalDate.of(1992, 8, 23), 2);
		Administrativo a2= new Administrativo(47, "esteban morales", 2, 0,LocalDate.of(1988, 1, 3) , 1);
		Administrativo a3= new Administrativo(5, "mariana Ramirez", 10, 2,LocalDate.of(1975, 8, 23) , 5);
		Administrativo a4= new Administrativo(50, "eusebio gonzales", 1, 3,LocalDate.of(1999, 7, 10) , 1);
		Administrativo a5= new Administrativo(15, "mario flores", 7, 2,LocalDate.of(1990, 12, 2) , 4);
		
		Profesional p1= new Profesional(74, "mauricio nuñez", 10, 2,LocalDate.of(1981, 4, 7));
		Profesional p2= new Profesional(46, "norma estevez", 5, 4,LocalDate.of(1995, 11, 21));
		Profesional p3= new Profesional(124, "gustavo valdez", 15, 1, LocalDate.of(1993, 8, 3));
		Profesional p4= new Profesional(23, "julia quiñones", 3, 0, LocalDate.of(2000, 11, 4));
		Profesional p5= new Profesional(96, "julia goldstad", 7, 5, LocalDate.of(1989, 8, 23));
		 
		LISTA_EMPLEADOS.add(a5);
		LISTA_EMPLEADOS.add(a4);
		LISTA_EMPLEADOS.add(a3);
		LISTA_EMPLEADOS.add(a2);
		LISTA_EMPLEADOS.add(a1);
		LISTA_EMPLEADOS.add(p5);
		LISTA_EMPLEADOS.add(p4);
		LISTA_EMPLEADOS.add(p3);
		LISTA_EMPLEADOS.add(p2);
		LISTA_EMPLEADOS.add(p1);
		
		 
	}
	
	public static void listarEmpleados(){
		System.out.println("listando empleados: ");
		for(Empleado e:LISTA_EMPLEADOS) {
			System.out.println(e);
		}
	}
	
	//PUNTO 3: LISTAR EMPLEADOS CON ANTIGUEDAD MAYOR A X
	public static void listaEmpleadosPorAntiguedad(Integer anios) {
		System.out.println("\n ************** LISTA EMPLEADOS CON ANTIGUEDAD MAYOR A "+anios+" AÑOS ************** \n");
		double totalremunerativos=0;
		double totalImporteNeto=0;
		double totalDescuentos=0;
		double totalSalarioFamiliar=0;
		
		for(Empleado e:LISTA_EMPLEADOS) {
			if(e.getAntiguedad()>anios) {
				System.out.println("\n Nombre: "+e.getNombre());
				System.out.println(" Antiguedad: "+e.getAntiguedad());
				System.out.println(" Cantidad De Hijos: "+e.getCantidadHijos());
				System.out.println(" Remunerativos Bonificables: $"+e.remunerativosBonificables());
				System.out.println(" Salario Familiar: $"+e.adicionalHijo());
				System.out.println(" Descuentos: $"+e.remunerativosBonificables()*Constantes.getDescuento());
				System.out.println(" Sueldo Neto: "+e.calcularSueldoNeto()+"\n");
				totalremunerativos+=e.remunerativosBonificables();
				totalImporteNeto+=e.calcularSueldoNeto();
				totalDescuentos+=e.remunerativosBonificables()*Constantes.getDescuento();
				totalSalarioFamiliar+=e.adicionalHijo();
			}
		}
		System.out.println("\n TOTAL REMUNERATIVOS: $"+totalremunerativos);
		System.out.println(" TOTAL SALARIO FAMILIAR: $"+totalSalarioFamiliar);
		System.out.println(" TOTAL DESCUENTOS: $"+totalDescuentos);
		System.out.println(" IMPORTE TOTAL NETO: $"+totalImporteNeto+"\n");
	}
	
	//PUNTO 4: LISTAR EMPLEADOS CON EDAD MAYOR O IGUAL A X
	public static void listarEmpleadosPorEdad(Integer edad) {
		System.out.println("\n ************** LISTA EMPLEADOS CON EDAD MAYOR O IGUAL A "+edad+" AÑOS ************** \n");
		for(Empleado e:LISTA_EMPLEADOS) {
			if(e.calcularEdad()>=edad) {
				System.out.println(e);
			}
		}
		System.out.println("\n");
	}
	
	//PUNTO 5: CALCULAR IMPORTE NETO ACUMULADO TOTAL DE EMPLEADOS CON EDAD MAYOR O IGUAL A X
	public static void calcularImporteNetoAcumulado(Integer edad) {
		System.out.println("\n ************** TOTAL IMPORTE NETO DE LOS EMPLEADOS CON EDAD MAYOR O IGUAL A "+edad+" AÑOS ************** \n");
		double importeNetoAcumulado=0;
		
		for(Empleado e:LISTA_EMPLEADOS) {

			if(e.calcularEdad()>=edad) {
				System.out.println("\n Nombre: "+e.getNombre());
				System.out.println(" Edad: "+e.calcularEdad());
				System.out.println(" Sueldo Neto: $"+e.calcularSueldoNeto());
				importeNetoAcumulado+=e.calcularSueldoNeto();
			}
		}
		
		System.out.println("\n IMPORTE NETO ACUMULADO: $"+importeNetoAcumulado+"\n");
	}
	
	//PUNTO 6: INCREMENTAR SALARIO BASICO
	public static void cambiarSalarioBasico(Integer a) {
		System.out.println("\n ****************** AUMENTO DE UN "+Constantes.getAumento()*100+" DEL SALARIO BASICO *****************");
		System.out.println("\n LISTA EMPLEADOS CON ANTIGUEDAD MENOR O IGUAL A "+a+" AÑOS\n");
		for(Empleado e:LISTA_EMPLEADOS) {
			if(e.getAntiguedad()<=a) {
				System.out.println(" Nombre: "+e.getNombre());
				System.out.println(" Antiguedad: "+e.getAntiguedad());
				System.out.println(" Salario basico: $"+e.getSueldoBasico());
				System.out.println(" Salario neto: $"+e.calcularSueldoNeto());
				
				//Aumenta un 10% el salario basico 
				e.setSueldoBasico(Constantes.getSueldoBasico()+Constantes.getSueldoBasico()*Constantes.getAumento());
				System.out.println(" Salario neto con aumento: $"+e.calcularSueldoNeto()+"\n");
			}
		}
	}
}
