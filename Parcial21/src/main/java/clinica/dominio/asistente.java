package clinica.dominio;

public class asistente extends Persona{

	private Integer matricula_asistente;

	public asistente(String nombre, int dni, Integer matricula_asistente) {
		super(nombre, dni);
		this.matricula_asistente = matricula_asistente;
	}

	public Integer getMatricula_asistente() {
		return matricula_asistente;
	}

	public void setMatricula_asistente(Integer matricula_asistente) {
		this.matricula_asistente = matricula_asistente;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Matricula Profesional: "+matricula_asistente;
	}
	
	
}
