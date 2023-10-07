package ar.edu.unju.fi.PracticoJPA.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ar.edu.unju.fi.PracticoJPA.entity.Libro;
import ar.edu.unju.fi.PracticoJPA.repository.LibroRepository;
import ar.edu.unju.fi.PracticoJPA.service.LibroService;

@Service
public class LibroServiceImp implements LibroService {
	
	LibroRepository repository;

	@Override
	public void crearLibro(Libro libro) {
		repository.save(libro);
	}

	@Override
	public void modificarLibro(Libro libro) {
		repository.save(libro);
	}

	@Override
	public void eliminarLibro(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Libro> buscarLibroPorID(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Libro buscarLibroPorISBN(int isbn) {
		// TODO Auto-generated method stub
		return repository.findByISBN(isbn);
	}

	@Override
	public List<Libro> buscarLibrosPorAutor(String autor) {
		// TODO Auto-generated method stub
		return repository.findByAutor(autor);
	}

	@Override
	public Libro buscarLibroPorTitulo(String titulo) {
		// TODO Auto-generated method stub
		return repository.findByTitulo(titulo);
	}

}
