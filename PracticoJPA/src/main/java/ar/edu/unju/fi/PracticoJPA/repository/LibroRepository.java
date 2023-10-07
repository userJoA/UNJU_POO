package ar.edu.unju.fi.PracticoJPA.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.PracticoJPA.entity.Libro;

@Repository
public interface LibroRepository  extends CrudRepository<Libro, Long>{
	Libro findByISBN(int ISBN);
	
	Libro findByTitulo(String titulo);
	
	List<Libro> findByAutor(String autor);
}
