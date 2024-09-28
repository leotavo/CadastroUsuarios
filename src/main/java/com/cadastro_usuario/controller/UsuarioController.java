package com.cadastro_usuario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cadastro_usuario.model.Usuario;
import com.cadastro_usuario.service.PasswordService;
import com.cadastro_usuario.service.UsuarioService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    private final UsuarioService usuarioService;
    private final PasswordService passwordService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService, PasswordService passwordService) {
        this.usuarioService = usuarioService;
        this.passwordService = passwordService;
    }

    @GetMapping("/todos") // Endpoint para listar todos os usuários
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        List<Usuario> usuarios = usuarioService.listarUsuarios(); // Chama o serviço para obter a lista
        return ResponseEntity.ok(usuarios); // Retorna a lista com status 200
    }

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@Valid @RequestBody Usuario usuario) {
        Usuario savedUsuario = usuarioService.salvarUsuario(usuario);
        return ResponseEntity.status(201).body(savedUsuario); // Retorna o usuário salvo com status 201
    }
}
