package com.manytomany.repositories;

import com.manytomany.entities.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlunoRepository extends MongoRepository<Aluno, String> {

}
