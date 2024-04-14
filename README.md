# ClientAPI 
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/diesantana/ClientAPI/blob/main/LICENSE) 

# Sobre o projeto

ClientAPI é um projeto de desafio feito durante o curso Java Spring Professional da Devsuperior.  

ClientAPI é uma API REST com Spring Boot 3 que fornece um CRUD completo para gerenciar um recurso de clientes. Este projeto utiliza o Spring Data JPA para a persistência de dados, facilitando as operações de banco de dados com o H2 Database.

## Arquitetura
O sistema está arquiteturado no padrão Camadas, onde camada camada possui uma responsabilidade específica. 

O Projeto utiliza o padrão de design DTO para o transporte de dados entre diferentes componentes do sistema. 

![Modelo Conceitual](https://raw.githubusercontent.com/diesantana/assets/main/img/clientAPI/camadas.jpg)


## Modelo conceitual
![Modelo Conceitual](https://raw.githubusercontent.com/diesantana/assets/main/img/clientAPI/Entity%20Client%202.jpg)  
  

# Tecnologias utilizadas
- Java JDK 21
- Spring Boot 3
- Spring Data JPA: Para a persistência de dados e acesso ao banco de dados.
- Maven: Para gerenciamento de dependências.
- H2 Database: Como banco de dados para ambiente de testes.

# Como executar o projeto

Pré-requisitos: JDK 21

```bash
# Clone o repositório
git clone git@github.com:diesantana/ClientAPI.git

# Navegue até o diretório raiz do projeto e execute o fat jar:
java -jar target/ClientAPI-0.0.1-SNAPSHOT.jar
```

**Você também pode baixar o fat jar diretamente deste reposiório, na pasta target.**
- Salve o arquivo `ClientAPI-0.0.1-SNAPSHOT.jar` na pasta desejada.

**Executar o fat jar:**
- Navegue até a pasta onde o fat jar foi baixado.
- Execute o fat jar usando o comando: 
```
java -jar ClientAPI-0.0.1-SNAPSHOT.jar
```
     
## Endpoints

Para testar os endpoints da aplicação, recomenda-se o uso do Postman.

- GET `/clients`: Retorna todos os clientes paginados.
- GET `/clients/{id}`: Retorna um cliente específico pelo ID.
- POST `/clients`: Cria um novo cliente.
- PUT `/clients/{id}`: Atualiza um cliente existente pelo ID.
- DELETE `/clients/{id}`: Deleta um cliente pelo ID.



# Autor
Diego Alves Santana

https://www.linkedin.com/in/die-santana

