package com.sofka.biblioteca.repository;

import com.sofka.biblioteca.collection.Recurso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IRecursoRepository extends MongoRepository<Recurso, String> {

}
