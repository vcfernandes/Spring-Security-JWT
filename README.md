# Spring Security JWT

Este projeto demonstra um exemplo de autenticação e autorização com **Spring Security** e **JWT (JSON Web Token)** para proteger APIs REST.

Baseado no tutorial de Giuliana Bezerra:
*   **Repositório Original:** [giuliana-bezerra/spring-security-jwt](https://github.com/giuliana-bezerra/spring-security-jwt)
*   **Vídeo do Tutorial:** [Como Fazer Autenticação e Autorização com Spring Security e JWT](https://www.youtube.com/watch?v=kEJ8a1w4a2Q)

### Tecnologias Principais

*   **Spring Boot**
*   **Spring Security**
*   **JWT**
*   **H2** (Banco de dados em memória)

## Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/vcfernandes/Spring-Security-JWT.git
    cd Spring-Security-JWT
    ```

2.  **Construa e execute a aplicação:**
    ```bash
    ./mvnw clean package
    java -jar ./target/spring-security-jwt-0.0.1-SNAPSHOT.jar
    ```
    A aplicação estará disponível na porta `8080`.

## Como Testar a API

Para testar os endpoints, recomendamos a ferramenta de linha de comando [HTTPie](https://httpie.io/).

1.  **Instale o HTTPie** (se ainda não tiver):
    ```bash
    choco install httpie # No Windows com Chocolatey
    # Ou use outro gerenciador de pacotes para sua OS
    ```
2. **Testar** :
    ```bash
    
    http -a username:password POST :8080/authenticate
    
    JWT = <token>
    
    http :8080/private -A bearer -a ${JWT}
    ```
