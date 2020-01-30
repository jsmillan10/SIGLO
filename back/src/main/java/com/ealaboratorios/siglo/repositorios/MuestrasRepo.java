package com.ealaboratorios.siglo.repositorios;

import com.ealaboratorios.siglo.modelos.Muestra;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MuestrasRepo extends MongoRepository<Muestra, String> {
}
