package com.sofka.biblioteca.services;

import com.sofka.biblioteca.dto.RecursoDTO;

import java.util.List;

public interface IRecursoService {

    RecursoDTO save(RecursoDTO recursoDTO);
    RecursoDTO findById(String id);
    List<RecursoDTO> findAll();
    void delete(String id);
    RecursoDTO update(RecursoDTO recursoDTO);
    String availability(String nombre);

}
