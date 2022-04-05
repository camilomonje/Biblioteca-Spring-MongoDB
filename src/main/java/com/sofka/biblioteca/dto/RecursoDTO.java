package com.sofka.biblioteca.dto;

import com.sofka.biblioteca.utils.Tematica;
import com.sofka.biblioteca.utils.Tipo;

import java.util.Objects;

public class RecursoDTO {

    private String id;
    private String nombre;
    private Tipo tipoRecurso;
    private Tematica tematica;
    private Boolean prestamo = false;
    private String fechaPrestamo;

    public RecursoDTO() {
    }

    public RecursoDTO(String id, String nombre, Tipo tipoRecurso, Tematica tematica, Boolean prestamo, String fechaPrestamo) {
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
        return "RecursoDTO{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipoRecurso=" + tipoRecurso +
                ", tematica=" + tematica +
                ", prestamo=" + prestamo +
                ", fechaPrestamo='" + fechaPrestamo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecursoDTO that = (RecursoDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre) && tipoRecurso == that.tipoRecurso && tematica == that.tematica && Objects.equals(prestamo, that.prestamo) && Objects.equals(fechaPrestamo, that.fechaPrestamo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, tipoRecurso, tematica, prestamo, fechaPrestamo);
    }
}

