package com.sofka.biblioteca.collection;

import com.sofka.biblioteca.utils.Tematica;
import com.sofka.biblioteca.utils.Tipo;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.UUID;

@Document(collection = "recursos")
public class Recurso {

    @Id
    private String id = UUID.randomUUID().toString().substring(0, 10);
    private String nombre;
    private Tipo tipoRecurso;
    private Tematica tematica;
    private Boolean prestamo;
    private String fechaPrestamo;

    public Recurso() {
        this.prestamo = false;
    }

    public Recurso(String id, String nombre, Tipo tipoRecurso, Tematica tematica, Boolean prestamo, String fechaPrestamo) {
        this.id = id;
        this.nombre = nombre;
        this.tipoRecurso = tipoRecurso;
        this.tematica = tematica;
        this.prestamo = prestamo;
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(Tipo tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }

    public Boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Boolean prestamo) {
        this.prestamo = prestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Override
    public String toString() {
        return "Recurso{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipoRecurso=" + tipoRecurso +
                ", tematica=" + tematica +
                ", prestamo=" + prestamo +
                ", fechaPrestamo='" + fechaPrestamo + '\'' +
                '}';
    }
}
