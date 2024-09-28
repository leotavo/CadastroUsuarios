package com.cadastro_usuario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cadastro_usuario.model.Usuario;
import com.cadastro_usuario.repository.UsuarioRepository;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario salvarUsuario(Usuario usuario) {
        // Log para verificar os dados antes de salvar
        System.out.println("Salvando usuário: " + usuario.getNome() + ", Email: " + usuario.getEmail());
        
        return usuarioRepository.save(usuario);
    }
}
