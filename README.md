📚 LiterAlura – Catálogo de Livros em Java

Aplicação desenvolvida em Java para busca, armazenamento e consulta de livros utilizando uma API pública.
O projeto permite interação via console, persistência em banco de dados e consultas personalizadas.

🚀 Objetivo

Desenvolver um catálogo de livros com:

Consumo de API REST

Manipulação de dados JSON

Persistência em banco de dados relacional

Consultas SQL

Menu interativo via console

🛠 Tecnologias Utilizadas

Java 17+

HttpClient (requisições HTTP)

Gson (manipulação de JSON)

PostgreSQL (ou H2)

JDBC

Maven

API utilizada:
Gutendex

📂 Estrutura do Projeto
literalura/
│
├── model/
├── service/
├── repository/
├── Menu.java
└── Main.java

Arquitetura organizada em camadas:

Model → Representação das entidades (Book, Author)

Service → Regras de negócio e consumo da API

Repository → Persistência e consultas ao banco

Menu/Main → Interface textual com o usuário

📋 Funcionalidades

O sistema oferece as seguintes opções via console:

Buscar livro pelo título (via API)

Listar livros registrados no banco

Listar autores registrados

Listar autores vivos em determinado ano

Listar livros por idioma

Sair

🗄 Banco de Dados

Exemplo de estrutura utilizada:

CREATE TABLE authors (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    birth_year INT,
    death_year INT
);

CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255),
    language VARCHAR(10),
    download_count INT,
    author_id INT REFERENCES authors(id)
);
🔌 Como Executar o Projeto
1️⃣ Clonar o repositório
git clone https://github.com/SEU_USUARIO/literalura.git
2️⃣ Configurar banco de dados

Criar banco chamado literalura

Executar os scripts SQL de criação das tabelas

Ajustar usuário e senha no arquivo ConnectionFactory.java

3️⃣ Executar

Se estiver usando Maven:

mvn clean install
mvn exec:java

Ou executar diretamente pela IDE.

📌 Aprendizados Aplicados

Consumo de API REST com HttpClient

Desserialização de JSON

Manipulação de objetos complexos

Relacionamento entre entidades

Persistência com JDBC

Separação de responsabilidades

🎯 Possíveis Evoluções

Migrar para Spring Boot

Implementar JPA/Hibernate

Criar API REST

Adicionar testes unitários

Dockerizar aplicação e banco

Deploy em nuvem

👨‍💻 Autor

Marcio Gleide
Engenheiro de Computação# Catal-go-de-livros
