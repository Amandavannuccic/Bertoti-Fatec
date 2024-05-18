package com.devcursos.userdev.controller;

import java.util.List;
import com.devcursos.userdev.entities.Usuario;
import com.devcursos.userdev.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.devcursos.userdev.repository.UsuarioRepository;



@RestController
@RequestMapping(value = "/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping()
    public List<Usuario> findAll() {
        List<Usuario> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Usuario findById(@PathVariable Long id) {
        Usuario result = repository.findById(id).get();
        return result;
    }

    @PostMapping(value = "/insere")
    public Usuario inserir(@RequestBody Usuario usuario) {
        Usuario result = repository.save(usuario);
        return result;
    }
}
