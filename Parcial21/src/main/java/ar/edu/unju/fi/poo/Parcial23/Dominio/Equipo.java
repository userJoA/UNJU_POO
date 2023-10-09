package ar.edu.unju.fi.poo.Parcial23.Dominio;

public class Equipo {
	private String nEquipo;

	public Equipo(String nEquipo) {
		super();
		this.nEquipo = nEquipo;
	}

	public String getnEquipo() {
		return nEquipo;
	}

	public void setnEquipo(String nEquipo) {
		this.nEquipo = nEquipo;
	}

	@Override
	public String toString() {
		return "Equipo [nEquipo=" + nEquipo + "]";
	}
	
	
}
