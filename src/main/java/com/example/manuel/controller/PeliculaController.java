package com.example.manuel.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.manuel.dto.PeliculaDTO;
import com.example.manuel.service.PeliculaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PeliculaController {

    private PeliculaService peliculaService;
    
    public PeliculaController(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    @GetMapping("/obtener_peliculas")
    public List<PeliculaDTO> obtenerPeliculas() {
        return peliculaService.obtenerPeliculas();
    }

    @PostMapping("/crear")
    public PeliculaDTO crearPelicula(@RequestBody PeliculaDTO nuevo) { 
        return peliculaService.registrar(nuevo);
    }

    @PutMapping("/editar/{id}")
    public PeliculaDTO editarPelicula(@PathVariable Long id,@RequestBody PeliculaDTO actualizado) {
        return peliculaService.editar(id, actualizado);
    }

    @DeleteMapping("/elimara/{id}")
    public PeliculaDTO elimianrPelicual(@PathVariable Long id) {
        return peliculaService.elimianar(id);
    }

    
}
