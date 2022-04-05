package com.sofka.biblioteca.mapper;

import com.sofka.biblioteca.collection.Recurso;
import com.sofka.biblioteca.dto.RecursoDTO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Mapper {

    public Recurso fromDTO(RecursoDTO recursoDTO) {
        return new Recurso(
                recursoDTO.getId(),
                recursoDTO.getNombre(),
                recursoDTO.getTipoRecurso(),
                recursoDTO.getTematica(),
                recursoDTO.isPrestamo(),
                recursoDTO.getFechaPrestamo()
        );
    }

    public RecursoDTO fromDoc(Recurso recurso) {
        return new RecursoDTO(
                recurso.getId(),
                recurso.getNombre(),
                recurso.getTipoRecurso(),
                recurso.getTematica(),
                recurso.isPrestamo(),
                recurso.getFechaPrestamo()
        );
    }

    public List<RecursoDTO> fromDocList(List<Recurso> colleccion) {
        if (colleccion == null) {
            return null;
        }
        List<RecursoDTO> list = new ArrayList<>(colleccion.size());
        Iterator lista = colleccion.iterator();

        while (lista.hasNext()) {
            Recurso recurso = (Recurso) lista.next();
            list.add(fromDoc(recurso));
        }
        return list;
    }

}
