package com.example.manuel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.manuel.dto.PeliculaDTO;

@Service
public class PeliculaService {
    
    List<PeliculaDTO> lista = new ArrayList<>();

    public PeliculaService() {
        lista.add(new PeliculaDTO(4, "algo", "juan", "1 hora", "terror", "+12"));
    }

    public List<PeliculaDTO> obtenerPeliculas() {
        return lista;
    }

    public PeliculaDTO obtenerPorId(Long id) {
        return lista.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public PeliculaDTO editar(Long id, PeliculaDTO actualizado) {
        PeliculaDTO pelicula = obtenerPorId(id);
        pelicula.setTitulo(actualizado.getTitulo()); 
        return actualizado;
    }

    public PeliculaDTO registrar(PeliculaDTO nueva) {
        lista.add(nueva);
        return nueva;
    }

    public PeliculaDTO elimianar(Long id) {
        PeliculaDTO pelicula = obtenerPorId(id);
        return pelicula; 
    }

}
