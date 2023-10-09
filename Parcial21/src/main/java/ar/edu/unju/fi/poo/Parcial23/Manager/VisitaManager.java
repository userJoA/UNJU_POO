package ar.edu.unju.fi.poo.Parcial23.Manager;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.poo.Parcial21.Exception.ModelException;
import ar.edu.unju.fi.poo.Parcial23.Dominio.Tecnico;
import ar.edu.unju.fi.poo.Parcial23.Dominio.Visita;

public class VisitaManager {
	private static List<Visita> listaVisitas= new ArrayList<Visita>();
	public static List<Tecnico> listaTecnicos= new ArrayList<Tecnico>();
	
	public static List<Visita> getListaVisita(){
		return listaVisitas;
	}
	
	public static Visita buscarVisita(Integer idVisita) {
		Visita vAux=new Visita();
		for(Visita v:listaVisitas) {
			if(v.getId()==idVisita) {
				vAux=v;
			}
		}
		return vAux;
	}
	/*public static void generarVisitas() {
		Tecnico t1=new Tecnico("Matias Name", "Asigado");
		Tecnico t2=new Tecnico("Omar Estrada", "Asigado");
		Tecnico t3=new Tecnico("Federico salgado", "Asigado");
		Tecnico t4=new Tecnico("Nicanor Vega", "Asigado");
		Tecnico t5=new Tecnico("Victor Fernandez", "Asigado");
		Tecnico t6=new Tecnico("Ignacio Salcedo", "Asigado");
		
		listaTecnicos.add(t1);
		listaTecnicos.add(t2);
		listaTecnicos.add(t3);
		listaTecnicos.add(t4);
		listaTecnicos.add(t5);
		listaTecnicos.add(t6);
		
		Visita v1=new Visita("Reparacion", "Otito", t1, LocalDateTime.of(2023, 10, 5, 15, 0),LocalDateTime.of(2023, 10, 5, 16, 0),1, "Descripcion", "Dispositivo","Asignado");
		Visita v2=new Visita("Reparacion", "manzana", t1, LocalDateTime.of(2023, 10, 5, 15, 0),LocalDateTime.of(2023, 10, 7, 16, 0),1, "Descripcion", "Dispositivo","Asignado");
		Visita v3=new Visita("Reparacion", "ova", t1, LocalDateTime.of(2023, 10, 6, 15, 0),LocalDateTime.of(2023, 10, 8, 16, 0),1, "Descripcion", "Dispositivo","Asignado");
		Visita v4=new Visita("Reparacion", "Otito", t3, LocalDateTime.of(2023, 10, 7, 15, 0),LocalDateTime.of(2023, 10, 7, 16, 0),1, "Descripcion", "Dispositivo","Asignado");
		Visita v5=new Visita("Reparacion", "Otito", t4, LocalDateTime.of(2023, 10, 8, 15, 0),LocalDateTime.of(2023, 10, 8, 16, 0),1, "Descripcion", "Dispositivo","Asignado");
		Visita v6=new Visita("Reparacion", "Otito", t5, LocalDateTime.of(2023, 10, 9, 15, 0),LocalDateTime.of(2023, 10, 9, 16, 0),1, "Descripcion", "Dispositivo","Asignado");
		
		listaVisitas.add(v6);
		listaVisitas.add(v5);
		listaVisitas.add(v4);
		listaVisitas.add(v3);
		listaVisitas.add(v2);
		listaVisitas.add(v1);
	}
	*/
	/*public static List<Visita> visitaPorFecha(LocalDateTime f1, LocalDateTime f2){
		List<Visita> listAux=new ArrayList<Visita>();
		for(Visita v:listaVisitas) {
			if(v.getFechaHoraInicial().isAfter(f1) && v.getFechaHoraInicial().isBefore(f2)) {
				listAux.add(v);
			}
		}
		return listAux;
	}*/
	public static boolean validarFecha(LocalDateTime fInicial,LocalDateTime fFinal) {
		if(fInicial.isAfter(fFinal)) {
			return false;
		}else
			return true;
	}
	
	public static boolean validarTecnico(Tecnico t,LocalDateTime fInicial,LocalDateTime fFinal) {
		for(Visita v:listaVisitas) {
			if(v.getFechaHoraInicial().equals(fInicial)&& v.getFechaHoraFinal().equals(fFinal)) {
				if(v.getTecnico().getId()==t.getId()) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void registrarVisita(Visita visita) throws Exception{
		if(!validarTecnico(visita.getTecnico(),visita.getFechaHoraInicial(),visita.getFechaHoraFinal())) {
			throw new ModelException("El tecnico ya esta asigando a otra visita en la fecha ingresada");
		}
		if(!validarFecha(visita.getFechaHoraInicial(),visita.getFechaHoraFinal())) {
			throw new ModelException("La fecha inicial debe ser anteriori a la fecha final");
		}
		listaVisitas.add(visita);
	}
	
	
	
	public static void visitasPorTecnico(Integer idTecnico,LocalDateTime f1,LocalDateTime f2) {
		
		for(Visita v:listaVisitas) {
			if(v.getFechaHoraFinal().isAfter(f1)&&v.getFechaHoraInicial().isBefore(f2)) {
				if(v.getTecnico().getId()==idTecnico) {
					System.out.println("Nombre de Empresa: "+v.getFabrica().getNombre());
				}
			}
		}
	}
}
