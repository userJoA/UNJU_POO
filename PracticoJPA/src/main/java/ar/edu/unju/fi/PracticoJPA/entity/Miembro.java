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
public class Miembro {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "nombre")
    private String nombre;

    @Column(name = "Nro Miembro")
    private int nro_miembro;

    @Column(name = "email")
    private String email;
    
    @Column(name = "Nro Telefono")
    private int nro_telefono;

	@Override
	public String toString() {
		return "Miembro [id=" + id + ", nombre=" + nombre + ", nro_miembro=" + nro_miembro + ", email=" + email
				+ ", nro_telefono=" + nro_telefono + "]";
	}
    
    
}
