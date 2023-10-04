package ar.edu.unju.fi.poo.Parcial21.Dominio;

public class PlanB extends Plan{
	
	private int maximoConsultas;

	public PlanB(String nombrePlan, double costeInicial, int maximoConsultas) {
		super(nombrePlan, costeInicial);
		this.maximoConsultas = maximoConsultas;
	}

	public int getMaximoConsultas() {
		return maximoConsultas;
	}

	public void setMaximoConsultas(int maximoConsultas) {
		this.maximoConsultas = maximoConsultas;
	}

	@Override
	public String toString() {
		return "PlanB [maximoConsultas=" + maximoConsultas + "]";
	}
	
	
	
}
