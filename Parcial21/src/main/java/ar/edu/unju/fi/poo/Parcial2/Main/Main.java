package ar.edu.unju.fi.poo.Parcial2.Main;

import java.time.LocalDateTime;

import ar.edu.unju.fi.poo.Parcial23.Dominio.Tecnico;
import ar.edu.unju.fi.poo.Parcial23.Manager.VisitaManager;

public class Main {

	public static void main(String[] args) {
		//VisitaManager.generarVisitas();
		LocalDateTime a = LocalDateTime.of(2023, 10, 5, 4, 30);
		LocalDateTime b = LocalDateTime.of(2023, 10, 5, 4, 30);
		System.out.println(a.isEqual(b));
		System.out.println(a.isBefore(b));
		System.out.println(a.isAfter(b));
		//Tecnico t1=new Tecnico("Matias Name", "Asigado");
		//VisitaManager.visitasPorTecnico(VisitaManager.listaTecnicos.get(0), LocalDateTime.of(2023, 10, 5, 0, 0),LocalDateTime.of(2023, 10, 8, 0, 0));
		
		
	}

}
