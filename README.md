# Avengers API - LiveCode DIO - Bootcamp Java AI Powered

Desenvolvimento de uma API utilizando SpringBoot + Kotlin com o intuito de cadastro de Vingadores.

## Tecnologias / Frameworks / IDE

- Intellij
- SpringBoot 2.4.4
- Maven
- Kotlin
- SpringData JPA
- PostgreSQL
- Flyway
- Java 8
- Heroku

## Criação do esqueleto do projeto

- https://start.spring.io/

## Definir contrato API

- https://editor.swagger.io/

- Recurso `avenger`
- GET - 200 OK
- GET {id}/detail - 200 OK ou 404 Not Found
- POST - 201 Created ou 400 Bad Request
- PUT {id} - 202 Accepted ou 404 Not Found
- DELETE {id} - 202 Accepted ou 404 Not Found

json

![Descrição da Imagem](https://raw.githubusercontent.com/marcsalexandrborges/avengers.api/main/1.png)

## Design Arquitetural

- Camada de Aplicação (controllers, configs, exception handle, request e response dtos, bean validations)
- Camada de Domínio (modelo avenger, interface repositório, serviço)
- Camada de Infraestrutura (jpa repository, entidade avenger, proxy implementa interface repositorio e utiliza o jpa repositorio para comunicação com banco de dados)
- Testes 

### Flyway (db/migration)

sql

![Descrição da Imagem](https://raw.githubusercontent.com/marcsalexandrborges/avengers.api/main/2.png)

alter table avenger add constraint UK_5r88eemotwgru6k0ilqb2ledh unique (nick);


### Profiles

- application.yaml
- application-dev.yaml
- application-heroku.yaml

yaml

![Descrição da Imagem](https://raw.githubusercontent.com/marcsalexandrborges/avengers.api/main/3.png)


![Descrição da Imagem](https://raw.githubusercontent.com/marcsalexandrborges/avengers.api/main/4.png)

![Descrição da Imagem](https://raw.githubusercontent.com/marcsalexandrborges/avengers.api/main/5.png)


## Docker 

### Environment Config

```sh 
DB_USER=dio.avenger
DB_PASSWORD=dio.avenger
DB_NAME=avengers
```

### YAML (backend-services.yaml)

![Descrição da Imagem](https://raw.githubusercontent.com/marcsalexandrborges/avengers.api/main/6.png)



### Script / Comandos

![Descrição da Imagem](https://raw.githubusercontent.com/marcsalexandrborges/avengers.api/main/8.png)

- Start API 
sh
![Descrição da Imagem](https://raw.githubusercontent.com/marcsalexandrborges/avengers.api/main/8.png) 

## Heroku

- Criar app
- Linkar com Github
- Setar variáveis de ambiente

### Procfile

text

![Descrição da Imagem](https://raw.githubusercontent.com/marcsalexandrborges/avengers.api/main/8.png) 
