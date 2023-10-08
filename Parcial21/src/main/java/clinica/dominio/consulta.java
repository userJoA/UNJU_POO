package clinica.dominio;

import java.time.LocalDateTime;

public class consulta extends Turno{

	private double duracion;

	public consulta(LocalDateTime fInicio, medico medico, paciente paciente,
			double duracion) {
		super(fInicio, medico, paciente,"consulta");
		this.duracion =30;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "duracion: "+duracion;
	}
	
	
}
