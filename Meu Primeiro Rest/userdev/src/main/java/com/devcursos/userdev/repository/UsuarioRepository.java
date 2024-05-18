package com.devcursos.userdev.repository;

import com.devcursos.userdev.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {



}
