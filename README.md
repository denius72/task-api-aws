# Task Manager API

API REST feita com Spring Boot pra gerenciar tarefas.  
Usei AWS RDS como banco (MySQL) e AWS S3 pra salvar arquivos enviados nas tarefas.

## Funcionalidades

- CRUD de tarefas (criar, listar, editar, deletar)
- Upload de arquivo pra cada tarefa (imagem, PDF etc)
- Arquivos vão direto pro S3 e a URL fica salva no banco

## Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL (RDS)
- Amazon S3
- Maven
- Lombok

## Endpoints

| Método | Rota                  | Descrição                         |
|--------|-----------------------|-----------------------------------|
| GET    | /tasks                | Lista todas as tarefas            |
| POST   | /tasks                | Cria uma nova tarefa              |
| PUT    | /tasks/{id}           | Atualiza uma tarefa               |
| DELETE | /tasks/{id}           | Deleta uma tarefa                 |
| POST   | /tasks/{id}/upload    | Faz upload de arquivo pra tarefa  |

## Exemplo de tarefa

```json
{
  "title": "Exemplo AWS",
  "description": "Focar em S3 e RDS",
  "dueDate": "2025-06-11",
  "status": "PENDING"
}
