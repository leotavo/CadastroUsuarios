# Cadastro de Usuários

Este projeto é um sistema de cadastro de usuários desenvolvido utilizando Spring Boot, com autenticação, validação de dados e conexão com o banco de dados PostgreSQL.

## Funcionalidades

- **Cadastro de novos usuários.**
- **Autenticação de usuários com validação de senha.** ✅
- **Criptografia de senha.** ✅
- **Interface de login com validação e animações.** ✅
- **Recuperação de senha.**
- **Integração com o banco de dados PostgreSQL.** ✅

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

3. **Configure o banco de dados**:
   - Crie um banco de dados no PostgreSQL ou em outro banco de sua escolha.
   - Configure as credenciais do banco de dados no arquivo `application.properties` que está localizado no diretório `src/main/resources`:
        ```properties
        spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_banco
        spring.datasource.username=seu_usuario
        spring.datasource.password=sua_senha

   ** Outras configurações importantes no application.properties:

   - **spring.jpa.hibernate.ddl-auto**: Define como o Hibernate deve gerenciar o esquema do banco de dados. Para desenvolvimento, você pode usar `update` para atualizar o esquema automaticamente.
        ```properties
        spring.jpa.hibernate.ddl-auto=update

   - **spring.jpa.show-sql**: Habilita a exibição de consultas SQL no console. Útil para depuração.
        ```properties
        spring.jpa.show-sql=true

   - **spring.thymeleaf.cache**: Desabilita o cache do Thymeleaf em ambiente de desenvolvimento.
        ```properties
        spring.thymeleaf.cache=false

4. **Testando a Aplicação**:
= Após configurar e executar a aplicação, você pode testar as funcionalidades utilizando ferramentas como Postman ou Insomnia. Aqui estão alguns exemplos de como utilizar os endpoints da API:

   3.1 Cadastrar um novo usuário:
      - Endpoint: POST /usuarios/cadastro
         ```Body:
         {
           "nome": "novo_usuario",
           "senha: "senha_secreta",
           "email": "usuario@example.com"
         }

   3.2 Autenticar um usuário:
      - Endpoint: POST /login
         ```Body:
         {
           "email: "usuario@example.com"",
           "senha": "senha_secreta"
         }

   3.3 Recuperar detalhes de um usuário:
      - Endpoint: GET /usuarios/{id}

   3.4 Atualizar informações de um usuário:
      - Endpoint: PUT /usuarios/{id}
         ```Body:
         {
            "nome": "usuario_atualizado",
            "email": "usuario_atualizado@example.com"
            "senha": "nova_senha"
         }

   3.5 Remover um usuário:
      - Endpoint: DELETE /usuarios/{id}


## Contato
Para mais informações ou sugestões, entre em contato:

Nome: Leonardo Trindade
Email: leotavo@gmail.com

