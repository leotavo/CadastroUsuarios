package com.cadastro_usuario.model;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotBlank(message = "O nome não pode estar vazio.")
    @Size(max = 50, message = "O nome deve ter no máximo 50 caracteres.")
    private String nome;
    
    @Email(message = "E-mail inválido.")
    @NotBlank(message = "O e-mail não pode estar vazio.")
    @Size(max = 50, message = "O e-mail deve ter no máximo 50 caracteres.")
    private String email;
    
    @NotBlank(message = "A senha é obrigatória.")
//    @Size(min = 6, max = 10, message = "A senha deve ter pelo menos 6 caracteres, e no máximo 10 caracteres.")
    private String senha;

    private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    // Getters e Setters
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    
    public void setSenha(String senha) {
        // Valida a senha antes de criptografá-la
        if (senha == null || senha.length() < 6 || senha.length() > 10) {
            throw new IllegalArgumentException("A senha deve ter entre 6 e 10 caracteres.");
        }
        this.senha = encryptPassword(senha); // Criptografa a senha ao definir
    }

    // Método privado para criptografar a senha
    private String encryptPassword(String senha) {
        return passwordEncoder.encode(senha); // Utilize seu PasswordEncoder aqui
    }

    // Método para verificar se a senha corresponde à senha codificada
    public boolean verificarSenha(String senha) {
        return passwordEncoder.matches(senha, this.senha);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Usuario usuario = (Usuario) obj;
        return id == usuario.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }

    @Override
    public String toString() {
        return "Usuario{id=" + id + ", nome='" + nome + "', email='" + email + "'}";
    }
}
