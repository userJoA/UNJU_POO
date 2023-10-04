package ar.edu.unju.fi.poo.Parcial21.Dominio;

public class Plan {
	private static Integer nextId=100;
	private Integer id;
	private String nombrePlan;
	private double costeInicial;
	
	public Plan(String nombrePlan, double costeInicial) {
		super();
		nextId++;
		this.id=nextId;
		this.nombrePlan = nombrePlan;
		this.costeInicial = costeInicial;
	}

	public String getNombrePlan() {
		return nombrePlan;
	}

	public void setNombrePlan(String nombrePlan) {
		this.nombrePlan = nombrePlan;
	}

	public double getCosteInicial() {
		return costeInicial;
	}

	public void setCosteInicial(double costeInicial) {
		this.costeInicial = costeInicial;
	}

	@Override
	public String toString() {
		return "Plan [id=" + id + ", nombrePlan=" + nombrePlan + ", costeInicial=" + costeInicial + "]";
	}
	
	
	
}
