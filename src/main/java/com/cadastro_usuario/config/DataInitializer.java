package com.cadastro_usuario.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.cadastro_usuario.model.Usuario;
import com.cadastro_usuario.repository.UsuarioRepository;

@Component
public class DataInitializer implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        // Verificar se o usuário admin já existe
        if (!usuarioRepository.findByEmail("admin@admin.com").isPresent()) {
            Usuario usuario = new Usuario();
            usuario.setNome("admin");
            usuario.setEmail("admin@admin.com");
            usuario.setSenha("senha123");
            try {
				usuarioRepository.save(usuario);
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
    }
}
