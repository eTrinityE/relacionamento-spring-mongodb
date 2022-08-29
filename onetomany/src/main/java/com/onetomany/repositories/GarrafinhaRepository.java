package com.onetomany.repositories;

import com.onetomany.entities.Garrafinha;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GarrafinhaRepository extends MongoRepository<Garrafinha, String> {
}
