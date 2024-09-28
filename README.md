# Cadastro de Usuários

Este projeto é um sistema de cadastro de usuários desenvolvido utilizando Spring Boot, com autenticação, validação de dados e conexão com o banco de dados PostgreSQL.

## Funcionalidades

- Cadastro de novos usuários.
- Autenticação de usuários com validação de senha. - OK
- Criptografia de senha. - OK
- Interface de login com validação e animações. - OK
- Recuperação de senha.
- Integração com o banco de dados PostgreSQL. - OK

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.0**
- **Spring Security**: Para autenticação e autorização.
- **Thymeleaf**: Para renderização de templates no frontend.
- **PostgreSQL**: Banco de dados utilizado para armazenar os dados dos usuários.
- **Hibernate/JPA**: Para manipulação de dados no banco de dados.
- **Lombok**: Para reduzir o código boilerplate.

## Requisitos

- **JDK 17** ou superior
- **Maven** (para gerenciamento de dependências)
- **PostgreSQL** (instância rodando)

## Como Executar o Projeto

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/leotavo/CadastroUsuarios.git
   cd CadastroUsuarios

2. Configure o banco de dados:

Crie um banco de dados no PostgreSQL ou outro de sua escolha.
Configure as credenciais do banco de dados no arquivo application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

3. Execute o projeto:
No Eclipse/IntelliJ, ou pelo terminal, execute a classe principal CadastroUsuariosApplication.java.

4. Acesse a aplicação:
Abra o navegador e vá para http://localhost:8080.



