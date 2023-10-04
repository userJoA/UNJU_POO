package ar.edu.unju.fi.poo.Parcial23.Dominio;

import java.time.LocalDateTime;

public class Visita {
	private static Integer nextId=0;
	private Integer id;
	private String tipoServicio;
	private String Fabrica;
	private Tecnico tecnico;
	private LocalDateTime fechaHoraInicial;
	private LocalDateTime fechaHoraFinal;
	private int horas;
	private String DescripcionServicio;
	private String dispositivo;
	private String estado;
	
	
	public Visita(String tipoServicio, String fabrica, Tecnico tecnico, LocalDateTime fechaHoraInicial,
			LocalDateTime fechaHoraFinal, int horas, String descripcionServicio, String dispositivo, String estado) {
		super();
		nextId++;
		this.id = nextId;
		this.tipoServicio = tipoServicio;
		Fabrica = fabrica;
		this.tecnico = tecnico;
		this.fechaHoraInicial = fechaHoraInicial;
		this.fechaHoraFinal = fechaHoraFinal;
		this.horas = horas;
		DescripcionServicio = descripcionServicio;
		this.dispositivo = dispositivo;
		this.estado = estado;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTipoServicio() {
		return tipoServicio;
	}


	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}


	public String getFabrica() {
		return Fabrica;
	}


	public void setFabrica(String fabrica) {
		Fabrica = fabrica;
	}


	public Tecnico getTecnico() {
		return tecnico;
	}


	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}


	public LocalDateTime getFechaHoraInicial() {
		return fechaHoraInicial;
	}


	public void setFechaHoraInicial(LocalDateTime fechaHoraInicial) {
		this.fechaHoraInicial = fechaHoraInicial;
	}


	public LocalDateTime getFechaHoraFinal() {
		return fechaHoraFinal;
	}


	public void setFechaHoraFinal(LocalDateTime fechaHoraFinal) {
		this.fechaHoraFinal = fechaHoraFinal;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public String getDescripcionServicio() {
		return DescripcionServicio;
	}


	public void setDescripcionServicio(String descripcionServicio) {
		DescripcionServicio = descripcionServicio;
	}


	public String getDispositivo() {
		return dispositivo;
	}


	public void setDispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "\nTecnico [id=" + id + ", tipoServicio=" + tipoServicio + ", Fabrica=" + Fabrica + ", tecnico=" + tecnico
				+ ", fechaHoraInicial=" + fechaHoraInicial + ", fechaHoraFinal=" + fechaHoraFinal + ", horas=" + horas
				+ ", DescripcionServicio=" + DescripcionServicio + ", dispositivo=" + dispositivo + ", estado=" + estado
				+ "]\n";
	}
	
	
}
