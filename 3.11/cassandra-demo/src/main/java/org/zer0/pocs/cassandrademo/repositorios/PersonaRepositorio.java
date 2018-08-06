package org.zer0.pocs.cassandrademo.repositorios;

import org.springframework.data.repository.reactive.RxJava2CrudRepository;
import org.springframework.stereotype.Repository;
import org.zer0.pocs.cassandrademo.dto.Persona;

@Repository
public interface PersonaRepositorio extends RxJava2CrudRepository<Persona,Integer>{
	
}
