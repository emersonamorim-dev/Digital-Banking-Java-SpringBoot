# Digital-Banking-Java-SpringBoot 🚀 🔄 🌐

Codificação em Java para uma aplicação Digital Banking para cálculos de juros é uma aplicação SpringBoot que permite a realização de cálculo de juros compostos.

## Arquitetura

O projeto segue a arquitetura MVC, onde:
- `model` define a estrutura de dados.
- `services` define a lógica de negócios.
- `controllers` recebe as requisições e as processa utilizando os serviços.

## Design Patterns

### Service Pattern

A lógica de negócios é encapsulada em serviços, como `BankService` e `JurosService`, isolando a lógica de negócios da lógica do controlador.

### Dependency Injection

O projeto utiliza o Spring Framework, que promove a injeção de dependência, garantindo baixo acoplamento e alta coesão entre os componentes. Por exemplo, `BankService` é injetado no `BankController`.

## Princípios SOLID

### Single Responsibility Principle (SRP)

Cada classe no sistema tem uma única responsabilidade. `BankController` trata apenas das transações bancárias, enquanto `BankService` cuida da lógica relacionada a transações.

### Open/Closed Principle (OCP)

O sistema pode ser facilmente estendido para adicionar novos tipos de transações sem modificar o código existente.

### Dependency Inversion Principle (DIP)

O sistema depende de abstrações (como serviços) e não de implementações concretas.

## Programação Orientada a Objetos

A aplicação é baseada no paradigma de Programação Orientada a Objetos, usando classes e objetos para representar entidades do mundo real, como transações e juros. Isso torna o código mais modular, reutilizável e compreensível.

## Uso

### Endpoints

- `/bank/transaction`: Realize uma transação bancária.

- Corpo da Requisição em Json do Método Post:
```
{
    "type": "credit",
    "amount": 100.50
}
```
ou
```
{
    "type": "debit",
    "amount": 50.25
}
```
ou
```
{
    "type": "interest",
    "amount": 5
}
```

### Requisições

Para realizar uma transação, envie uma requisição POST com um corpo JSON contendo `type` (por exemplo, "credit" ou "debit") e `amount`.

### Conclusão

A Digital Banking Application é um exemplo robusto de como implementar uma aplicação bancária utilizando o Spring Framework, seguindo padrões de design e princípios de desenvolvimento bem estabelecidos para criar software modular e manutenível.

### Autor:
Emerson Amorim
