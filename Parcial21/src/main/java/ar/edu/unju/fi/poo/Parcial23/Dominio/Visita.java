package ar.edu.unju.fi.poo.Parcial23.Dominio;

import java.time.LocalDateTime;

public class Visita {
	private static Integer nextId=0;
	private Integer id;
	private String tipoServicio;
	private Fabrica fabrica;
	private Tecnico tecnico;
	private LocalDateTime fechaHoraInicial;
	private LocalDateTime fechaHoraFinal;
	private int horas;
	private String DescripcionServicio;
	private Equipo equipo;
	private String estado;
	
	
	public Visita() {
		super();
	}


	public Visita(String tipoServicio, Fabrica fabrica, Tecnico tecnico, LocalDateTime fechaHoraInicial,
			LocalDateTime fechaHoraFinal, int horas, String descripcionServicio, Equipo equipo, String estado) {
		super();
		this.id = id;
		this.tipoServicio = tipoServicio;
		this.fabrica = fabrica;
		this.tecnico = tecnico;
		this.fechaHoraInicial = fechaHoraInicial;
		this.fechaHoraFinal = fechaHoraFinal;
		this.horas = horas;
		DescripcionServicio = descripcionServicio;
		this.equipo = equipo;
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


	public Fabrica getFabrica() {
		return fabrica;
	}


	public void setFabrica(Fabrica fabrica) {
		this.fabrica = fabrica;
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


	public Equipo getEquipo() {
		return equipo;
	}


	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "Visita [id=" + id + ", tipoServicio=" + tipoServicio + ", fabrica=" + fabrica + ", tecnico=" + tecnico
				+ ", fechaHoraInicial=" + fechaHoraInicial + ", fechaHoraFinal=" + fechaHoraFinal + ", horas=" + horas
				+ ", DescripcionServicio=" + DescripcionServicio + ", equipo=" + equipo + ", estado=" + estado + "]";
	}
	
	
	
	
}
