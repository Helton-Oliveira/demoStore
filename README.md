# DemoStoreApplication: E-Commerce Java Project

O **DemoStoreApplication** é um projeto de e-commerce em Java que utiliza a API do **FakeStore** como fonte de dados. O projeto é gerenciado pelo **Maven** para lidar com as dependências e utiliza o **Spring Framework**. Embora não tenha serviços web ou conexão com banco de dados no momento, ele oferece um fluxo de funcionalidades intuitivo para os usuários.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

```plaintext
DemoStoreApplication/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.example.demostore/
│   │   │   │   ├── database/
│   │   │   │   │   ├── models/
│   │   │   │   │   │   ├── User.java
│   │   │   │   │   │   └── Product.java
│   │   │   │   │   ├── dao/
│   │   │   │   │   │   ├── UserRepository.java
│   │   │   │   │   │   └── ProductRepository.java
│   │   │   │   ├── dtos/
│   │   │   │   │   ├── UserDto.java
│   │   │   │   │   └── ProductDto.java
│   │   │   │   ├── service/
│   │   │   │   │   ├── UserService.java
│   │   │   │   │   ├── RequestFromApi.java
│   │   │   │   │   └── DataConverter.java
│   │   │   │   ├── utils/
│   │   │   │   │   ├── ConvertToUser.java
│   │   │   │   │   └── Validate.java
│   │   │   │   └── DemoStoreApplication.java
│   │   ├── resources/
│   │   │   ├── application.properties
│   │   │   └── data.sql
│   └── test/
│       └── java/
│           └── com.example.demostore/
│               ├── controller/
│               │   └── ProductControllerTest.java
│               └── service/
│                   └── ProductServiceTest.java
├── .gitignore
├── pom.xml
└── README.md
 ```
## Descrição dos Diretórios

- **src/main/java/com.example.demostore/**: Contém os pacotes principais do projeto.
    - **database/models/**: Contém as classes de modelo do banco de dados fctício em arquivo .json.
        - `User.java`: Classe de modelo para usuários.
        - `Product.java`: Classe de modelo para produtos.
    - **database/dao/**: Contém os repositórios para interação com o banco de dados.
        - `UserRepository.java`: Repositório para usuários.
        - `ProductRepository.java`: Repositório para produtos.
    - **dtos/**: Contém as classes DTO (Data Transfer Objects).
        - `UserDto.java`: DTO para usuários.
        - `ProductDto.java`: DTO para produtos.
    - **service/**: Contém as classes de serviço.
        - `UserService.java`: Serviço para usuários.
        - `RequestFromApi.java`: Classe para requisições à API.
        - `DataConverter.java`: Classe para conversão de dados.
    - **utils/**: Contém classes utilitárias.
        - `ConvertToUser.java`: Utilitário para conversão para usuário.
        - `Validate.java`: Utilitário para validação.
    - `DemoStoreApplication.java`: Classe principal da aplicação.

- **src/main/resources/**: Contém os recursos da aplicação.
    - `application.properties`: Arquivo de configuração.
    - `data.sql`: Arquivo SQL para popular o banco de dados.

- **src/test/java/com.example.demostore/**: Contém os testes da aplicação.
    - **controller/**: Contém os testes dos controladores.
        - `ProductControllerTest.java`: Testes do controlador de produtos.
    - **service/**: Contém os testes dos serviços.
        - `ProductServiceTest.java`: Testes do serviço de produtos.

- `.gitignore`: Arquivo para ignorar arquivos e diretórios no Git.
- `pom.xml`: Arquivo de configuração do Maven.
- `README.md`: Este arquivo.

## Como Executar

1. Clone o repositório.
2. Importe o projeto em sua IDE favorita.
3. Execute a classe `DemoStoreApplication.java`.

## Estado do Projeto

Este projeto ainda está em fase de desenvolvimento. Futuramente, contará com melhorias, como:

- Banco de dados próprio
- Tratamento de exceções
- Testes automatizados
- Autenticação

**Observação:** Este projeto foi criado apenas com o intuito de aprendizado da linguagem Java e do paradigma de programação orientada a objetos (OOP).

## Observações

- Este projeto é apenas um protótipo e não possui conexão com um banco de dados real.
- Apenas funcinando em linha de comando.
- A API do **FakeStore** fornece dados fictícios para simular um ambiente de e-commerce.

Sinta-se à vontade para explorar e expandir este projeto! 🛒🌟

