package com.sofka.biblioteca.repository;

import com.sofka.biblioteca.collection.Recurso;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IRecursoRepository extends MongoRepository<Recurso, String> {
     List<Recurso> findByNombre(String nombre);
}
