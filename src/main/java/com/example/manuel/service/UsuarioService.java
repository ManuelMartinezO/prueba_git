package com.example.manuel.service;

import com.example.manuel.dto.UsuariosDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UsuarioService {

    List<UsuariosDTO> listaUsaurios = new ArrayList<>();
    AtomicLong generarId = new AtomicLong(1);

    public UsuarioService() {
        listaUsaurios.add(
                new UsuariosDTO(
                        generarId.getAndIncrement(),
                        "manuel"
                )
        );
        listaUsaurios.add(
                new UsuariosDTO(
                        generarId.getAndIncrement(),
                        "juan"
                )
        );
    }

    public List<UsuariosDTO> obtenerTodosLosUsuarios() {
        return listaUsaurios;
    }

    public UsuariosDTO obtenerUsuario(Long id) {
        UsuariosDTO usuario = listaUsaurios.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);
        return usuario;
    }

    public UsuariosDTO crearUsuario(UsuariosDTO nuevo) {
        listaUsaurios.add(nuevo);
        return nuevo;
    }

    public UsuariosDTO editar(Long id, UsuariosDTO nuevo) {
        UsuariosDTO usuario = obtenerUsuario(id);
        usuario.setNombre(nuevo.getNombre());
        usuario.setId(nuevo.getId());
        return nuevo;
    }

    public UsuariosDTO eliminar(Long id) {
        UsuariosDTO usuario = obtenerUsuario(id);
        listaUsaurios.remove(usuario);
        return usuario;
    }
}
