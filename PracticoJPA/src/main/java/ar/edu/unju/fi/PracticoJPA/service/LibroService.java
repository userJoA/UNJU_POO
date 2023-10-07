package ar.edu.unju.fi.PracticoJPA.service;

import java.util.List;
import java.util.Optional;

import ar.edu.unju.fi.PracticoJPA.entity.Libro;

public interface LibroService {
	
	public void crearLibro(Libro libro);
	
	public void modificarLibro(Libro libro);
	
	public void eliminarLibro(Long id);
	
	public Optional<Libro> buscarLibroPorID(Long id);
	
	public Libro buscarLibroPorTitulo(String titulo);
	
	public Libro buscarLibroPorISBN(int isbn);
	
	public List<Libro> buscarLibrosPorAutor(String autor);
	
}
