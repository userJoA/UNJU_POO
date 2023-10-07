package ar.edu.unju.fi.PracticoJPA.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Libro {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "autor")
    private String autor;

    @Column(name = "ISBN")
    private int ISBN;
    
    @Column(name = "cantidad")
    private int cantidad;
    
    

	public Libro(String titulo, String autor, int iSBN, int cantidad) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
		this.cantidad = cantidad;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public int getISBN() {
		return ISBN;
	}



	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", cantidad="
				+ cantidad + "]";
	}

   

}
