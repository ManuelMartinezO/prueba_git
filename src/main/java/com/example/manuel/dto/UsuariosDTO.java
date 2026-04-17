package com.example.manuel.dto;

public class UsuariosDTO {
    private Long id;
    private String nombre;

    public UsuariosDTO() {}
    public UsuariosDTO(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return this.id;
    }
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
