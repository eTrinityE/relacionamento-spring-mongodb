package com.manytomany.repositories;

import com.manytomany.entities.Materia;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MateriaRepository extends MongoRepository<Materia, String> {
}
