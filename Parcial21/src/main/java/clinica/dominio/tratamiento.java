package clinica.dominio;

import java.time.LocalDateTime;
import java.util.List;

public class tratamiento extends Turno{
	private Integer duracion;
	private List<asistente> asistentes;
	
	
	public tratamiento(LocalDateTime fInicio, medico medico, clinica.dominio.paciente paciente,
			Integer duracion, List<asistente> asistentes) {
		super(fInicio, medico, paciente, "tratamiento");
		this.duracion = 60;
		this.asistentes = null;
	}
	
	

	
}
