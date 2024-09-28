package com.cadastro_usuario.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Retorna a página de login
    }

    @GetMapping("/register")
    public String register() {
        return "register"; // Retorna a página de registro
    }

    @GetMapping("/forgot-password")
    public String forgotPassword() {
        return "forgot-password"; // Retorna a página de recuperação de senha
    }

    @PostMapping("/login")
    public String loginPost(String username, String password, Model model) {
        // Lógica para autenticação do usuário
        return "redirect:/home"; // Redireciona para a página inicial após o login
    }
}
