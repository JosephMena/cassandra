package org.zer0.pocs.cassandrademo.repositorios;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import org.zer0.pocs.cassandrademo.dto.Persona;

@Repository
public interface PersonaRepositorio extends CassandraRepository<Persona,Integer>{

}
