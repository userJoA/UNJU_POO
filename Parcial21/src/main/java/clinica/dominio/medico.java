package clinica.dominio;

public class medico extends Persona{
	private Integer matricula_medica;

	public medico(String nombre, int dni, Integer matricula_medica) {
		super(nombre, dni);
		this.matricula_medica = matricula_medica;
	}

	public Integer getMatricula_medica() {
		return matricula_medica;
	}

	public void setMatricula_medica(Integer matricula_medica) {
		this.matricula_medica = matricula_medica;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ " Matricula Medica: " +matricula_medica;
	}

	

	
	
	
}
