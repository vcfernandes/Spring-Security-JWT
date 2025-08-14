Projeto feito com o tutorial apresentado no video da Giuliana(https://www.youtube.com/watch?v=kEJ8a1w4a2Q) de como implementar uma autenticação e autorização com Spring Security e JWT.
O Repositório dela: https://github.com/giuliana-bezerra/spring-security-jwt

Tecnologias

    Spring Boot
    Spring MVC
    Spring Security
    Spring Data JDBC
    H2

Como Executar

    Clonar repositório git:

https://github.com/vcfernandes/Spring-Security-JWT

    Construir o projeto:

./mvnw clean package

    Executar:

java -jar ./target/spring-security-jwt-0.0.1-SNAPSHOT.jar

    Testar ( com httppie ):
    
Para instalar o httppie usei o comando : choco install httpie
Em seguida digite no seu terminal:

http -a username:password POST :8080/authenticate
JWT = <token>
http :8080/private -A bearer -a ${JWT}
