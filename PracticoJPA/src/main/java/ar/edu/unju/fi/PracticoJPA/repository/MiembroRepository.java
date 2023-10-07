package ar.edu.unju.fi.PracticoJPA.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.PracticoJPA.entity.Miembro;

@Repository
public interface MiembroRepository extends CrudRepository<Miembro, Long>{

}
