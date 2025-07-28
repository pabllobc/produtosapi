Com certeza\! Com base nos arquivos do projeto `produtosapi`, preparei um README.md completo para descrever e orientar sobre a aplicação.

-----

# Produtos API

API de Produtos é um projeto Spring Boot que fornece uma API RESTful para o gerenciamento de produtos.

## Tecnologias Utilizadas

* **Java 21**
* **Spring Boot 3.2.5**
* **Spring Web:** Para a criação de APIs RESTful.
* **Spring Data JPA:** Para a persistência de dados.
* **H2 Database:** Banco de dados em memória para desenvolvimento e testes.
* **Maven:** Para o gerenciamento de dependências e build do projeto.
* **Lombok:** Para reduzir o código boilerplate.

## Endpoints da API

A API de produtos expõe os seguintes endpoints para manipulação de dados de produtos:

| Método HTTP | Endpoint | Descrição |
| :--- | :--- | :--- |
| `POST` | `/produtos` | Cria um novo produto. |
| `GET` | `/produtos/{id}` | Retorna um produto específico pelo seu ID. |
| `GET` | `/produtos` | Retorna uma lista de produtos, com a possibilidade de filtrar pelo nome. |
| `PUT` | `/produtos/{id}` | Atualiza um produto existente. |
| `DELETE` | `/produtos/{id}` | Deleta um produto. |

### Exemplo de Uso

**Criar um novo produto:**

```bash
curl -X POST \
  http://localhost:8080/produtos \
  -H 'Content-Type: application/json' \
  -d '{
    "nome": "Notebook",
    "descricao": "Notebook de última geração",
    "preco": 5000.00
}'
```

**Obter todos os produtos:**

```bash
curl -X GET http://localhost:8080/produtos
```

## Como Executar a Aplicação

Para executar a aplicação localmente, siga os passos abaixo:

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/pabllobc/produtosapi.git
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd produtosapi
    ```
3.  **Execute a aplicação com o Maven:**
    ```bash
    ./mvnw spring-boot:run
    ```

A aplicação estará disponível em `http://localhost:8080`.

## Banco de Dados

A aplicação utiliza um banco de dados H2 em memória. A estrutura da tabela de produtos é a seguinte:

| Coluna | Tipo | Descrição |
| :--- | :--- | :--- |
| `id` | `varchar(255)` | Chave primária |
| `nome` | `varchar(50)` | Nome do produto |
| `descricao` | `varchar(300)`| Descrição do produto |
| `preco` | `numeric(18, 2)`| Preço do produto |

O console do H2 pode ser acessado em `http://localhost:8080/h2-console` com as seguintes credenciais:

* **JDBC URL:** `jdbc:h2:mem:produtos`
* **Username:** `sa`
* **Password:** `p`