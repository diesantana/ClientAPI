# ClientAPI

## Sobre o Projeto
ClientAPI é uma API REST com Spring Boot que fornece um CRUD completo para gerenciar um recurso de clientes. Este projeto utiliza o Spring Data JPA para a persistência de dados, facilitando as operações de banco de dados com o H2 Database.

## Funcionalidades
- **Busca Paginada de Recursos**: Permite a busca paginada de clientes na base de dados.
- **Busca de Recurso por ID**: Facilita a busca de clientes utilizando seu ID único.
- **Inserir Novo Recurso**: Possibilita a inserção de novos clientes no banco de dados.
- **Atualizar Recurso**: Permite a atualização dos dados de clientes existentes.
- **Deletar Recurso**: Habilita a exclusão de clientes da base de dados.

## Validações e Tratamento de Exceções
O projeto inclui validações significativas para garantir a integridade dos dados dos clientes

## Tecnologias Utilizadas
- **Spring Boot**: Para a criação de web services RESTful.
- **Spring Data JPA**: Para a persistência de dados e acesso ao banco de dados.
- **H2 Database**: Como banco de dados para ambiente de testes.
- **Maven**: Para gerenciamento de dependências.
- **Java**: Como linguagem de programação.

## Modelo de Dados
Um cliente possui as seguintes propriedades:
- Nome
- CPF
- Renda
- Data de Nascimento
- Quantidade de Filhos

## Como Executar
Para executar o projeto localmente, siga estas etapas:
1. Clone o repositório para sua máquina local.
2. Abra o projeto em sua IDE preferida.
3. Configure o banco de dados H2 para testes.
4. Execute o projeto através da classe principal que contém o método `main`.


## Licença
Distribuído sob a licença MIT. Veja `LICENSE` para mais informações.

## Contato
Diego Alves Santana - [3c.santana@gmail.com](mailto:3c.santana@gmail.com)
