package com.example.manuel.dto;

import java.time.LocalDate;
import java.util.Date;

public class PeliculaDTO {
    private Integer id;
    private String titulo;
    private String director;
    private String duracion;
    private String genero;
    private String clasificacion;

    public PeliculaDTO(Integer id, String titulo, String director, String duracion, String genero, String clasificacion) {
        this.id = id;
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.clasificacion = clasificacion;
    }

    public Integer getId() {
        return this.id;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public String getDirector() {
        return this.director;
    }
    public String getDuracion() {
        return this.duracion;
    }
    public String getGenero() {
        return this.genero;
    }
    public String getClasificacion() {
        return this.clasificacion;
    }

    
    public void setId(Integer id) {
        this.id = id;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    
}
