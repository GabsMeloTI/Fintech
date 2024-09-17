# 🌟 Solutech - Plataforma de Investimentos

Bem-vindo ao **Solutech**, uma plataforma de investimentos inovadora projetada para revolucionar a forma como indivíduos de todos os níveis de experiência gerenciam seus investimentos. Nossa missão é capacitar clientes, desde iniciantes até investidores experientes, com ferramentas e insights que os ajudem a tomar decisões financeiras informadas e alcançar seus objetivos de longo prazo.

## Prazos:
Nosso grupo estabeleceu como prazo máximo de entrega no dia 20/05/24, visando alinhar todos os detalhes do projeto e caso ainda não tenha sido finalizado, finalização do projeto em conjunto. Cada membro recebeu a responsabilidade por uma parte específica:

- [X] 550202 Gabriel Melo dos Santos assumiu a responsabilidade pela criação do diagrama de classes das novas implementações com prazo até o dia 10/05/24.

- [X] 550181 Gustavo Ferreira de Araujo assumiu a responsabilidade do desenvolvimento de query's para a entidade "User", com entrega prevista para o dia 13/05/24.

- [X] 95003 Igor Ferreira Santana foi incumbido da criação de uma query para a entidade "Investment", com entrega prevista para o dia 13/05/24.

- [X] 97757 Lucas Fernando Andrade Spinelli foi incumbido do desenvolvimento das alterações na criação do usuário e suas respectivas informações na entidade "InvestorInfo", com entrega prevista para o dia 15/05/24.

- [X] 552262 YURI CHICHEDOM IKEGWUONU foi incumbido do desenvolvimento de uma query para a entidade "Agency", com entrega prevista para o dia 13/05/24.

- [X] União do grupo para alinhamento final e retoques no projeto até o dia 19/05.


## Link do Pitch de apresentação do projeto
```
- https://youtu.be/7Wj12oKL-Cs?si=Ck-WWXJSWrJliCVe
```

## Pré-requisitos

Antes de começar, certifique-se de ter os seguintes requisitos instalados:

- **Java Development Kit (JDK)**: Certifique-se de ter o JDK 11 ou superior instalado. Você pode baixá-lo no [site oficial da Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- **Maven**: O projeto utiliza o Maven como ferramenta de build. Certifique-se de que o Maven está instalado e configurado. Você pode baixá-lo [aqui](https://maven.apache.org/download.cgi).
- **Git**: Você precisará do Git para clonar o repositório. Baixe o Git [aqui](https://git-scm.com/downloads).

## Como Rodar o Projeto

Siga os passos abaixo para rodar o projeto na sua máquina local:

### 1. Clonar o Repositório

Primeiro, clone o repositório do GitHub:

```bash
git clone https://github.com/GabsMeloTI/Fintech.git
````

### 2. Navegar até o Diretório do Projeto

Após clonar o repositório, entre no diretório do projeto:

```bash
cd Fintech
````

## Passo 3: Compilar o Projeto

Utilize o Maven para compilar o projeto. Isso irá baixar todas as dependências necessárias e compilar o código. Execute o seguinte comando:

```bash
mvn clean install
````

## Passo 4: Executar o Projeto

Após a compilação, você pode rodar o projeto usando o seguinte comando:

```bash
mvn spring-boot:run
````

## Passo 5: Acessar a Aplicação

Uma vez que a aplicação estiver rodando, você pode acessar o endpoint através da seguinte URL:

http://localhost:8080
OU
solutech-api-dqa5bxfkfjhxg5g8.brazilsouth-01.azurewebsites.net


# API Endpoints Documentation

This documentation provides an overview of the API endpoints available in the system.

## Investment Endpoints

| Resource   | Route                         | Method  | Description                                                     |
|------------|-------------------------------|---------|-----------------------------------------------------------------|
| Investment | `/investment`                 | GET     | Retrieves a list of all investments available in the system.     |
| Investment | `/investment/{id}`            | GET     | Retrieves a specific investment by its ID.                      |
| Investment | `/investment/by-name`         | GET     | Retrieves investments filtered by name.                         |
| Investment | `/investment/agency/{id}`     | POST    | Creates a new investment and assigns it to a specific agency.   |
| Investment | `/investment/{id}`            | PUT     | Updates an existing investment's details by its ID.             |
| Investment | `/investment/{id}`            | DELETE  | Deletes an existing investment from the system by its ID.       |

## Agency Endpoints

| Resource   | Route                         | Method  | Description                                                     |
|------------|-------------------------------|---------|-----------------------------------------------------------------|
| Agency     | `/agency`                     | GET     | Retrieves a list of all agencies available in the system.       |
| Agency     | `/agency/by-name`             | GET     | Retrieves agencies filtered by name.                            |
| Agency     | `/agency`                     | POST    | Creates a new agency with the provided details.                 |
| Agency     | `/agency/{id}`                | PUT     | Updates an existing agency's details by its ID.                 |
| Agency     | `/agency/{id}`                | DELETE  | Deletes an existing agency from the system by its ID.           |
| Agency     | `/agency/{id}`                | GET     | Retrieves a specific agency by its ID.                          |

## User Endpoints

| Resource   | Route                         | Method  | Description                                                     |
|------------|-------------------------------|---------|-----------------------------------------------------------------|
| User       | `/user`                       | GET     | Retrieves a list of all users in the system.                    |
| User       | `/user/{id}`                  | GET     | Retrieves a specific user by their ID.                          |
| User       | `/user`                       | POST    | Creates a new user with the provided details.                   |
| User       | `/user/{id}`                  | PUT     | Updates an existing user's details by their ID.                 |
| User       | `/user/{id}`                  | DELETE  | Deletes an existing user from the system by their ID.           |

