# 🎮 DSList – API de Listagem de Jogos

Projeto desenvolvido em **Java com Spring Boot**, com o objetivo de criar uma **API REST** para gerenciamento e listagem de jogos, organizado por listas personalizadas.

Este projeto foi desenvolvido **individualmente**, durante uma **semana de intensivão de Java Spring do professor Nélio Alves**, com foco em boas práticas, arquitetura em camadas e fundamentos do desenvolvimento backend.

---

## 📌 Objetivo do Projeto

O DSList tem como finalidade permitir:
- Listar jogos cadastrados
- Organizar jogos em listas
- Reordenar jogos dentro de uma lista
- Expor dados através de endpoints REST

O projeto simula um cenário real de backend, sendo ideal para fins de **aprendizado**, **portfólio** e **demonstração de conhecimento em Java Spring**.

---

##  Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **Hibernate**
- **Banco de dados H2 (testes)**
- **PostgreSQL (configurável)**
- **Maven**

---

##  Arquitetura do Projeto

O projeto segue uma **arquitetura em camadas**, separando bem as responsabilidades:

```
controllers  -> Camada de controle (API REST)
services     -> Regras de negócio
repositories -> Acesso a dados (JPA)
entities     -> Entidades do domínio
DTOs         -> Transferência de dados
```

---

##  Funcionalidades Principais

-  Listar todos os jogos
-  Listar jogos por lista
-  Buscar jogo por ID
-  Reordenar jogos dentro de uma lista
-  Retorno de dados otimizado com DTOs e Projections

---

##  Endpoints da API (exemplo)

```http
GET /games
GET /games/{id}
GET /lists
GET /lists/{listId}/games
POST /lists/{listId}/replacement
```

---

##  Como Executar o Projeto

### Pré-requisitos
- Java 17+
- Maven

### Passos

```bash
# Clone o repositório
git clone https://github.com/Lenhazada/dslist-JavaSpring.git

# Entre na pasta do projeto
cd dslist-JavaSpring

# Execute o projeto
./mvnw spring-boot:run
```

A aplicação estará disponível em:
```
http://localhost:8080
```

---

##  Banco de Dados

- O projeto utiliza **H2** para ambiente de testes
- Script de carga inicial disponível em `import.sql`
- Configurações em `application.properties`

---

##  Aprendizados com o Projeto

Durante o desenvolvimento, foi possível praticar:

- Estruturação de projetos Spring Boot
- Criação de APIs REST
- Uso de JPA e Hibernate
- DTOs e Projections para otimização
- Relacionamentos entre entidades
- Boas práticas de organização e legibilidade

---

## 👤 Autor

**Gabriel Lenhardt**  
Projeto desenvolvido individualmente para fins de estudo e portfólio.

🔗 LinkedIn: https://www.linkedin.com/in/gabriellenhardt/

🔗 GitHub: https://github.com/Lenhazada

---

