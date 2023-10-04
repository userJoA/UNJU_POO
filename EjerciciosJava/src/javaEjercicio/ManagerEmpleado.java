package javaEjercicio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ManagerEmpleado {
	private static List<Empleado> listaEmpleados=new ArrayList<Empleado>();
	
	public static void generarEmpleados() {
		Empleado e1=new Empleado(100, "mariela jerez", LocalDate.of(2020, 5, 20), 40000.0);
		Empleado e2=new Empleado(50, "Alberto Fernandez", LocalDate.of(2020, 10, 7), 45000.0);
		Empleado e3=new Empleado(20, "Esteban Kirk", LocalDate.of(2015, 5, 4), 100000.0);
		Empleado e4=new Empleado(110, "Juan Morales", LocalDate.of(2023, 8, 5), 30000.0);
		Empleado e5=new Empleado(2017, "Angela Nieva", LocalDate.of(2017, 5, 21), 70000.0);
		
		listaEmpleados.add(e5);
		listaEmpleados.add(e4);
		listaEmpleados.add(e3);
		listaEmpleados.add(e2);
		listaEmpleados.add(e1);
	}
	
	public static List<Empleado> getLisEmpleados(){
		return listaEmpleados;
	}
	
	public static void registrarEmpleado(Empleado empleado) {
		listaEmpleados.add(empleado);
	}
	
	public static void buscarEmpleadosPorRangoSalario(double salarioMin,double salarioMax) {
		for(Empleado e:listaEmpleados) {
			if(e.getSalario()<=salarioMax && e.getSalario()>=salarioMin) {
				System.out.println(e);
			}
		}
	}
	
	public static List<Empleado> listaPorAnio(int year){
		List<Empleado> listaAux=new ArrayList<Empleado>();
		for(Empleado e:listaEmpleados) {
			if(e.getFechaDeingreso().getYear()==year)
				listaAux.add(e);
		}
		return listaAux;
	}
}
