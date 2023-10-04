package ar.edu.unju.fi.poo.Parcial21.Dominio;

public class PlanP extends Plan{
	private int maximoCirugias;

	public PlanP(String nombrePlan, double costeInicial, int maximoCirugias) {
		super(nombrePlan, costeInicial);
		this.maximoCirugias = maximoCirugias;
	}

	public int getMaximoCirugias() {
		return maximoCirugias;
	}

	public void setMaximoCirugias(int maximoCirugias) {
		this.maximoCirugias = maximoCirugias;
	}

	@Override
	public String toString() {
		return "PlanP [maximoCirugias=" + maximoCirugias + "]";
	}
	
	
	
}
