package com.onetoone.repositories;

import com.onetoone.entities.Pessoa;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PessoaRepository extends MongoRepository<Pessoa, String> {
    //Query customizadas aqui
}
