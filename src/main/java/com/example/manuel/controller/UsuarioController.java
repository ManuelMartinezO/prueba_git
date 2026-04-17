package com.example.manuel.controller;

import com.example.manuel.dto.UsuariosDTO;
import com.example.manuel.service.UsuarioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@Tag(
        name = "USUARIOS",
        description = "descripcion"
)
public class UsuarioController {

    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/todo")
    @Operation(
            summary = "obtener todos los usuarios"
    )
    public List<UsuariosDTO> obtenerTodo() {
        return usuarioService.obtenerTodosLosUsuarios();
    }

    @PostMapping
    @Operation(
            summary = "crear un usuario nuevo"
    )
    public String crearUsuario(@RequestBody UsuariosDTO nuevo) {
        usuarioService.crearUsuario(nuevo);
        return "Mensaje";
    }

    @PutMapping("/editar/{id}")
    public UsuariosDTO editar(@PathVariable Long id, @RequestBody UsuariosDTO nuevo) {
        usuarioService.editar(id, nuevo);
        return nuevo;
    }

    @DeleteMapping("/eliminar/{id}")
    public UsuariosDTO elimar(@PathVariable Long id) {
        return usuarioService.eliminar(id);
    }

}
