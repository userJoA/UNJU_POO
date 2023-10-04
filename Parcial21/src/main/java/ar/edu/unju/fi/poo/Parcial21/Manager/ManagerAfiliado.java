package ar.edu.unju.fi.poo.Parcial21.Manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import ar.edu.unju.fi.poo.Parcial21.Dominio.Afiliado;

public class ManagerAfiliado {
	private static Logger LOG=Logger.getLogger(ManagerAfiliado.class);
	public static final int MAXIMO_CONSULTAS=5;
	public static final int MAXIMO_CIRUGIAS=2;
	
	private static List<Afiliado> listaAfiliados=new ArrayList<Afiliado>();
	
	public List<Afiliado> getListaAfiliados(){
		return listaAfiliados;
	}
	public void clearListaAfiliados() {
		listaAfiliados.clear();
	}
	public void registrarAfiliado(Afiliado afiliado) {
		LOG.info("Id afiliado: "+afiliado.getNumeroLegajo());
		LOG.info("Nombre afiliado: "+afiliado.getNombreAfiliado());
		LOG.info("DNI afilaido: "+afiliado.getDni());
		LOG.info("Tipo de plan: "+afiliado.getPlan().getNombrePlan()+"\n");
		listaAfiliados.add(afiliado);
		
	}
	
	public int cantidadAfiliados(String plan) {
		int cantidadAfiliados=0;
		for(Afiliado a:listaAfiliados) {
			if(a.getPlan().getNombrePlan().equals(plan))
				cantidadAfiliados++;
		}
		
		return cantidadAfiliados;
	}
	
	public int importeTotal(String plan) {
		int importeTotal=0;
		for(Afiliado a:listaAfiliados) {
			if(a.getPlan().getNombrePlan().equals(plan))
				importeTotal+=a.getPlan().getCosteInicial();
		}
		
		return importeTotal;
	}
	
	
}
