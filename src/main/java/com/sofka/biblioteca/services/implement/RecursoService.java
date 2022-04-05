package com.sofka.biblioteca.services.implement;

import com.sofka.biblioteca.collection.Recurso;
import com.sofka.biblioteca.dto.RecursoDTO;
import com.sofka.biblioteca.mapper.Mapper;
import com.sofka.biblioteca.repository.IRecursoRepository;
import com.sofka.biblioteca.services.IRecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecursoService implements IRecursoService {

    @Autowired
    IRecursoRepository repository;

    Mapper mapper = new Mapper();

    @Override
    public RecursoDTO save(RecursoDTO recursoDTO) {
        Recurso recurso = mapper.fromDTO(recursoDTO);
        return mapper.fromDoc(repository.save(recurso));
    }

    @Override
    public RecursoDTO findById(String id) {
        Recurso recurso = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No se encuentra el recurso"));
        return mapper.fromDoc(recurso);
    }

    @Override
    public List<RecursoDTO> findAll() {
        List<Recurso> recurso = repository.findAll();
        return mapper.fromDocList(recurso);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public RecursoDTO update(RecursoDTO recursoDTO) {
        Recurso recurso = mapper.fromDTO(recursoDTO);
        repository.findById(recurso.getId())
                .orElseThrow(() -> new RuntimeException("No se encuentra el recurso"));
        return mapper.fromDoc(repository.save(recurso));
    }
}
