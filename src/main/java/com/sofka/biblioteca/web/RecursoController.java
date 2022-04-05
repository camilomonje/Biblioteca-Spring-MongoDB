package com.sofka.biblioteca.web;

import com.sofka.biblioteca.dto.RecursoDTO;
import com.sofka.biblioteca.services.IRecursoService;
import com.sofka.biblioteca.utils.Tematica;
import com.sofka.biblioteca.utils.Tipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biblioteca")
public class RecursoController {

    @Autowired
    IRecursoService service;

    @PostMapping("")
    public ResponseEntity<RecursoDTO> save(@RequestBody RecursoDTO recursoDTO) {
        System.out.println(recursoDTO);
        return new ResponseEntity<RecursoDTO>(service.save(recursoDTO), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecursoDTO> findById(@PathVariable("id") String id){
        return new ResponseEntity<RecursoDTO>(service.findById(id), HttpStatus.OK);
    }

    @GetMapping("")
    public ResponseEntity<List<RecursoDTO>> findAll() {
        return new ResponseEntity<List<RecursoDTO>>(service.findAll(),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") String id){
        try {
            service.delete(id);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("")
    public ResponseEntity<RecursoDTO> update(@RequestBody RecursoDTO recursoDTO){
        if (recursoDTO.getId() != null){
            return new ResponseEntity<RecursoDTO>(service.save(recursoDTO), HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{nombre}/disponibilidad")
    public ResponseEntity<String> availability(@PathVariable("nombre") String nombre){
        return new ResponseEntity<String>(service.availability(nombre), HttpStatus.OK);
    }

    @PutMapping("/{id}/prestamo")
    public ResponseEntity<String> prestar(@PathVariable("id") String id){
        return new ResponseEntity<String >(service.prestar(id), HttpStatus.OK);
    }

    @GetMapping("/{tematica}/{tipo}/recomendar")
    public ResponseEntity<List<RecursoDTO>> recomendar(@PathVariable("tematica") Tematica tematica, @PathVariable("tipo") Tipo tipo){
        return new ResponseEntity<List<RecursoDTO>>(service.recomendar(tematica, tipo), HttpStatus.OK);
    }

    @PutMapping("/{id}/devolucion")
    public ResponseEntity<String> devolverRecurso(@PathVariable("id") String id){
        return new ResponseEntity<String>(service.devolverRecurso(id), HttpStatus.OK);
    }
}
