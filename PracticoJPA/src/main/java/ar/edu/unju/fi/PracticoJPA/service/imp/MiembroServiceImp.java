package ar.edu.unju.fi.PracticoJPA.service.imp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.fi.PracticoJPA.entity.Miembro;
import ar.edu.unju.fi.PracticoJPA.repository.MiembroRepository;
import ar.edu.unju.fi.PracticoJPA.service.MiembroService;
@Service
public class MiembroServiceImp implements MiembroService {
	@Autowired
	private MiembroRepository miembroRepository;
	
	@Override
	public void crearMiembro(Miembro miembro) {
		// TODO Auto-generated method stub
		miembroRepository.save(miembro);
	}

	@Override
	public void modificarMiembro(Miembro miembro) {
		// TODO Auto-generated method stub
		miembroRepository.save(miembro);
	}

	@Override
	public void eliminarMiembro(Long id) {
		// TODO Auto-generated method stub
		miembroRepository.deleteById(id);
	}

	@Override
	public Optional<Miembro> buscarMiembroPorId(Long id) {
		// TODO Auto-generated method stub
		return miembroRepository.findById(id);
	}

}
