package com.cadastro_usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro_usuario.model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email); // Método que retorna um Optional<Usuario>
}
