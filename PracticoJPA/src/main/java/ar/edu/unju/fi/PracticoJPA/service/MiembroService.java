package ar.edu.unju.fi.PracticoJPA.service;


import java.util.Optional;

import ar.edu.unju.fi.PracticoJPA.entity.Miembro;


public interface MiembroService {
	
	public void crearMiembro(Miembro miembro);
	
	public void modificarMiembro(Miembro miembro);
	
	public void eliminarMiembro(Long id);
	
	public Optional<Miembro> buscarMiembroPorId(Long id);
	
}
