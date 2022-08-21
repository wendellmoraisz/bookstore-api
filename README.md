# Biblioteca API

Backend do desafio fullstack TQI. A API fornece dados dos livros, clientes, vendas e pedidos.

# Tecnologias utilizadas
- [Java](https://www.java.com/pt-BR/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [H2 Database](https://www.h2database.com/html/main.html)

# Observações
Optei por utilizar o H2 Database para facilitar a configuração de quem for testar a api.


# Funcionalidades
  - [x] Cadastrar/Buscar Livros
  - [x] Cadastrar/Buscar Vendas
  - [x] Cadastrar/Buscar Pedidos
  - [x] Cadastrar/Buscar Clientes

# Como rodar

```bash

# clone o repositório
git clone https://github.com/wendellmoraisz/bookstore-api
```
Abra o diretório no seu editor de código e execute o arquivo BookstoreApiApplication.java

# Rotas
### URL Base
http://localhost:8080

### Livros
- `POST` /livros - Cadastra novo livro

  **body** = { title: string, author: string, publishingCompany: string, bookImgSrc: string, publicationYear: int }

  **response** = { ok || error }
  
- `GET` /livros - Busca todos os livros cadastrados
  
  **response** = { [id: int, title: string, author: string, publishingCompany: string, bookImgSrc: string, publicationYear: int] }
  
### Vendas

- `POST` /vendas - Lança nova venda 
 
    **body** = { price: double, client: { id: int }, books: { [{ id: int, quantity: int }] } }
    
    **Response** = { ok || error }
    
- `GET` /vendas - Busca todas as vendas realizadas
  
  **response** = { [{id: int, price: double, client: { id: int, name: string, cpf: string, phoneNumber: number, address: string }, books: { [{ id: int, quantity: int }] }] }
  
### Clientes

- `POST` /clientes - Cadastra cliente
    
    **body** = { name: string, cpf: string, phoneNumber: number, address: string }
    
    **response** = { ok || error }

- `GET` /clientes - Busca todos os clientes cadastrados
  
  **response** = { [{ id: int, name: string, cpf: string, phoneNumber: number, address: string }] }
  
### Pedidos
    
- `POST` /compras - Realiza novo pedido

    **body** = { quantity: int, unityValue: double, book: { id: int } }
 
    **response** = { ok || error }
 
- `GET` /compras - Busca todos os pedidos
    
    **response** = {[{id: int, quantity: int, unityValue: double, book: { id: int, title: string, author: string, publishingCompany: string, bookImgSrc: string, publicationYear: int }}]}
