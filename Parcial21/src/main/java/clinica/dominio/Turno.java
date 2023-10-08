package clinica.dominio;

import java.time.LocalDateTime;

public abstract class Turno {
	private static Integer nextId=0;
	private Integer id;
	private LocalDateTime fInicio;
	private medico Medico;
	private paciente paciente;
	private String tipoAtencion;
	
	
	public Turno(LocalDateTime fInicio, medico medico,paciente paciente,
			String tipoAtencion) {
		super();
		nextId++;
		this.id =nextId;
		this.fInicio = fInicio;
		Medico = medico;
		this.paciente = paciente;
		this.tipoAtencion = tipoAtencion;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public LocalDateTime getfInicio() {
		return fInicio;
	}


	public void setfInicio(LocalDateTime fInicio) {
		this.fInicio = fInicio;
	}


	public medico getMedico() {
		return Medico;
	}


	public void setMedico(medico medico) {
		Medico = medico;
	}


	public paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(paciente paciente) {
		this.paciente = paciente;
	}


	public String getTipoAtencion() {
		return tipoAtencion;
	}


	public void setTipoAtencion(String tipoAtencion) {
		this.tipoAtencion = tipoAtencion;
	}


	@Override
	public String toString() {
		return "Turno [id=" + id + ", fInicio=" + fInicio + ", Medico=" + Medico + ", paciente=" + paciente
				+ ", tipoAtencion=" + tipoAtencion + "]";
	}
	
	

	
}
